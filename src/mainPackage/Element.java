package mainPackage;

public class Element implements Comparable<Element> {
	User u;
	int score;
	
	public Element(User user, int score)
	{
		this.u = user;
		this.score = score;
	}

	@Override
	public int compareTo(Element e) {
		// TODO Auto-generated method stub
		return score - e.score;
	}

}
