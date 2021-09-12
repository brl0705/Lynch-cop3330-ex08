package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int people;
        int pizza;
        int slices;
        int leftovers;

        Scanner input1 = new Scanner(System.in);
        System.out.println("How many people are at the party?");
        people = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("How many pizzas do you have?");
        pizza = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("How many slices per pizza?");
        slices = input3.nextInt();

        int totalSlices=pizza*slices;
        int x=totalSlices/people;

        if(x>1)
        {
            System.out.println("Everyone gets " + x + " pieces of pizza.");
        }
        else
        {
            System.out.println("Everyone gets " + x + " piece of pizza.");
        }
        System.out.println("There are 0 leftover pieces.");




    }
}
