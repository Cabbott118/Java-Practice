
// Import Java utils
import java.util.*;
import java.util.concurrent.TimeUnit;

class QuickStart {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Intro
            System.out.println("Let's play a game.");
            System.out.println("Would you like to play? (y/n)");

            // Take in user's input and lowercase it
            char choice = scanner.next().charAt(0);
            char lowercaseChoice = Character.toLowerCase(choice);

            // Send lowercased choice through switch
            switch (lowercaseChoice) {
                case 'y':
                    System.out.println("Awesome, let's begin!");
                    System.out.println("What's your favorite number?");

                    if (scanner.hasNextInt()) {
                        // Store favorite number
                        int favNum = scanner.nextInt();

                        // Start for loop, begin at 1, end at favNum
                        for (int i = 1; i <= favNum; i++) {
                            try {
                                // Pause for 1sec between iterations to *think*
                                TimeUnit.SECONDS.sleep(1);
                                // If iteration doesn't equal favNum, concat ...
                                if (i != favNum) {
                                    System.out.println(i + "...");
                                }
                                // When condition is met, concat !!! and print finished line
                                else {
                                    System.out.println(i + "!!!");
                                    System.out.println("All done counting up to your favorite number!");
                                }
                                // Catch errors
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        System.out.println("Sorry, that wasn't a number. I'm kicking you out, RULE BREAKER!");
                    }
                    break;
                case 'n':
                    System.out.println("I'm sorry to hear that, maybe later!");
                    break;
                default:
                    System.out.println("Error");

            }
        }
    }
}