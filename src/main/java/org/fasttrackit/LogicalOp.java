package org.fasttrackit;

import java.util.Scanner;

public class LogicalOp {

    Scanner userInput = new Scanner(System.in);

    public void countToOneHundred() {
        System.out.println("Please enter a number: ");
        int userNumber = userInput.nextInt();

        if (userNumber < 100) {
            for (int i = userNumber; i <= 100; i++) {
                System.out.print(i + " ");
            }
        } else if ( userNumber > 100){
            for (int i = userNumber; i >= 100; i--) {
                System.out.print(i + " ");
            }
        }

    }

}
