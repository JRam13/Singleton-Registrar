package registrar;

import java.util.Scanner;

public class Register {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Registrar newRegistrar = new Registrar();
		int option = 0;
		Boolean isOpened = false;
		
		//Registrar.getInstance();
		System.out.println("===========================================");
		System.out.println("Register For Classes");
	    System.out.println("===========================================\n");
	     
		while (option != 2 && !isOpened) {
			System.out.println();
	        System.out.println("What would you like to do: ");
	        System.out.println("--------------------------");
	        
	        System.out.println("1) Open Registrar");
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
				isOpened = true;
			}
			else if(option == 2){
				System.out.println("Goodbye.");
				System.exit(1);
			}
			else{
				System.err.println("Please select a valid option");
			}
		}
		
		while (option != 3 && isOpened) {
			System.out.println();
	        System.out.println("What would you like to do: ");
	        System.out.println("--------------------------");
	        
	        System.out.println("1) Open Registrar");
	        System.out.println("2) Register");
	        System.out.println("3) Exit");
	        
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
				isOpened = true;
			}
			else if(option == 2){
				System.out.println();
				register();
			}
			else if(option == 3){
				System.out.println("Goodbye.");
				System.exit(1);
			}
			else{
				System.err.println("Please select a valid option");
			}
		}
    	

    }
	
	private static void register(){
		Registrar.registerClasses();
	}

}
