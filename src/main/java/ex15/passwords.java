/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Connor Stanley
 */

package ex15;

import java.util.Scanner;

public class passwords {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Asking for input in string form
        System.out.print("What is your username? ");
        String knownUserName = in.nextLine();
        System.out.print("What is the password? ");
        String knownPassWord = in.nextLine();



        System.out.print("What is your username? ");
        String userName = in.nextLine();
        while (userName.equals(knownUserName)){

            System.out.print("What is the password? ");
            String passWord = in.nextLine();
            if (passWord.equals(knownPassWord)){

                System.out.print("Welcome!.\n");
                userName = "------";


            }else{

                System.out.print("I don't know you.\n");

            }
        }

    }

}
