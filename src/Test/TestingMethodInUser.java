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
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCase_01() throws FileNotFoundException {
		FloydWarshall fw_obj = new FloydWarshall();
		fw_obj.mapInitialize();
		String filename = "testUserMethod1";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 89;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_02() throws FileNotFoundException {
		FloydWarshall fw_obj = new FloydWarshall();
		fw_obj.mapInitialize();
		String filename = "testUserMethod2";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = -1;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testCase_03() throws FileNotFoundException {
		FloydWarshall fw_obj = new FloydWarshall();
		fw_obj.mapInitialize();
		String filename = "testUserMethod3";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 95;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testCase_04() throws FileNotFoundException {
		FloydWarshall fw_obj = new FloydWarshall();
		fw_obj.mapInitialize();
		String filename = "testUserMethod4";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		User u1 = FloydWarshall.male.get(0);
		User u2 = FloydWarshall.female.get(0);
		double actualResult = u1.calculateScore(u2);
		int expectedResult = 95;
		assertEquals(expectedResult, actualResult);
	}
	
}
