package com.pluralsight;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        //creating accounts
        // viewing accounts
        //  viewing videos
        // liking vidoes
        // commenting videos

        //create variables for user information
        // username, password, email, follower account

        int userid = 99348;
        String Username =" ";
        String correctUsername = "Fay";
        String Password = " ";
        String correctPassword = "1234";
        String Email = " ";
        int followers = 0;
        int following = 0;
        boolean IsVerified = true;
        boolean IsBanned = false;
        boolean Isactive = true;
        boolean IsPublic = true;
        int videolikes = 20000;
        boolean Isloggedin = true;

        //show text "Welcome to TikTok would you like to log in?"

        System.out.println("Welcome to TikTok would you like to log in?");

        Scanner myscanner = new Scanner(System.in);

        //ask for username
        System.out.println("What is your username?:");
        Username = myscanner.next();

        // ask for password
        System.out.println("Please enter your password:");
        Password = myscanner.next();

        if (Password.equals(correctPassword) && Username.equals(correctUsername)){
            System.out.println("Logged in Succesfully");
            System.out.println("Hi " + Username +  ", Welcome back!");
            Isloggedin = true;

        }

        else {
            System.out.println("Password/Username incorrect");
            Isloggedin = false;

        }

        int numb1 = 10;
        int numb2 = 15;
        int total = numb1 + numb2;

        System.out.println(numb1 + " + " + numb2 + " = " + total);








    }
}