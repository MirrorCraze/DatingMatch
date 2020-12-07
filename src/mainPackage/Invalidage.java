package mainPackage;

public class Invalidage extends Exception {
	   public Invalidage() { super("Wrong age input!"); }
	   public Invalidage(String message) { super(message); }

}
