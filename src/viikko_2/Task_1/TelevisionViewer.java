package viikko_2.Task_1;

/*
    Task 1: Television class

    Implement class Television that together with TelevisionViewer produces the following output:

    Woke up, day 1
    Watching channel 1
    Watching channel 2
    Watching channel 3
    Falling asleep
    Woke up, day 2
    Watching channel 4
    Watching channel 5
    Watching channel 6
    Watching channel 7
    Falling asleep
    Woke up, day 3
    Watching channel 8
    Watching channel 9
    Watching channel 10
    Watching channel 1
    Watching channel 2
    Watching channel 3
    Falling asleep
    Woke up, day 4
    Watching channel 4
    Watching channel 5
    Watching channel 6
    Watching channel 7
    Falling asleep
    Woke up, day 5
    Watching channel 8
    Watching channel 9
    Watching channel 10
    Watching channel 1
    Watching channel 2
    Watching channel 3
    Falling asleep
    Woke up, day 6
    Watching channel 4
    Watching channel 5
    Watching channel 6
    Watching channel 7
    Falling asleep
    Woke up, day 7
    Watching channel 8
    Watching channel 9
    Watching channel 10
    Watching channel 1
    Watching channel 2
    Watching channel 3
    Falling asleep
    Woke up, day 8
    Watching channel 4
    Watching channel 5
    Watching channel 6
    Watching channel 7
    Falling asleep
    Woke up, day 9
    Watching channel 8
    Watching channel 9
    Watching channel 10
    Watching channel 1
    Watching channel 2
    Watching channel 3
    Falling asleep
    Woke up, day 10
    Watching channel 4
    Watching channel 5
    Watching channel 6
    Watching channel 7
    Falling asleep
    Remember to capitalize on all class names (e.g., Television).
    Start variable names with lower case letters (e.g., channel).
    Use descriptive names for classes, instance variables, methods, and variables.
*/

public class TelevisionViewer {
    public static void main(String[] args) {
        Television myTV = new Television();
        myTV.setChannel(1);

        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);

            boolean tired = false;

            if (!myTV.isOn())
                myTV.pressOnOff();

            while (!tired) {
                System.out.println("Watching channel " + myTV.getChannel());
                myTV.setChannel(myTV.getChannel() % 10 + 1);
                if (myTV.getChannel() % 4 == 0)
                    tired = true;
            }

            myTV.pressOnOff();

            System.out.println("Falling asleep");
        }
    }
}


