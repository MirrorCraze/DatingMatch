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
import mainPackage.Stable_Matching;
import mainPackage.Female;
import mainPackage.FloydWarshall;
import mainPackage.Stable_Matching;
import mainPackage.User;
import mainPackage.InputRead;
//Test calShortestDist() in the FloydWarshal class

public class IntegrationTesting {

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
	void test_WhenThereIs4People() throws FileNotFoundException { // test 4 people
		String filename = "test";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		Stable_Matching.setScore();
		Stable_Matching.stable_match();
		String result = "";
		for (Female f : Stable_Matching.females) {
			if (f.getPartner() == null)
				continue;
			result += f.getPartner().fullName;
		}
		String expectedResult = "IvanTimur";
		assertEquals(expectedResult, result);
	}

	@Test
	void test_WhenAllGirls() throws FileNotFoundException { // test All Girls
		String filename = "test_AllGirls";
		InputRead.readFile(filename);
		double dist[][] = FloydWarshall.calShortestDist();
		Stable_Matching.setScore();
		Stable_Matching.stable_match();
		String result = "";
		for (Female f : Stable_Matching.females) {
			if (f.getPartner() == null)
				continue;
			result += f.getPartner().fullName;

		}
		String expectedResult = "";
		assertEquals(expectedResult, result);
	}

	@Test
	void test_WhenSixPeople() throws FileNotFoundException { // test six people
		String filename = "test_1";
		InputRead.readFile(filename);
		double dist[][] = FloydWarshall.calShortestDist();
		Stable_Matching.setScore();
		Stable_Matching.stable_match();
		String result = "";
		for (Female f : Stable_Matching.females) {
			if (f.getPartner() == null)
				continue;
			result += f.getPartner().fullName;

		}
		String expectedResult = "IvanTimurLuka";
		assertEquals(expectedResult, result);
	}

	@Test
	void test_OneExtraBoy() throws FileNotFoundException { // test one extra boy
		String filename = "test_2";
		InputRead.readFile(filename);
		double dist[][] = FloydWarshall.calShortestDist();
		Stable_Matching.setScore();
		Stable_Matching.stable_match();
		String result = "";
		for (Female f : Stable_Matching.females) {
			if (f.getPartner() == null)
				continue;
			result += f.getPartner().fullName;

		}
		String expectedResult = "IvanTimur";
		assertEquals(expectedResult, result);
	}

	@Test
	void test_OneExtraGirl() throws FileNotFoundException { // Test one Another Girl
		String filename = "test_3";
		InputRead.readFile(filename);
		double dist[][] = FloydWarshall.calShortestDist();
		Stable_Matching.setScore();
		Stable_Matching.stable_match();
		String result = "";
		for (Female f : Stable_Matching.females) {
			if (f.getPartner() == null)
				continue;
			result += f.getPartner().fullName;

		}
		String expectedResult = "IvanTimur";
		assertEquals(expectedResult, result);
	}

	@Test
	void test_TestZodiacsAndBoundaryValuesForSpeed_10People() throws FileNotFoundException { // Test the Zodiacs and speed boundary values and 10 people
		String filename = "test_4";
		InputRead.readFile(filename);
		double dist[][] = FloydWarshall.calShortestDist();
		Stable_Matching.setScore();
		Stable_Matching.stable_match();
		String result = "";
		for (Female f : Stable_Matching.females) {
			if (f.getPartner() == null)
				continue;
			result += f.getPartner().fullName;

		}
		String expectedResult = "LukaIvanLukaMarkoLuka";
		assertEquals(expectedResult, result);
	}

	@Test
	void test_RestOfZodiacSignsAndBoundariesForSpeed_8People() throws FileNotFoundException { // Test the zodiacs and speed boundary and 8 people
		String filename = "test_5";
		InputRead.readFile(filename);
		double dist[][] = FloydWarshall.calShortestDist();
		Stable_Matching.setScore();
		Stable_Matching.stable_match();
		String result = "";
		for (Female f : Stable_Matching.females) {
			if (f.getPartner() == null)
				continue;
			result += f.getPartner().fullName;

		}
		String expectedResult = "TimurTimurMarkoMarkoJohn";
		assertEquals(expectedResult, result);
	}

	@Test
	void test_WhenPairIsCloseToEachOtherButNotInsideAgeBoundary() throws FileNotFoundException { // When pair is close but the age not in age boundary with each
														// other
		String filename = "test_6";
		InputRead.readFile(filename);
		double dist[][] = FloydWarshall.calShortestDist();
		Stable_Matching.setScore();
		Stable_Matching.stable_match();
		String result = "";
		for (Female f : Stable_Matching.females) {
			if (f.getPartner() == null)
				continue;
			result += f.getPartner().fullName;

		}
		String expectedResult = "JohnDaniel";
		assertEquals(expectedResult, result);
	}

	@Test
	void test_WhenNoPairInAgeBoundaryAndAllPeopleFarFromEachOther() throws FileNotFoundException { // testing when nobody is in each others age boundary and all are
														// far from station
		String filename = "test_7";
		InputRead.readFile(filename);
		double dist[][] = FloydWarshall.calShortestDist();
		Stable_Matching.setScore();
		Stable_Matching.stable_match();
		String result = "";
		for (Female f : Stable_Matching.females) {
			if (f.getPartner() == null)
				continue;
			result += f.getPartner().fullName;

		}
		String expectedResult = "IvanTimur";
		assertEquals(expectedResult, result);
	}

	@Test
	void test_AllBoys() throws FileNotFoundException { // Test All Boys
		String filename = "test_AllBoys";
		InputRead.readFile(filename);
		double dist[][] = FloydWarshall.calShortestDist();
		Stable_Matching.setScore();
		Stable_Matching.stable_match();
		String result = "";
		for (Female f : Stable_Matching.females) {
			if (f.getPartner() == null)
				continue;
			result += f.getPartner().fullName;

		}
		String expectedResult = "";
		assertEquals(expectedResult, result);
	}

	@Test
	void test_TwoGirlsAreSameCompatibleForOneGuy() throws FileNotFoundException { // Test Two girls are same for one guy
		String filename = "test_twoGirlsSameCompatabilityForOneBoy";
		InputRead.readFile(filename);
		double dist[][] = FloydWarshall.calShortestDist();
		Stable_Matching.setScore();
		Stable_Matching.stable_match();
		String result = "";
		for (Female f : Stable_Matching.females) {
			if (f.getPartner() == null)
				continue;
			result += f.getPartner().fullName;

		}
		String expectedResult = "JohnDaniel";
		assertEquals(expectedResult, result);
	}

	@Test
	void test_TwoBoysSameCompatibleForOneGirls() throws FileNotFoundException { // Test Two boys compatible for one girl
		String filename = "test_twoBoysSameCompatibilityForOneGirl";
		InputRead.readFile(filename);
		double dist[][] = FloydWarshall.calShortestDist();
		Stable_Matching.setScore();
		Stable_Matching.stable_match();
		String result = "";
		for (Female f : Stable_Matching.females) {
			if (f.getPartner() == null)
				continue;
			result += f.getPartner().fullName;

		}
		String expectedResult = "DanielJohn";
		assertEquals(expectedResult, result);
	}
	
	@Test
	void test_NobodyCompatibleWithEachOther() throws FileNotFoundException { // Test when all the paramaters going to lead to bad score
		String filename = "test_NobodyCompatibleWithEachOther";
		InputRead.readFile(filename);
		double dist[][] = FloydWarshall.calShortestDist();
		Stable_Matching.setScore();
		Stable_Matching.stable_match();
		String result = "";
		for (Female f : Stable_Matching.females) {
			if (f.getPartner() == null)
				continue;
			result += f.getPartner().fullName;

		}
		String expectedResult = "JohnDaniel";
		assertEquals(expectedResult, result);
	}
	
	@Test
	void test_AllParamatersAreSameExceptNames() throws FileNotFoundException { // Test when all paramaters are same except names
		String filename = "test_AllParamatersAreSameExceptNames";
		InputRead.readFile(filename);
		double dist[][] = FloydWarshall.calShortestDist();
		Stable_Matching.setScore();
		Stable_Matching.stable_match();
		String result = "";
		for (Female f : Stable_Matching.females) {
			if (f.getPartner() == null)
				continue;
			result += f.getPartner().fullName;

		}
		String expectedResult = "LukaMarkoJohn";
		assertEquals(expectedResult, result);
	}
	@Test
	void test_TestOnePairOnly() throws FileNotFoundException { // Test one Pair only
		String filename = "test_OnePairOnly";
		InputRead.readFile(filename);
		double dist[][] = FloydWarshall.calShortestDist();
		Stable_Matching.setScore();
		Stable_Matching.stable_match();
		String result = "";
		for (Female f : Stable_Matching.females) {
			if (f.getPartner() == null)
				continue;
			result += f.getPartner().fullName;

		}
		String expectedResult = "Ivan";
		assertEquals(expectedResult, result);
	}
}
