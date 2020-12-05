package mainPackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Stable_Matching {
	
	public static LinkedList<Male> freeMales = new LinkedList<>();
	public static LinkedList<Female> females = new LinkedList<>();
	public static LinkedList<Male> males = new LinkedList<>();
	public static void setScore()
	{
		for(Male m: freeMales)
			{
			for(Female f: females)
				{
					int score = m.calculateScore(f);
					//System.out.println("From " + m.fullName + " to " + f.fullName + ": " + score);
					m.ranking.add(new Element(f, score));
					Collections.sort(m.ranking, Collections.reverseOrder());
				}
			
			}
		for(Female f: females)
			{
				f.ranking=new ArrayList<>(Collections.nCopies(freeMales.size(), null));
			for(Male m: freeMales)
			{
				int score = f.calculateScore(m);
				//System.out.println("From " + f.fullName + " to " + m.fullName + ": " + score);
				f.ranking.set(m.getMaleIndex(), new Element(m, score));
			}
				//f.printRanking();
			}
	}
	public static void printScore()
	{
		for(Male m : freeMales)
		{
			m.printRanking();
		}
		for(Male m : males)
		{
			//System.out.println("Visit " + m.fullName);
			m.printRanking();
		}
		for(Female f:females)
		{
			f.printRanking();
		}
	}
	public static void stable_match()
	{
		while(!freeMales.isEmpty())
		{
			Male m = freeMales.getFirst();
			if(m.pointer == females.size())
			{
				freeMales.removeFirst();
				males.add(m);
			}
			else
			{
				Female f = m.getNextCandidate();
				if(f.getScore(m) != -1)
					if(f.getPartner() == null)
					{
						f.setPartner(m);
						freeMales.removeFirst();
						males.add(m);
					}
					else
						if(f.getScore(f.getPartner()) < f.getScore(m))
						{
							f.setPartner(m);
							freeMales.removeFirst();
							males.add(m);
							freeMales.addLast(m);
						}
			}
		}
		printCouples();
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
