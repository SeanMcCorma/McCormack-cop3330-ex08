package com.company;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sean McCormack
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many people? ");
        int people = Integer.parseInt(scan.nextLine());
        System.out.print("How many pizzas do you have? ");
        int pizzas = Integer.parseInt(scan.nextLine());
        System.out.print("How many slices per pizza? ");
        int slices = Integer.parseInt(scan.nextLine());
        int total_slices=pizzas*slices;
        System.out.println(people + " people with "+pizzas+" pizzas ("+total_slices+")");
        int pieces = total_slices/people;
        System.out.println("Each person gets "+pieces+" pieves of pizza.");
        int leftover= total_slices-(pieces*people);
        System.out.println("There are "+leftover+" leftover pieces");
        // write your code here
    }
}
