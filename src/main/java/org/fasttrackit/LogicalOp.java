package org.fasttrackit;

import java.util.Scanner;

public class LogicalOp {

    Scanner userInput = new Scanner(System.in);

    public void countToOneHundred(int toNumber) {
        System.out.print("Please enter a number: ");
        int userNumber = userInput.nextInt();

        if (userNumber < toNumber) {
            for (int i = userNumber; i <= toNumber; i++) {
                System.out.println(i + " ");
            }
        } else if ( userNumber > toNumber){
            for (int i = userNumber; i >= toNumber; i--) {
                System.out.println(i + " ");
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

    public void oddNumbers(){
        System.out.print("The odd numbers are:");
        for ( int i = 1; i <= 100 ; i++){
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void  evenNumbers() {
        System.out.print("The even numbers are: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public int sumOfDigits(){
        System.out.println("Please enter a number.");
        int userNumberA = userInput.nextInt();
        int total = 0;
        for (int i = userNumberA; i <= 100; i++ ) {
            total += i;
        }
        System.out.println("Sum is: " + total);
        return total;
    }

    public int averageOfDigits(){

        System.out.println("Please enter a number.");
        int userNumberA = userInput.nextInt();
        int total = 0;
        int numberCount = 0;
        int average = 0;
        for (int i = userNumberA; i <= 100; i++ ) {
            total += i;
            numberCount++;
            average = total/numberCount;
        }
        System.out.println("Average is: " + average);
        return average;

    }

    public void starsPrint() {
        for(int i = 7; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
