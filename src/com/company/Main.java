package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("iveskite sveika skaiciu");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        if (a % 7 == 0) {
            System.out.println("dalinasi is septyniu");
        }
        if (a % 5 == 0) {
                System.out.println("skaicius dalinasi is penkiu");

            }
           else if (a % 3 ==0){
            System.out.println("skaicius dalinasi is triju");

        }
        else{
            System.out.println("skaicius nesidalina is 3 , 5 , 7" );
        }
        }
}




        // write your code here


