package mainPackage;

public class InvalidmaxAge extends Exception {
	   public InvalidmaxAge() { super("Wrong maximum age!"); }
	   public InvalidmaxAge(String message) { super(message); }

}
