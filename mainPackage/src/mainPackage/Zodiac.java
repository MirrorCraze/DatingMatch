package mainPackage;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Arrays;
import java.util.Scanner; 
public class Zodiac {

	public static String signs[][]= new String[12][12];
	static {
	try {
		 Scanner in=new Scanner(new File("zodiacCompatibility.txt"));
		 int i=0;
	      while (in.hasNextLine()) {
	        String data = in.nextLine();
	        signs[i]=data.split(",");
	        i++;
	        
	      }
	      in.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
	public static String YearToSign(int year){
		switch(year % 12) {
		case 0: return "Monkey";
		case 1:return "Rooster";
		case 2:return "Dog";
		case 3:return "Pig";
		case 4:return "Rat";
		case 5:return "Ox";
		case 6:return "Tiger";
		case 7:return "Rabbit";
		case 8:return "Dragon";
		case 9:return "Snake";
		case 10:return "Horse";
		case 11:return "Sheep";
		}
		return null;
	}
	
		public static int checkCompatibility(int y1,int y2){
			
			return 11- Arrays.asList(signs[y1%12]).indexOf(YearToSign(y2));
		}
	}

