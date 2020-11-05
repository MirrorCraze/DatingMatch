package mainPackage;



public class Person {
	public String name;
	public CoorPair coor;
	public char sex;
	Person(String name, double lat, double lon, char s)
	{
		this.name = name;
		coor = new CoorPair(lat,lon);
		this.sex = s;
	}
}
