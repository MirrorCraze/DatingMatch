package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Rule;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.TemporaryFolder;
import mainPackage.FloydWarshall;
import mainPackage.InputRead;
import mainPackage.User;;
//Test calShortestDist() in the FloydWarshal class

public class TestingMethodInUser {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		FloydWarshall.mapInitialize();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCase_01() throws FileNotFoundException { // Female Outside Bound for Male lower (and speed bound 22)
		String filename = "testUserMethod1";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_02() throws FileNotFoundException { // Female Outside Bound for Male higher (and speed bound 46)
		String filename = "testUserMethod2";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_03() throws FileNotFoundException { // Male Outside Bound for Female lower (and speed bound 23)
		String filename = "testUserMethod3";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u2.calculateScore(u1);
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_04() throws FileNotFoundException { // Male Outside Bound for Female higher (and speed bound 47)
		String filename = "testUserMethod4";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u2.calculateScore(u1);
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_05() throws FileNotFoundException { // Maximum age difference allowed by age bounds
		String filename = "testUserMethod5";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u2.calculateScore(u1);
		int expectedResult = 90;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_06() throws FileNotFoundException { // Minimum age difference allowed by age bounds
		String filename = "testUserMethod6";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u2.calculateScore(u1);
		int expectedResult = 78;
		assertEquals(expectedResult, actualResult);
	}

	// Test cases for lower bounds

	// Test Coverage for Zodiacs
	@Test
	void testCase_07() throws FileNotFoundException { // Zodiac Horse and speed bound 30
		String filename = "testUserMethod7";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 82;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_08() throws FileNotFoundException { // Zodiac Snake and speed bound 19
		String filename = "testUserMethod8";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 84;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_09() throws FileNotFoundException { // Zodiac Monkey 
		String filename = "testUserMethod9";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 87;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_10() throws FileNotFoundException { // Zodiac Dog 
		String filename = "testUserMethod10";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 89;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_11() throws FileNotFoundException {  //Zodiac Pig and speed bound 25
		String filename = "testUserMethod11";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 74;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testCase_12() throws FileNotFoundException { //Zodiac Rat and speed bound 24
		String filename = "testUserMethod12";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 84;
		assertEquals(expectedResult, actualResult);
	}
	@Test
	void testCase_13() throws FileNotFoundException { //Zodiac Ox and speed bound 23
		String filename = "testUserMethod13";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 88;
		assertEquals(expectedResult, actualResult);
	}
	@Test
	void testCase_14() throws FileNotFoundException { // Zodiac Snake and speed bound 31 
		String filename = "testUserMethod14";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 72;
		assertEquals(expectedResult, actualResult);
	}
	@Test
	void testCase_15() throws FileNotFoundException { // Zodiac Sheep and speed bound 65
		String filename = "testUserMethod15";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 37;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testCase_16() throws FileNotFoundException { // Zodiac Dragon and speed bound 32
		String filename = "testUserMethod16";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 87;
		assertEquals(expectedResult, actualResult);
	}
	@Test
	void testCase_17() throws FileNotFoundException { // Zodiac Rabbit and speed bound 69
		String filename = "testUserMethod17";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 37;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testCase_18() throws FileNotFoundException { // Zodiac Tiger and speed bound 70
		String filename = "testUserMethod18";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 38;
		assertEquals(expectedResult, actualResult);
	}
	@Test
	void testCase_19() throws FileNotFoundException { // Speed bound 18
		String filename = "testUserMethod19";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 93;
		assertEquals(expectedResult, actualResult);
	}
	@Test
	void testCase_20() throws FileNotFoundException { // Speed bound 45
		String filename = "testUserMethod20";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 60;
		assertEquals(expectedResult, actualResult);
	}
	@Test
	void testCase_21() throws FileNotFoundException { // Speed bound 66
		String filename = "testUserMethod21";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 49;
		assertEquals(expectedResult, actualResult);
	}
}
