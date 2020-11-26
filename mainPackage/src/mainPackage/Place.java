package mainPackage;

public class Place {
	public String name;
	public CoorPair coor;
	Place(String name, double lat, double lon)
	{
		this.name = name;
		coor = new CoorPair(lat,lon);
	}
}