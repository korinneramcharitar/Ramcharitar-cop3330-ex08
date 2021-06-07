
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */
package base;
//Division isn’t always exact, and sometimes you’ll write programs that will need to deal with the leftovers as a whole number instead of a decimal.
//
//Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas, and the number of slices per pizza. Ensure that the number of pieces comes out even. Display the number of pieces of pizza each person should get. If there are leftovers, show the number of leftover pieces.

//How many people? 8
//How many pizzas do you have? 2
//How many slices per pizza? 8
//8 people with 2 pizzas (16 slices)
//Each person gets 2 pieces of pizza.
//There are 0 leftover pieces.

//Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
//Alter the output so it handles pluralization properly, for example: "Each person gets 2 pieces of pizza." or "Each person gets 1 piece of pizza." Handle the output for leftover pieces appropriately as well.
//Create a variant of the program that prompts for the number of people and the number of pieces each person wants, and calculate how many full pizzas you need to purchase.

import java.text.DecimalFormat;
import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many people?");
        String people = input.nextLine();
        System.out.println("How many pizzas do you have?");
        String pizzas = input.nextLine();
        System.out.println("How many slices per pizza?");
        String slices = input.nextLine();
        int a = Integer.parseInt(people);
        int b = Integer.parseInt(pizzas);
        int c = Integer.parseInt(slices);
        int pieces = (c * b);
        System.out.println(people + " people with " + pizzas + " pizzas." + "(" + pieces +" slices)");


        DecimalFormat formatter = new DecimalFormat("#0");

        int even = ((c*b)/a);
        int k = (even % a);
        System.out.println("Each person gets " + even + " pieces of pizza.");
        System.out.println("There are " + k +  " leftover pieces.");
    }
}
