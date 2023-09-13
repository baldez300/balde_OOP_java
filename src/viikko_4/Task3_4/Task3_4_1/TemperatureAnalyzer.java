package viikko_4.Task3_4.Task3_4_1;

/*
    Task 1: Read a CSV file from the network location

    There is a network file (https://users.metropolia.fi/~jarkkov/temploki.csv) or
    (https://users.metropolia.fi/~olliv/olio/korvike.csv)
    where we have periodical temperature measurements at 10 minutes interval.
    Create an application which reads the file, reads the 'Ulkotalo' column,
    and calculates the average temperature for the 1st day of January 2023.

    ===================================================
    Step 2: Add External Libraries
    Download and add the Apache Commons CSV library (commons-csv) to your project.
    You can download it from the Apache Commons website or
     use a build tool like Maven or Gradle to manage dependencies.

     To verify that the library has been added successfully,
     you can write a test program that imports classes from the Apache Commons CSV library.
     If you can import these classes without errors,
     it means the library is correctly configured in your project.

    Here's a simple test program you can use:

    import org.apache.commons.csv.CSVFormat;

    public class TestCommonsCSV {
        public static void main(String[] args) {
            System.out.println(CSVFormat.DEFAULT);
        }
    }
*/


import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TemperatureAnalyzer {
    public static void main(String[] args) {
        // URL of the CSV file
        String csvFileURL = "https://users.metropolia.fi/~olliv/olio/korvike.csv";

        // Date format for parsing dates from the CSV file
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        try {
            // Create a CSVParser with header mapping
            CSVParser csvParser = CSVParser.parse(
                    new URL(csvFileURL),  // CSV file URL
                    StandardCharsets.UTF_8,  // Charset
                    CSVFormat.EXCEL.withHeader()  // Specify that the first row is the header
            );

            double sum = 0.0;
            int count = 0;

            // Iterate through CSV records
            for (CSVRecord record : csvParser) {
                String dateStr = record.get("Date");

                try {
                    Date date = dateFormat.parse(dateStr);

                    // Check if the date is on the 1st day of January 2023
                    if (isFirstDayOfJanuary2023(date)) {
                        // Access the 'Ulkotalo' column and parse it as a double
                        double temperature = Double.parseDouble(record.get("Ulkotalo"));
                        sum += temperature;
                        count++;
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }

            // Calculate and print the average temperature
            if (count > 0) {
                double averageTemperature = sum / count;
                System.out.println("Average Temperature on the 1st day of January 2023: " + averageTemperature);
            } else {
                System.out.println("No temperature measurements found for the 1st day of January 2023.");
            }

            // Close the CSVParser when done
            csvParser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isFirstDayOfJanuary2023(Date date) {
        SimpleDateFormat dayMonthYearFormat = new SimpleDateFormat("dd-MM-yyyy");

        return "01-01-2023".equals(dayMonthYearFormat.format(date));
    }
}




