package com.addressbook;



import java.util.Scanner;

public class addressBook {

    public static void main(String[] args) {

        System.out.println("Welcome to address Book");
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter your firstname,lastname,city,phone number,zipcode");
        contacts c1= new contacts(s1.nextLine(),s1.nextLine(),s1.nextLine(),s1.nextLong(),s1.nextInt());
        Scanner s2=new Scanner(System.in);
        System.out.println("Please enter the details of second contact(firstname,lastname,city,phone number,zipcode)");
        contacts c2= new contacts(s2.nextLine(),s2.nextLine(),s2.nextLine(),s2.nextLong(),s2.nextInt());
        Scanner s3=new Scanner(System.in);
        System.out.println("Please enter the details of third contact(firstname,lastname,city,phone number,zipcode)");
        contacts c3= new contacts(s3.nextLine(),s3.nextLine(),s3.nextLine(),s3.nextLong(),s2.nextInt());

        System.out.println("Please press any number to delete contact");
        Scanner s=new Scanner(System.in);
        String name=s.next();
        
      
        System.out.println("enter the contact firstname whose number need to be deleted ");
        String name1=s.next();
        if(name1.equals(c1.firstname))
        {
            c1.firstname=  null;
            System.out.println("Contact deleted");
        }
         if(name1.equals(c2.firstname))
        {
            c2.firstname= null;
            System.out.println("Contact deleted");
        }
        if(name1.equals(c3.firstname))
        {
            c3.firstname= null;
            System.out.println("Contact deleted");
        }

        
    }
        }



    