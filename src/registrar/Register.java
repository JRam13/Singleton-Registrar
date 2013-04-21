package registrar;

import java.util.Scanner;

public class Register {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Registrar newRegistrar = new Registrar();
		int option = 0;
		
		//Registrar.getInstance();
		System.out.println("===========================================");
		System.out.println("Register For Classes");
	    System.out.println("===========================================\n");
	     
		while (option != 2) {
			System.out.println();
	        System.out.println("What would you like to do: ");
	        System.out.println("--------------------------");
	        
	        System.out.println("1) Register");
	        System.out.println("2) Exit");
	        
	        Scanner scn = new Scanner(System.in); 
			System.out.println("Choose a number: ");
			try {
				option = scn.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
		
			if(option == 1){
				System.out.println();
				Registrar.getInstance();
			}
			else if(option == 2){
				System.out.println("Goodbye.");
				System.exit(1);
			}
			else{
				System.err.println("Please select a valid option");
			}
		}
    	

    }

}
