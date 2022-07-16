package com.addressbook;



import java.util.Scanner;

public class addressBook {

    public static void main(String[] args) {

        System.out.println("Welcome to address Book");
        Scanner s1=new Scanner(System.in);
        System.out.println("please enter the details of first contact(firstname,lastname,city,state and phone number)");
        contacts c1= new contacts(s1.nextLine(),s1.nextLine(),s1.nextLine(),s1.nextLong());
        Scanner s2=new Scanner(System.in);
        System.out.println("Please enter the details of second contact(firstname,lastname,city,state and phone number)");
        contacts c2= new contacts(s2.nextLine(),s2.nextLine(),s2.nextLine(),s2.nextLong());
        Scanner s3=new Scanner(System.in);
        System.out.println("Please enter the details of third contact(firstname,lastname,city,state and phone number)");
        contacts c3= new contacts(s3.nextLine(),s3.nextLine(),s3.nextLine(),s3.nextLong());


        }



    }