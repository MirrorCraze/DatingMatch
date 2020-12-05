package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
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
//Test calShortestDist() in the FloydWarshal class

public class TestingSpecificMethod {

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
	void testCase_01() throws FileNotFoundException { // First test case
		FloydWarshall fw_obj = new FloydWarshall();
		fw_obj.mapInitialize();
		String filename = "test";
		InputRead.readFile(filename);
		double[][] matrixOne = fw_obj.calShortestDist().clone();
		boolean actualResult = false; // [[15.76849435297941, 18.928295020573557], [53.11630995496587,
										// 34.27611062256001]]
		double[][] matrixTwo = { { 15.76849435297941, 18.928295020573557 }, { 53.11630995496587, 34.27611062256001 }, };
		int row1 = matrixOne.length;
		int col1 = matrixOne[0].length;
		// Calculates the number of rows and columns present in the second matrix

		int row2 = matrixTwo.length;
		int col2 = matrixTwo[0].length;

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				if (matrixOne[i][j] != matrixTwo[i][j]) {
					actualResult = false;
					break;
				} else {
					actualResult = true;
				}
			}
		}
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_02() throws FileNotFoundException { // Testing when Coor for all people are same
		FloydWarshall fw_obj = new FloydWarshall();
		fw_obj.mapInitialize();
		String filename = "test_AllCoorAreSame";
		InputRead.readFile(filename);
		double[][] matrixOne = fw_obj.calShortestDist();
		boolean actualResult = false;
		double[][] matrixTwo = { { 9.804526026430038, 9.804526026430038 }, { 9.804526026430038, 9.804526026430038 }, };
		int row1 = matrixOne.length;
		int col1 = matrixOne[0].length;
		// Calculates the number of rows and columns present in the second matrix

		int row2 = matrixTwo.length;
		int col2 = matrixTwo[0].length;

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				if (matrixOne[i][j] != matrixTwo[i][j]) {
					actualResult = false;
					break;
				} else {
					actualResult = true;
				}
			}
		}
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_03() throws FileNotFoundException { // Testing when Guys are close to station and girls are far from
														// station
		FloydWarshall fw_obj = new FloydWarshall();
		fw_obj.mapInitialize();
		String filename = "test_GuysCloseToStationGirlsFar";
		InputRead.readFile(filename);
		double[][] matrixOne = fw_obj.calShortestDist();
		boolean actualResult = false;
		double[][] matrixTwo = { { 81.06048827933391, 80.90455900316994 }, { 57.02096987474749, 56.86504059858352 }, };
		int row1 = matrixOne.length;
		int col1 = matrixOne[0].length;
		int row2 = matrixTwo.length;
		int col2 = matrixTwo[0].length;

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				if (matrixOne[i][j] != matrixTwo[i][j]) {
					actualResult = false;
					break;
				} else {
					actualResult = true;
				}
			}
		}
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_04() throws FileNotFoundException { // Testing when two Girls are Close to station and Guys are far
		FloydWarshall fw_obj = new FloydWarshall();
		fw_obj.mapInitialize();
		String filename = "test_GirlsCloseToStationGuysFar";
		InputRead.readFile(filename);
		double[][] matrixOne = FloydWarshall.calShortestDist();
		boolean actualResult = false;
		double[][] matrixTwo = { { 81.06048827933391, 57.02096987474749 }, { 80.90455900316994, 56.86504059858352 }, };
		int row1 = matrixOne.length;
		int col1 = matrixOne[0].length;
		// Calculates the number of rows and columns present in the second matrix
		int row2 = matrixTwo.length;
		int col2 = matrixTwo[0].length;

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				if (matrixOne[i][j] != matrixTwo[i][j]) {
					actualResult = false;
					break;
				} else {
					actualResult = true;
				}
			}
		}
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_05() throws FileNotFoundException { // Testing when one par (boy+girl) are close one far
		FloydWarshall fw_obj = new FloydWarshall();
		fw_obj.mapInitialize();
		String filename = "test_OnePairCloseToSameStationOneFar";
		InputRead.readFile(filename);
		double[][] matrixOne = FloydWarshall.calShortestDist();
		boolean actualResult = false;
		double[][] matrixTwo = { { 3.918534482636295, 21.133064906525714 }, { 26.27705052909637, 32.70895422484135 }, };
		int row1 = matrixOne.length;
		int col1 = matrixOne[0].length;
		// Calculates the number of rows and columns present in the second matrix
		int row2 = matrixTwo.length;
		int col2 = matrixTwo[0].length;

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				if (matrixOne[i][j] != matrixTwo[i][j]) {
					actualResult = false;
					break;
				} else {
					actualResult = true;
				}
			}
		}
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_06() throws FileNotFoundException { // Testing when both pairs are far from stations
		FloydWarshall fw_obj = new FloydWarshall();
		fw_obj.mapInitialize();
		String filename = "test_AllPairsFarFromStation";
		InputRead.readFile(filename);
		double[][] matrixOne = FloydWarshall.calShortestDist();
		boolean actualResult = false;
		double[][] matrixTwo = { { 19.706916479313207, 31.873521801842518 },
				{ 28.741598984667437, 30.90820430719675 }, };
		int row1 = matrixOne.length;
		int col1 = matrixOne[0].length;

		// Calculates the number of rows and columns present in the second matrix

		int row2 = matrixTwo.length;
		int col2 = matrixTwo[0].length;

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				if (matrixOne[i][j] != matrixTwo[i][j]) {
					actualResult = false;
					break;
				} else {
					actualResult = true;
				}
			}
		}
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_07() throws FileNotFoundException { // Testin when two people are closer by walk than home->station
		FloydWarshall fw_obj = new FloydWarshall();
		String filename = "test_PairCloseByWalk";
		fw_obj.mapInitialize();
		InputRead.readFile(filename);
		double[][] matrixOne = FloydWarshall.calShortestDist();
		boolean actualResult = false;
		double[][] matrixTwo = { { 38.44271759729233 } };
		int row1 = matrixOne.length;
		int col1 = matrixOne[0].length;

		// Calculates the number of rows and columns present in the second matrix

		int row2 = matrixTwo.length;
		int col2 = matrixTwo[0].length;

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				if (matrixOne[i][j] != matrixTwo[i][j]) {
					actualResult = false;
					break;
				} else {
					actualResult = true;
				}
			}
		}
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_08() throws FileNotFoundException { // Pair Close to Mong Kok Station, Pair Close to Central
		FloydWarshall fw_obj = new FloydWarshall();
		fw_obj.mapInitialize();
		String filename = "test_PairCloseToMongKok_PairCloseToCentral";
		InputRead.readFile(filename);
		double[][] matrixOne = FloydWarshall.calShortestDist();
		boolean actualResult = false;
		double[][] matrixTwo = { { 3.465332724933434, 15.100191787386398 },
				{ 13.837155920678189, 3.472014983131154 }, };
		int row1 = matrixOne.length;
		int col1 = matrixOne[0].length;
		// Calculates the number of rows and columns present in the second matrix
		int row2 = matrixTwo.length;
		int col2 = matrixTwo[0].length;

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				if (matrixOne[i][j] != matrixTwo[i][j]) {
					actualResult = false;
					break;
				} else {
					actualResult = true;
				}
			}
		}
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_09() throws FileNotFoundException { // Pair Close to Diamond Hill Station, Pair Close to Kowloon Tong
		FloydWarshall fw_obj = new FloydWarshall();
		fw_obj.mapInitialize();
		String filename = "test_PairCloseToDHill_PairCloseToKT";
		InputRead.readFile(filename);
		double[][] matrixOne = FloydWarshall.calShortestDist();
		boolean actualResult = false;
		double[][] matrixTwo = { { 1.4585372895752935, 15.373333352752926 },
				{ 15.522727944794445, 17.437524007972076 }, };
		int row1 = matrixOne.length;
		int col1 = matrixOne[0].length;

		// Calculates the number of rows and columns present in the second matrix

		int row2 = matrixTwo.length;
		int col2 = matrixTwo[0].length;

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				if (matrixOne[i][j] != matrixTwo[i][j]) {
					actualResult = false;
					break;
				} else {
					actualResult = true;
				}
			}
		}
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_10() throws FileNotFoundException { // Pair Close to North Point Station, Pair Close to Lai King
		FloydWarshall fw_obj = new FloydWarshall();
		fw_obj.mapInitialize();
		String filename = "test_PairCloseToNP_PairCloseToLK";
		InputRead.readFile(filename);
		double[][] matrixOne = FloydWarshall.calShortestDist();
		boolean actualResult = false;
		double[][] matrixTwo = { { 2.372777688719818, 38.040900328587654 },
				{ 37.06378927417058, 2.7319119140384167 }, };
		int row1 = matrixOne.length;
		int col1 = matrixOne[0].length;
		// Calculates the number of rows and columns present in the second matrix
		int row2 = matrixTwo.length;
		int col2 = matrixTwo[0].length;

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				if (matrixOne[i][j] != matrixTwo[i][j]) {
					actualResult = false;
					break;
				} else {
					actualResult = true;
				}
			}
		}
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_11() throws FileNotFoundException { // Pair Close to Tiu Keng Leng Station, Pair Close to Hung Hom
		FloydWarshall fw_obj = new FloydWarshall();
		fw_obj.mapInitialize();
		String filename = "test_PairCloseToTKL_PairCloseToHH";
		InputRead.readFile(filename);
		double[][] matrixOne = FloydWarshall.calShortestDist();
		boolean actualResult = false;
		double[][] matrixTwo = { { 4.37588527452804, 35.58427351031799 }, { 37.38741075061218, 12.595798986402137 }, };
		int row1 = matrixOne.length;
		int col1 = matrixOne[0].length;

		// Calculates the number of rows and columns present in the second matrix

		int row2 = matrixTwo.length;
		int col2 = matrixTwo[0].length;

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				if (matrixOne[i][j] != matrixTwo[i][j]) {
					actualResult = false;
					break;
				} else {
					actualResult = true;
				}
			}
		}
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	// Every Person on Different Station (Girl:Mong Kok,Guy:Central,Girl:Diamond
	// Hill,Guy:Hung Hom)
	void testCase_12() throws FileNotFoundException {
		FloydWarshall fw_obj = new FloydWarshall();
		fw_obj.mapInitialize();
		String filename = "test_EveryoneCloseToDifferentStation";
		InputRead.readFile(filename);
		double[][] matrixOne = FloydWarshall.calShortestDist();
		boolean actualResult = false;
		double[][] matrixTwo = { { 16.522144963595323, 25.25513442499865 },
				{ 19.004824264550315, 15.737813725953645 }, };
		int row1 = matrixOne.length;
		int col1 = matrixOne[0].length;

		// Calculates the number of rows and columns present in the second matrix

		int row2 = matrixTwo.length;
		int col2 = matrixTwo[0].length;

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				if (matrixOne[i][j] != matrixTwo[i][j]) {
					actualResult = false;
					break;
				} else {
					actualResult = true;
				}
			}
		}
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	// Every Person on Different Station (Girl:Kowloon Tong,Guy:Tiu Keng
	// Leng,Girl:North Point,Guy:Lai King)
	void testCase_13() throws FileNotFoundException {
		FloydWarshall fw_obj = new FloydWarshall();
		fw_obj.mapInitialize();
		String filename = "test_EveryoneCloseToDifferentStation1";
		InputRead.readFile(filename);
		double[][] matrixOne = FloydWarshall.calShortestDist();
		boolean actualResult = false;
		double[][] matrixTwo = { { 33.74933021506854, 14.857606937556906 },
				{ 28.357942999677157, 37.46621972216552 }, };
		int row1 = matrixOne.length;
		int col1 = matrixOne[0].length;
		// Calculates the number of rows and columns present in the second matrix
		int row2 = matrixTwo.length;
		int col2 = matrixTwo[0].length;

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				if (matrixOne[i][j] != matrixTwo[i][j]) {
					actualResult = false;
					break;
				} else {
					actualResult = true;
				}
			}
		}
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testCase_14() throws FileNotFoundException {
		FloydWarshall fw_obj = new FloydWarshall();
		fw_obj.mapInitialize();
		String filename = "test13";
		InputRead.readFile(filename);
		double[][] matrixOne = FloydWarshall.calShortestDist();
		boolean actualResult = false;
		double[][] matrixTwo = { { 15.76849435297941, 18.928295020573557, 9.739940100276142 },
				{ 53.11630995496587, 34.27611062256001, 47.087755702262605 }, };
		int row1 = matrixOne.length;
		int col1 = matrixOne[0].length;

		// Calculates the number of rows and columns present in the second matrix

		int row2 = matrixTwo.length;
		int col2 = matrixTwo[0].length;

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				if (matrixOne[i][j] != matrixTwo[i][j]) {
					actualResult = false;
					break;
				} else {
					actualResult = true;
				}
			}
		}
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}
}
