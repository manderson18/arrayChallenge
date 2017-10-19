package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here



//int grades[] = {90,95,100};

       // double average = (grades[0] + grades[1] + grades[2]) / 3;
       // System.out.println(average); // Challenge 1





        double userGrades[] = new double[2000000];

        Scanner kbin = new Scanner(System.in);

        int i= 0;

        for(i=0;i < userGrades.length; i++ ){
            System.out.println("Please enter a Grade");

            int arrayInput = kbin.nextInt();

            userGrades[i] = arrayInput;
            System.out.println(arrayInput/i+1);


        }









    }
}
