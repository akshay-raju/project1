package com.Assignment1;
import java.util.*;
import java.util.Scanner;
public class ExecPhone{
 
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the entries");
  int n=scan.nextInt();
  ArrayList<String> a1=new ArrayList<String>(n);
  ArrayList<String> a2=new ArrayList<String>(n);
  ArrayList<String> a3=new ArrayList<String>(n);
  
  for(int i=0;i<n;i++) {
   System.out.println("Enter name of the person");
   String name=scan.next();
   a1.add(name);
   System.out.println("Enter primary mobile number");
   String num1=scan.next();
   a2.add(num1);
   System.out.println("Enter secondary mobile number");
   String num2=scan.next();
   a3.add(num2);
  }
  
  /*for(int i=0;i<n;i++) {
   System.out.println("Name: " +a1.get(i)+" Number 1: "+a2.get(i)+" Number 2: "+a3.get(i));
  }*/
  
  System.out.println("Enter the name to search");
  String sea=scan.next();
  for(int i=0;i<n;i++) {
   if(sea.equals(a1.get(i))) {
    System.out.println("Number 1: " +a2.get(i)+" Number 2: "+a3.get(i));
   }
   
  }
  
 }

}
