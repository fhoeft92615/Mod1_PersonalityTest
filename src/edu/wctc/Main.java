package edu.wctc;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	String[] questions = {"Do you prefer mild or spicy?", "Do you prefer breakfast or brunch?",
    "Do you prefer tea or coffee?", "Do you prefer cats or dogs?", "Do you prefer spring or summer?"};
	int[] choices = new int[5];

	boolean programRunning = true;

	while (programRunning) {
        int total = 0;

        //loop over questions and capture answer
        for (var i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("Enter 0 for choice on left, 1 for choice on right: ");
            choices[i] = input.nextInt();
        }

        //calculate total
        for (var j = 0; j < choices.length; j++) {
            total += choices[j];
        }

        //display message based on score
        displayTotal(total);

        //ask to rerun or end
        System.out.println("Do you want to take the test again?");
        System.out.println("Enter 0 to restart, or 1 to end: ");
        int restart = input.nextInt();

        if (restart == 1) {
            programRunning = false;
        }
    }

    }

    private static void displayTotal(int total) {
        if (total < 3) {
            System.out.println("Your score is " + total + ". You prefer a more relaxed and quiet life");
        } else if (total == 3) {
            System.out.println("Your score is " + total + ". You prefer balance in your life. You like some spontaneity, " +
                    "but you take time to smell the roses.");
        } else {
            System.out.println("Your score is " + total + ". You like a lot of excitement in your life, " +
                    "and you have the most enjoyment when you're on the go!");
        }
    }
}
