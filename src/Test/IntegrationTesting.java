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
	void testCase_01() throws FileNotFoundException { // Ivan & Andela/Cyrus & Dusica
		String filename = "test";
		InputRead.readFile(filename);
		FloydWarshall.calShortestDist();
		Stable_Matching.setScore();
		Stable_Matching.stable_match();
		String result = "";
		for (Female f : Stable_Matching.females) {
			result += f.getPartner().fullName;
		}
		String expectedResult = "IvanTimur";
		assertEquals(expectedResult, result);
	}

	@Test
	void testCase_02() throws FileNotFoundException { 
		String filename = "test_testingStableMatch";
		InputRead.readFile(filename);
		double dist[][] = FloydWarshall.calShortestDist();
		Stable_Matching.setScore();
		Stable_Matching.stable_match();
		String result = "";
		for (Female f : Stable_Matching.females) {
			
			result += f.getPartner().fullName;
			
		}
		String expectedResult = "IbanTimurIvan";
		assertEquals(expectedResult, result);
	}
}
