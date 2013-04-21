package registrar;

public class Registrar {
	static java.util.Date now;
	private static Registrar myRegistrar;
	
	
	   private Registrar() {
	      // Exists only to defeat instantiation.
		   now = new java.util.Date();
	   }
	  
	   
	   public static Registrar getInstance() {
	      if(myRegistrar == null) {
	         myRegistrar = new Registrar();
	         System.out.println("Created New Registrar At: ");
	         System.out.println(now.toString());
	      }
	      else{
	    	  System.err.println("Registrar Already Exists.");
	    	  System.err.println("Current Registrar: " + now.toString());
	      }
	     
	      return myRegistrar;
	   }
	}