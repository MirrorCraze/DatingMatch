package mainPackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Stable_Matching {
	
	public static LinkedList<Male> freeMales = new LinkedList<>();
	public static LinkedList<Female> females = new LinkedList<>();
	
	public static void setScore()
	{
		for(Male m: freeMales)
			{for(Female f: females)
				{
					int score = m.calculateScore(f);
					m.ranking.add(new Element(f, score));
					Collections.sort(m.ranking, Collections.reverseOrder());
				}
			m.printRanking();
			}
		for(Female f: females)
			{
				f.ranking=new ArrayList<>(Collections.nCopies(freeMales.size(), null));
			for(Male m: freeMales)
			{
				int score = f.calculateScore(m);
				f.ranking.set(m.getMaleIndex(), new Element(m, score));
			}
			f.printRanking();
			}
	}
	
	public static void stable_match()
	{
		while(!freeMales.isEmpty())
		{
			Male m = freeMales.getFirst();
			if(m.pointer == females.size())
				freeMales.removeFirst();
			else
			{
				Female f = m.getNextCandidate();
				if(f.getScore(m) != -1)
					if(f.getPartner() == null)
					{
						f.setPartner(m);
						freeMales.removeFirst();
					}
					else
						if(f.getScore(f.getPartner()) < f.getScore(m))
						{
							f.setPartner(m);
							freeMales.removeFirst();
							freeMales.addLast(m);
						}
			}
		}
		Stable_Matching.printCouples();
	}
	
	public static void printCouples()
	{
		for(Female f: females)
		{
			if(f.partner != null)
				System.out.println(f.partner.fullName + " & " + f.fullName);
		}
	}

}
