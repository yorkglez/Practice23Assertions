package com.practice24assertions.app;

import java.util.Scanner;

public class AssertionsApp {
    public static void main(String[] args) {
        //Variables declaration
        int age = 0;

        //Objec declaration
        Scanner in = new Scanner(System.in);

        System.out.println("You are > 18? Write your age");
        age = in.nextInt();
        System.out.println(IsMayor(age));
    }

    public static  String IsMayor(int age)
    {
        String cad = "";

        //Assert implement
        assert  age > 0: "Invalid age";

        //Validate age
        if(age < 18)
        {
            return cad;
        }

        if(age >= 18)
        {
            return cad;
        }

        return cad;
    }
}


