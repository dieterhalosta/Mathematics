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

}
