package QuantityMeasurementApp;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeasurementApplication {

	
	    // Inner class Feet
	    static class Feet {
	        private final double value; 

	        // Constructor
	        public Feet(double value) {
	            this.value = value;
	        }

	        // Override equals method
	        @Override
	        public boolean equals(Object obj) {

	            // Check if same reference
	            if (this == obj) {
	                return true;
	            }

	            // Check for null or different class
	            if (obj == null || getClass() != obj.getClass()) {
	                return false;
	            }

	            // Cast object to Feet
	            Feet other = (Feet) obj;

	            // Compare values using Double.compare
	            return Double.compare(this.value, other.value) == 0;
	        }
	      

	    // Main method
	    public static void main(String[] args) {

	        // Creating two Feet objects
	        Feet f1 = new Feet(1.0);
	        Feet f2 = new Feet(1.0);
	        

	       
	       
	        System.out.println(f1.equals(f2));
	    }
	}

}
