/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.example;
import java.util.Scanner;

public class SayingHello
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.nextLine();
        String greeting = "\nHello, " + name + ", nice to meet you!";
        System.out.println(greeting);
    }
}
