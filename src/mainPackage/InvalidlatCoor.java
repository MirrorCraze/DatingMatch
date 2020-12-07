package mainPackage;

public class InvalidlatCoor extends Exception{
	   public InvalidlatCoor() { super("Wrong latitude coordinates!"); }
	   public InvalidlatCoor(String message) { super(message); }
}
