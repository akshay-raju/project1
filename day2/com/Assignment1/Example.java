package com.Assignment1;

abstract class Example {

	
		   Example()
		   {
			   System.out.println("bike is created");
			   }
		   abstract void run();
		  
		 }

		 class Honda extends Example
		 {
		  void run()
		 {
			 System.out.println("running safely..");
			 }
		 }
		class Honda1 extends Example
		{
		   void run()
		    { 
			 System.out.println("running safely honda1..");
			 }
		   void changeGear()
		   {
			   System.out.println("gear changed");
			   }

		}

