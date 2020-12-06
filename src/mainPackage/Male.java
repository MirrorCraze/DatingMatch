package mainPackage;

public class Male extends User {
	
	public int maleIndex;
	private static int maleIndexNext = 0;
	public int pointer = 0;
	
	public Male(String fullName, char gender, int age, int upperAgeBound, int lowerAgeBound, int yearOfBirth,double lat, double lon)
	{
		super(fullName, gender, age, upperAgeBound, lowerAgeBound,yearOfBirth,lat,lon);
		maleIndex = maleIndexNext++;
		Stable_Matching.freeMales.add(this);
	}
	
	public int getMaleIndex()
	{
		return maleIndex;
	}
	public static void initialize()
	{
		maleIndexNext = 0;
	}
	public Female getNextCandidate()
	{
		Female f = (Female) super.ranking.get(pointer++).u;
		return f;
	}
	
}
