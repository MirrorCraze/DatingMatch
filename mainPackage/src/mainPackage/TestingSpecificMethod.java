package mainPackage;

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
//Test calShortestDist() in the FloydWarshal class

public class TestingSpecificMethod {

	FloydWarshall fw_obj;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		fw_obj = new FloydWarshall();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/*
	 * I need a actual output ==> how to get it?
	 * 
	 * 
	 */
	@Test
	void testCase_01() throws FileNotFoundException {
		fw_obj.mapInitialize();
		String filename;
		Scanner sc = new Scanner(System.in);
		System.out.println("File Name?");
		filename = sc.next();
		FloydWarshall.readFile(filename);
		double[][] actualOutput = FloydWarshall.calShortestDist().clone();
		boolean actualResult = false;
		double[][] expectedOutput = { { 15.76849435297941, 18.928295020573557 },
				{ 53.11630995496587, 34.27611062256001 }, };
		int row1 = actualOutput.length;
		int col1 = actualOutput[0].length;

		// Calculates the number of rows and columns present in the second matrix

		int row2 = expectedOutput.length;
		int col2 = expectedOutput[0].length;

		if (row1 != row2 || col1 != col2) {
			actualResult = false;
		} else {
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col1; j++) {
					if (actualOutput[i][j] != expectedOutput[i][j]) {
						actualResult = false;
					}
					else {
						actualResult = true;
					}
				}
			}
			boolean expectedResult = true;
			assertEquals(expectedResult, actualResult);
		}
	}
	
	@Test
	void testCase_02() throws FileNotFoundException {
		fw_obj.mapInitialize();
		String filename;
		Scanner sc = new Scanner(System.in);
		System.out.println("File Name?");
		filename = sc.next();
		FloydWarshall.readFile(filename);
		double[][] actualOutput = FloydWarshall.calShortestDist().clone();
		boolean actualResult = false;
		double[][] expectedOutput = { { 9.804526026430038, 9.804526026430038 },
				{ 9.804526026430038, 9.804526026430038 }, };
		int row1 = actualOutput.length;
		int col1 = actualOutput[0].length;

		// Calculates the number of rows and columns present in the second matrix

		int row2 = expectedOutput.length;
		int col2 = expectedOutput[0].length;

		if (row1 != row2 || col1 != col2) {
			actualResult = false;
		} else {
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col1; j++) {
					if (actualOutput[i][j] != expectedOutput[i][j]) {
						actualResult = false;
					}
					else {
						actualResult = true;
					}
				}
			}
			boolean expectedResult = true;
			assertEquals(expectedResult, actualResult);
		}
	}
}
