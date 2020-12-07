package mainPackage;

public class Invalidyear extends Exception {
	   public Invalidyear() { super("Wrong year!"); }
	   public Invalidyear(String message) { super(message); }
}
