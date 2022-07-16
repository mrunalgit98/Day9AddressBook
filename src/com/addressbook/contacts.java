package com.addressbook;


import java.util.Scanner;

 class contacts {
     String firstname;
     String lastname;
     String city;
     long phoneNumber;


    public contacts(String firstname,String lastname,String city,long phoneNumber)
     {
         System.out.println("The Contact Details are as follows");
         this.firstname=firstname;
         this.lastname=lastname;
         this.city=city;
         this.phoneNumber=phoneNumber;

         System.out.println("Name of the contact is : "+this.firstname+" "+this.lastname);
         System.out.println("City is "+this.city);
         System.out.println("Phone number= "+this.phoneNumber);

     }



}

