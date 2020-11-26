package mainPackage;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CalShortDistParTesting {
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

	@ParameterizedTest
	@MethodSource("prepareData")
	void testCalShortDist(String filename, String msg) throws FileNotFoundException {
		fw_obj.mapInitialize();
		// Scanner sc = new Scanner(System.in);
		// System.out.println("File Name?");
		// filename = sc.next();
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
					} else {
						actualResult = true;
					}
				}
			}
			boolean expectedResult = true;
			assertEquals(expectedResult, actualResult, msg);
		}
	}

	public static Collection<Object[]> prepareData() {
		Object[][] testData = { 
				{ "test", "Testing when key is found first in sorted array" },
				{ "test1", "Testing when key is found first in sorted array" },
				{ "test2_NumberLargerThenActualPeople", "Testing when key is found first in sorted array" },
				/*
				 * { 6, "0 1 2 3 4 5 6 7 8 9", 10, true,
				 * "Testing when key is anywhere in sorted array" }, { 11,
				 * "1 3 6 9 10 12 15 16 19 20", 10, false,
				 * "Testing when the key is not in the sorted array" },
				 * 
				 * { 5, "2 5 1 9 12 3 7 18 10 8", 10, false,
				 * "Testing when found in unsorted array" }, { 4, "10 9 8 7 6 5 4 3 2 1", 10,
				 * false, "Testing when found in sorted array but in decending order" }, { 2,
				 * "2 4 6 8 10 12 14 16 18 20", 10, true,
				 * "Testing when key is first in sorted array of even numbers" }, { 20,
				 * "2 4 6 8 10 12 14 16 18 20", 10, true,
				 * "Testing when key is last in sorted array of even numbers" }, { 10,
				 * "2 4 6 8 10 12 14 16 18", 9, true,
				 * "Testing when key is in the middle of sorted array of even numbers" }, { 6,
				 * "2 4 6 8 10 12 14 16 18 20", 10, true,
				 * "Testing when key is first in sorted array of even numbers" }, { 1,
				 * "1 3 5 7 9 11 13 15 17 19", 10, true,
				 * "Testing when key is first in sorted array of odd numbers" }, { 19,
				 * "1 3 5 7 9 11 13 15 17 19", 10, true,
				 * "Testing when key is last in sorted array of odd numbers" }, { 9,
				 * "1 3 5 7 9 11 13 15 17", 9, true,
				 * "Testing when key is in the middle of sorted array of odd numbers" }, { 7,
				 * "1 3 5 7 9 11 13 15 17 19", 10, true,
				 * "Testing when key is first anywhere in sorted array of odd numbers" }, { 3,
				 * "1 2 3 4 5 6 7 8 9 10", 9, false,
				 * "Testing when size passed is smaller than actual size of an array" }, { 3,
				 * "1 2 3 4 5 6 7 8 9 10", 11, false,
				 * "Testing when size passed is larger than actual size of an array" },
				 */
		};
		return Arrays.asList(testData);
	}
}
