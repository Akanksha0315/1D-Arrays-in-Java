package scaling;
//importing io package
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * NAME: Akanksha Kakar 
 * PROFESSOR: Seth Volpe 
 * DATE: 01/26/2021
 * ASSIGNMENT: Lab1
 * ASSIGNMENT DESCRIPTION: Program to input data and scale data based on the largest input
 * @author akku
 */

//start of class 
public class Scaling {
    //start of main method
    public static void main (String args[])throws IOException{
        System.out.println("The Array List is as follows:");
        //initializing required variables 
        double largest = 0.0;
        double a[] = new double[10];
        double b[] = new double[10];
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //taking input from user 
        System.out.println(" ");
        System.out.println("Enter 10 numbers into array");
        for(int i = 0; i < 10; i++){
            a[i] = Double.parseDouble(br.readLine());
        }
        //displaying array and finding largest value in array
        
        //just in case all elements are negative
        largest = a[0];
        //printing all elements of the array 
        System.out.println("The Array List is as follows:");   
        for(int i = 0; i < 10; i++){  
           if(i != 9){
             System.out.print(a[i] + ", ");  
           }
           else{
            System.out.println(a[i]);    
           }//end of if-else statement 
           //finding the largest value in the array
           if (a[i] > largest){
               largest = a[i];
           }//end of if statement          
        }//end of for loop
        System.out.println("Largest number: " + largest);
        System.out.println(" ");
        System.out.println("Scaled elements of array are as follows: ");
        //scaling data based on largest value
        //start for loop
        for(int i = 0; i < 10; i++){
            b[i] = a[i]/largest;
            if(i != 9){
             System.out.print(b[i] + ", ");  
           }
            else{
            System.out.println(b[i]);    
           }//end of if-else statement        
        }//end of for loop
    }//end of main method
}//end of class 
