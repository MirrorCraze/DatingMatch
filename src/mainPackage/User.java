package mainPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class User {

	public String fullName;
	public int age;
	private int upperAgeBound;
	private int lowerAgeBound;
	public char gender;
	public int yearOfBirth;
	public CoorPair coor;

	public ArrayList<Element> ranking = new ArrayList<>();

	public User(String fullName, char gender, int age, int upperAgeBound, int lowerAgeBound, int yearOfBirth,
			double lat, double lon) {
		this.fullName = fullName;
		this.gender = gender;
		this.age = age;
		this.upperAgeBound = upperAgeBound;
		this.lowerAgeBound = lowerAgeBound;
		this.yearOfBirth = yearOfBirth;
		coor = new CoorPair(lat, lon);
	}

	public int calculateScore(User u) {
		if (u.age <= this.lowerAgeBound || u.age >= this.upperAgeBound)
			return -1;
		double age_score = this.ageScore(u);
		double location_score = this.locationScore(u);
		double zodiac_score = this.zodiacScore(u);
		return (int) (age_score + location_score + zodiac_score);
	}

	private double ageScore(User u) {
		double d = Math.abs(this.age - u.age);
		return (-25.00 / 26.00) * d + 50;
	}

	private double zodiacScore(User u) {

		return ((20.11 / 11.11)) * Zodiac.checkCompatibility(this.yearOfBirth, u.yearOfBirth);
	}

	private double locationScore(User u) {
		// TODO Auto-generated method stub
		double speed = 0, k = 0;
		if ((u.age >= 18 && u.age <= 23) || (u.age >= 46 && u.age <= 65)) {
			speed = 1.00 / 12.00;
			k = -3;
		} else if (u.age >= 24 && u.age <= 30) {
			speed = 1.00 / 4.00;
			k = -1;

		}

		else if (u.age >= 31 && u.age <= 45) {
			speed = 1.00 / 6.00;
			k = -1.5;
		} else if (u.age >= 66 && u.age <= 70) {
			speed = 1.00 / 30.00;
			k = -7.5;
		}

		double difficulty = FloydWarshall.getTravelTime(this, u) * speed;
		return (k * difficulty + 30);

	}

	public int getUpperBoundary() {
		return upperAgeBound;
	}

	public int getLowerBoundary() {
		return lowerAgeBound;
	}

	public void printRanking() {
		System.out.println(fullName + " ranking:");
		for (Element e : ranking)
			System.out.println(e.u.fullName + " score: " + e.score);
		System.out.println();
	}

}
