package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
	void test_FemaleOutsideBoundForMale_lower() throws FileNotFoundException { // Female Outside Bound for Male lower (and speed bound 22)
		String filename = "testUserMethod1";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 43;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void test_FemaleOutsideBoundForMale_higher() throws FileNotFoundException { // Female Outside Bound for Male higher (and speed bound 46)
		String filename = "testUserMethod2";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 48;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void test_MaleOutsideBoundForFemale_lower() throws FileNotFoundException { // Male Outside Bound for Female lower (and speed bound 23)
		String filename = "testUserMethod3";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u2.calculateScore(u1);
		int expectedResult = 42;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void test_MaleOutsideBoundForFemale_higher() throws FileNotFoundException { // Male Outside Bound for Female higher (and speed bound 47)
		String filename = "testUserMethod4";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u2.calculateScore(u1);
		int expectedResult = 48;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void test_MaximumAgeDifferenceAllowedByAgeBounds() throws FileNotFoundException { // Maximum age difference allowed by age bounds
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
	void test_MinimumAgeDifferenceAllowedByAgeBounds() throws FileNotFoundException { // Minimum age difference allowed by age bounds
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
	void test_ZodiacHorseAndSpeedBound30() throws FileNotFoundException { // Zodiac Horse and speed bound age = 30
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
	void test_ZodiacSnakeAndSpeedBound19() throws FileNotFoundException { // Zodiac Snake and speed bound 19
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
	void test_ZodiacMonkey() throws FileNotFoundException { // Zodiac Monkey 
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
	void test_ZodiacDog() throws FileNotFoundException { // Zodiac Dog 
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
	void test_ZodiacPigAndSpeedBound25() throws FileNotFoundException {  //Zodiac Pig and speed bound 25
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
	void test_ZodiacRatAndSpeedBound24() throws FileNotFoundException { //Zodiac Rat and speed bound 24
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
	void test_ZodiacOxAndSpeedBound23() throws FileNotFoundException { //Zodiac Ox and speed bound 23
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
	void test_ZodiacSnakeAndSpeedBound31() throws FileNotFoundException { // Zodiac Snake and speed bound 31 
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
	void test_ZodiacSheepAndSpeedBound65() throws FileNotFoundException { // Zodiac Sheep and speed bound 65
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
	void test_ZodiacDragonAndSpeedBound32() throws FileNotFoundException { // Zodiac Dragon and speed bound 32
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
	void test_ZodiacRabbitAndSpeedBound69() throws FileNotFoundException { // Zodiac Rabbit and speed bound 69
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
	void test_ZodiacTigerAndSpeedBound70() throws FileNotFoundException { // Zodiac Tiger and speed bound 70
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
	void test_SpeedBound18() throws FileNotFoundException { // Speed bound 18
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
	void test_SpeedBound45() throws FileNotFoundException { // Speed bound 45
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
	void test_SpeedBound66() throws FileNotFoundException { // Speed bound 66
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
