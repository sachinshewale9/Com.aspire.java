package com.aspire.java.logicalPrograms;

import java.util.Scanner;

public class ATMScanner
{
public static void main(String[] args) 
  {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the password");
  int pwd=  scan.nextInt();
  System.out.println("Enter the amount ");
  int amt= scan.nextInt();
  System.out.println("PAssword is="+pwd);
  System.out.println("Amount is="+amt);
  }
}