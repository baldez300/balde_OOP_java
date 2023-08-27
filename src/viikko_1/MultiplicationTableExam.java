package viikko_1;

/*
     In primary school, students must memorize the multiplication tables for numbers 1 to 10.
     Create a program to assist primary school students
     that presents the user with ten randomly generated multiplication problems,
     where the factors are integers between one and ten.
     After each answer, the program indicates whether it was correct or not.
     The user receives one point for each correctly answered question.
     If the user scores ten points for the entire set of problems,
     the program congratulates them on mastering the multiplication tables and terminates.
     Otherwise, the program starts a new set of problems.
*/

import java.util.Scanner;
import java.util.Random;

public class MultiplicationTableExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int points = 0;
        int correctAnswers = 0;
        int wrongAnswers = 0;
        int numberOfQuestions = 10;

        while (points < numberOfQuestions) {
            int firstFactor = random.nextInt(10) + 1;
            int secondFactor = random.nextInt(10) + 1;
            int correctAnswer = firstFactor * secondFactor;

            System.out.print(firstFactor + " * " + secondFactor + " = ");
            int answer = Integer.parseInt(scanner.nextLine());

            if (answer == correctAnswer) {
                points++;
                correctAnswers++;
                System.out.println("Correct!");
            }
            else {
                wrongAnswers++;
                System.out.println("Wrong! The correct answer is " + correctAnswer + ".");
            }
        }

        System.out.println("Congratulation! You got "+ correctAnswers +" correct and "+ wrongAnswers +" wrong.");
        System.out.println("You got "+ points + " points.");

        scanner.close();
    }
}
