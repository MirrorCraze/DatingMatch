package mainPackage;

public class InvalidminAge extends Exception {
	   public InvalidminAge() { super("Wrong minimum age!"); }
	   public InvalidminAge(String message) { super(message); }
}
