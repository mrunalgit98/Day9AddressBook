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

        
        Scanner s=new Scanner(System.in);
        System.out.println("enter the contact firstname to edit");
        String name=s.next();
        
        if(name.equals(c1.firstname)) {
        	System.out.println("enter the PhoneNo to be edited for " +c1.firstname);
        	c1.phoneNumber=s.nextLong();
        	System.out.println("Updated detail " +c1.firstname+c1.lastname + ",City " +c1.city + " PhoneNumber: " + c1.phoneNumber + " zipcode" + c1.zipcode);
        }
         if(name.equals(c2.firstname)){
        	System.out.println("enter the PhoneNo to be edited for " +c2.firstname);
        	c2.phoneNumber=s.nextLong();
        	System.out.println("Updated detail" +c2.firstname+c2.lastname + ",City " +c2.city + " PhoneNumber: "+ c2.phoneNumber + " zipcode " +c2.zipcode );
        }if(name==(c3.firstname)) {
      System.out.println("enter the PhoneNo to be edited for " +c3.firstname);
        	c3.phoneNumber=s.nextLong();
        	System.out.println("Updated detail" +c3.firstname+c3.lastname + ",City " +c3.city + " PhoneNumber :"+ c3.phoneNumber +  " zipcode " +c3.zipcode );
        }
        
        }



    }