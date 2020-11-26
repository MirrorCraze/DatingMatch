package mainPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class FloydWarshall {
	public static ArrayList<Male> male = new ArrayList<>();
	public static ArrayList<Female> female = new ArrayList<>();
	public static ArrayList<Place> station = new ArrayList<>();
	public static Map<String, Integer> hashMTRName = new HashMap<>();
	public static double[][] distStation;
	public static double maxLength = 1E9; // maxLength represents inf.
	public static double[][] dist;

	public static void mapInitialize() {
		// add station
		station.add(new Place("Mongkok", 22.320960, 114.170550));
		station.add(new Place("Central", 22.281899, 114.157458));
		station.add(new Place("Diamond Hill", 22.340871, 114.202095));
		station.add(new Place("Kowloon Tong", 22.337162, 114.176094));
		station.add(new Place("North Point", 22.291273, 114.200493));
		station.add(new Place("Lai King", 22.348067, 114.126835));
		station.add(new Place("Tiu Keng Leng", 22.304257, 114.252681));
		station.add(new Place("Hung Hom", 22.303343, 114.181456));
		// hash MTR station with int for easier indexing
		for (int i = 0; i < station.size(); i++) {
			hashMTRName.put(station.get(i).name, i);
		}
		// initialize the graph. Set all path except self loop to inf.
		distStation = new double[station.size()][station.size()];
		for (int i = 0; i < station.size(); i++) {
			for (int j = 0; j < station.size(); j++) {
				if (i == j)
					distStation[i][j] = 0;
				else
					distStation[i][j] = maxLength;
			}
		}
		// set distance for each station to each station. Non-dense graph.
		setDistance("Mongkok", "Central", 11);
		setDistance("Mongkok", "Diamond Hill", 12);
		setDistance("Mongkok", "Kowloon Tong", 6);
		setDistance("Mongkok", "Lai King", 12);
		setDistance("Central", "North Point", 12);
		setDistance("Diamond Hill", "Kowloon Tong", 6);
		setDistance("Diamond Hill", "Tiu Keng Leng", 17);
		setDistance("Kowloon Tong", "Hung Hom", 5);
		setDistance("North Point", "Tiu Keng Leng", 12);
		setDistance("Lai King", "Hung Hom", 16);
		// Floyd-Warshall to find all pair shortest path from each station.
		for (int k = 0; k < station.size(); k++) {
			for (int i = 0; i < station.size(); i++) {
				for (int j = 0; j < station.size(); j++) {
					if (distStation[i][j] > distStation[i][k] + distStation[k][j])
						distStation[i][j] = distStation[i][k] + distStation[k][j];
				}
			}
		}
	}

	/*
	 * for(int i=0;i<station.size();i++) { for(int j=0;j<station.size();j++) {
	 * System.out.printf("%f ",distStation[i][j]); } System.out.printf("\n"); } }
	 */
	private static void setDistance(String station1, String station2, int dist) {
		distStation[hashMTRName.get(station1)][hashMTRName.get(station2)] = dist;
		distStation[hashMTRName.get(station2)][hashMTRName.get(station1)] = dist;
	}

	public static void readFile(String filename) throws FileNotFoundException {

		String name = "";
		double latCoor = 0;
		double longCoor = 0;
		char gender = 'f';
		int year = 0, maxAge = 0, minAge = 0, age = 0, amountOfPeople = 0;
		Scanner in = new Scanner(new File(filename + ".txt"));
		String inputAll;
		amountOfPeople = Integer.parseInt(in.nextLine());
		String[] inputDiv;
		// sc.nextLine(); //get \n
		for (int i = 0; i < amountOfPeople; i++) {

			try {
			inputAll = in.nextLine();
			inputDiv = inputAll.split(",");
			name = inputDiv[0];			
			gender = inputDiv[1].charAt(0);			
			age = Integer.parseInt(inputDiv[2]);
			maxAge = Integer.parseInt(inputDiv[3]);
			minAge = Integer.parseInt(inputDiv[4]);
			year = Integer.parseInt(inputDiv[5]);
			latCoor = Double.parseDouble(inputDiv[6]);
			longCoor = Double.parseDouble(inputDiv[7]);
			}catch()
			FloydWarshall.addPerson(name, gender, age, maxAge, minAge, year, latCoor, longCoor);
			/*
			 * User u; if(gender=='f'||gender=='F') u=new
			 * Female(name,gender,age,maxAge,minAge,year,latCoor,longCoor); else u=new
			 * Male(name,gender,age,maxAge,minAge,year,latCoor,longCoor);
			 */
		}
		in.close();
	}

	public static void addPerson(String name, char gender, int age, int maxAge, int minAge, int year, double latCoor,
			double longCoor) {

		if (gender == 'M' || gender == 'm') {
			male.add(new Male(name, gender, age, maxAge, minAge, year, latCoor, longCoor));
		} else
			female.add(new Female(name, gender, age, maxAge, minAge, year, latCoor, longCoor));
	}

	public static double[][] calShortestDist() {
		dist = new double[male.size()][female.size()];
		double[][] maleToStation = new double[male.size()][station.size()];
		double[][] femaleToStation = new double[female.size()][station.size()];
		// find distance from station to the men.
		for (int i = 0; i < male.size(); i++) {
			CoorPair posMan = male.get(i).coor;
			for (int j = 0; j < station.size(); j++) {
				maleToStation[i][j] = findTimeDiff(posMan, station.get(j).coor);
			}
		}
		// find distance from women to the station.
		for (int i = 0; i < female.size(); i++) {
			CoorPair posWoman = female.get(i).coor;
			for (int j = 0; j < station.size(); j++) {
				femaleToStation[i][j] = findTimeDiff(posWoman, station.get(j).coor);
			}
		}
		// find shortest path for male to female, using
		// male->stationStart->stationEnd->female
		for (int i = 0; i < male.size(); i++) {
			for (int j = 0; j < female.size(); j++) {
				double minDist = maxLength;
				for (int src = 0; src < station.size(); src++) {
					for (int sink = 0; sink < station.size(); sink++) {
						if (minDist > maleToStation[i][src] + distStation[src][sink] + femaleToStation[j][sink])
							minDist = maleToStation[i][src] + distStation[src][sink] + femaleToStation[j][sink];
					}
				}
				dist[i][j] = minDist;
			}
		}
		return dist;
	}

	public static void printDist(double[][] dist) {
		System.out.printf("%15s ", " ");
		for (int i = 0; i < female.size(); i++) {
			System.out.printf("%15s ", female.get(i).fullName);
		}
		System.out.println();
		for (int i = 0; i < male.size(); i++) {
			System.out.printf("%15s ", male.get(i).fullName);
			for (int j = 0; j < female.size(); j++) {
				System.out.printf("%15s ", Double.toString(dist[i][j]));
			}
			System.out.printf("\n");
		}
	}

	public static char typePos(int pos) {
		if (0 <= pos && pos < male.size()) {
			return 'm'; // male
		} else if (pos >= male.size() && pos < male.size() + station.size()) {
			return 's'; // station
		} else
			return 'f'; // female
	}

	public static double findTimeDiff(CoorPair pair1, CoorPair pair2) {
		double divider = 0.0007594; // 1 mins walk will get this distance. Calculate from Kowloon Tong to SRO.
		double dist = Math.sqrt(Math.pow((pair1.lat - pair2.lat), 2) + Math.pow((pair1.longi - pair2.longi), 2)); // normal
																													// distance
																													// formula.
																													// sqrt((diffX)^2
																													// +
																													// (diffY)^2)
		return dist / divider; // return the minute of walking.
	}

	public static double getTravelTime(User u1, User u2) {

		int i = 0, j = 0;
		if (u1 instanceof Male && u2 instanceof Female) {
			u1 = (Male) u1;
			u2 = (Female) u2;
			i = male.indexOf(u1);
			j = female.indexOf(u2);
		} else if (u1 instanceof Female && u2 instanceof Male) {

			u1 = (Female) u1;
			u2 = (Male) u2;
			i = male.indexOf(u2);
			j = female.indexOf(u1);
		}

		return dist[i][j];
	}
}

