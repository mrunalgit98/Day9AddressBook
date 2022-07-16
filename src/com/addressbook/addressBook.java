package com.addressbook;



import java.util.Scanner;

public class addressBook {

    public static void main(String[] args) {

        System.out.println("Welcome to address Book");
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter your firstname,lastname,city,phone number,zipcode");
        contacts c1= new contacts(s1.nextLine(),s1.nextLine(),s1.nextLine(),s1.nextLong(),s1.nextInt());
        
        }



    }