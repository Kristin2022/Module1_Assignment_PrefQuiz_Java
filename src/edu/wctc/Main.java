package edu.wctc;
/*
Accept and clone the assignment from GitHub Classroom using the following link: https://classroom.github.com/a/pOsNUZlhLinks to an external site.

Create a one file program that prompts the user a minimum of five times to indicate their preference between two unique choices.  Possible choices include but are not limited to:

mild or spicy
tea or coffee
breakfast or brunch
summer or winter
paper or plastic
Prompt the user to enter 0 or 1: where 0 is for the choice on the left and 1 is for the choice on the right.  Given this structure, the user will end with a score of 0 through 5.  If the score is less than 3, exactly 3, or greater than 3, print messages to the user indicating something about their personality based on the choices they've made.  For example:

Score less than 3: "You prefer life to be calm and organized"
Score greater than 3: "You prefer life to be spontaneous and active"
Score exactly 3: "You prefer a good balance in life."
Try to organize your choices on the left and right for the user so that the resulting message seems plausible.

After the score and message are printed, ask the user if they want to run the program again.
 */

import java.util.Scanner;

public class Main {
    private static final Scanner keyboard = new Scanner(System.in);
//
    //create an additional method
    //array String
    private static int askQuestions() {
        String[] questions = {
                "Do you prefer mild or spicy?",
                "Do you prefer tea or coffee?",
                "Do you prefer breakfast or brunch?",
                "Do you prefer summer or winter?",
                "Do you prefer paper or plastic?"
        };
        // get vallidated 0 or 1 response from user input
        //initialize to 0
        int sum = 0; //int variable
        int number = 0; //int variable
        //for loop that iterates over the elements of the question array
        for (String question : questions) {
            System.out.println(question);
            System.out.println("Enter 0 for the preference on the left of the question.");
            System.out.println("Enter 1 for the preference on the right of the question.");

            if (!keyboard.hasNextInt()) {
                System.out.println("Error, Please enter either 0 or 1.");
                keyboard.next();

            } else {
                number = keyboard.nextInt();
                while (number != 0 && number != 1){
                    System.out.println("Error, please enter the correct input");
                    number = keyboard.nextInt();
                }
                System.out.println("You entered: " + number);
                sum += number;

               /* System.out.println("Invalid input. Please enter either 0 or 1.");
                keyboard.next(); // discard invalid input*/
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int retakeQuiz = 0;

        do {
            System.out.println("Welcome to Preference Quiz");
            System.out.println("===============================");
            //use variable from method to get result
            int sum = askQuestions();
                
            if (sum < 3) {
                System.out.println("You prefer life to be calm and organized.");
            } else if (sum == 3) {
                System.out.println("You prefer a good balance in life.");
            } else {
                System.out.println("You prefer life to be spontaneous and active.");
            }

            System.out.println("If you would like to take the quiz again enter 1 or 0 to exit.");
            if(keyboard.hasNextInt()){
                retakeQuiz = keyboard.nextInt();
            }
        } while (retakeQuiz == 1);
        System.out.println("Thank you for taking the preference quiz!");

        keyboard.close();
    }
}



