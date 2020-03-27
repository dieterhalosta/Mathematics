package org.fasttrackit;

import java.util.Scanner;

public class LogicalOp {

    Scanner userInput = new Scanner(System.in);

    public void countToOneHundred(int toNumber) {
        System.out.print("Please enter a number: ");
        int userNumber = userInput.nextInt();

        if (userNumber < toNumber) {
            for (int i = userNumber; i <= toNumber; i++) {
                System.out.print(i + " ");
            }
        } else if ( userNumber > toNumber){
            for (int i = userNumber; i >= toNumber; i--) {
                System.out.print(i + " ");
            }
        }

    }

    public void countBetweenTwoNumbers() {
        System.out.println("Please enter the first number.");
        int userNumber1 = userInput.nextInt();
        System.out.println("Please enter the second number.");
        int userNUmber2 = userInput.nextInt();

        if ( userNumber1 < userNUmber2) {
            for ( int i = userNumber1; i < userNUmber2; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = userNumber1; i > userNUmber2; i--) {
                System.out.print(i + " ");
            }
        }
    }

}
