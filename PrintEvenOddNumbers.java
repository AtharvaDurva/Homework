package Homework;

import org.w3c.dom.ls.LSOutput;

public class PrintEvenOddNumbers {
    public static void main(String[] args) {

        System.out.println("------first 10 even numbers --------");
        for(int i=0;i<=10;i++){

            System.out.println("Even number is "  +  (2*i));

        }

        System.out.println("---------first 10 odd numbers---------");
        for(int i=1;i<=10;i++){

                System.out.println("Odd number is " + (2*i-1));
        }

}}
