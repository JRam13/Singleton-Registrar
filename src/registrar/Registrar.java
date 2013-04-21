package registrar;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;

public class Registrar {
	static java.util.Date now;
	private static Registrar myRegistrar;
	private static Hashtable<String,Integer> classes;
	
	
	   private Registrar() {
		   
		   now = new java.util.Date();
		   classes = new Hashtable<String,Integer>();
		   
		   classes.put("Algorithms", 3);
		   classes.put("Object Oriented Design", 0);
		   classes.put("Networks", 1);
		   classes.put("Databases", 2);
		   classes.put("iOS Development", 4);
	   }
	  
	   
	   public static Registrar getInstance() {
	      if(myRegistrar == null) {
	         myRegistrar = new Registrar();
	         System.out.println("Created New Registrar At: ");
	         System.out.println(now.toString());
	      }
	      else{
	    	  System.err.println("Registrar Already Opened.");
	    	  System.err.println("Current Registrar: " + now.toString());
	      }
	     
	      return myRegistrar;
	   }
	   
	   public static void registerClasses(){
		   
		   String currClass = null;
		   int option = 0;
		   
		   Iterator<String> iterator = classes.keySet().iterator();  
		   Iterator<String> iterator2 = classes.keySet().iterator();  
		   
		   System.out.println("Choose a class to register: ");
	        System.out.println("--------------------------");
	        
	        System.out.println("Class Name || Available Seats");
	        System.out.println();
		   
		   int count=1;
		   while (iterator.hasNext()) {  
		      String key = iterator.next().toString();  
		      String value = classes.get(key).toString();  
		      
		      System.out.println(count + ") " + key + " || " + value);  
		      count++;
		   }  
		   Scanner scn = new Scanner(System.in); 
		   System.out.println("Choose a number: ");
			
			try {
				option = scn.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
			count=1;
			   while (iterator2.hasNext()) {  
				   if(count == option){
					   currClass = iterator2.next().toString(); 
				   }
				   iterator2.next();
			      count++;
			   }  
			   if(classes.get(currClass) == 0){
				   System.err.println("Student not registered. " + currClass + " is full.");
			   }
			   else{
				   classes.put(currClass, classes.get(currClass) - 1);
				   System.err.println("Student is now registered for " + currClass);
			   }
	   }
	}