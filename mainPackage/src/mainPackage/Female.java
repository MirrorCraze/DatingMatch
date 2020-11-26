package mainPackage;

public class Female extends User {
	
	Male partner = null;
	
	public Female(String fullName, char gender, int age, int upperAgeBound, int lowerAgeBound, int yearOfBirth,double lat, double lon)
	{
		super(fullName, gender, age, upperAgeBound, lowerAgeBound, yearOfBirth, lat,lon);
		Stable_Matching.females.add(this);
	}
	
	public Male getPartner()
	{
		return partner;
	}
	
	public void setPartner(Male m)
	{
		partner = m;
	}
	
	public int getScore(Male m)
	{
		return super.ranking.get(m.maleIndex).score;
	}

}
