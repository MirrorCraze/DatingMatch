package mainPackage;

public class InvalidAmountOfInput extends Exception {
	   public InvalidAmountOfInput() { super("Wrong amount of input!"); }
	   public InvalidAmountOfInput(String message) { super(message); }
}
