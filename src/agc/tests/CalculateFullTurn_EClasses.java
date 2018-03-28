package agc.tests;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import agc.AGCCalculator;
import agc.data.AccelerationByAxes;
import agc.data.FullTurnByAxes;
import agc.exceptions.AGCException;

public class CalculateFullTurn_EClasses {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	//Fichero inexistente
	public void testCPRFG_01() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("", 0, 40);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: invalid path", message);
	}
	
	@Test
	//Archivo correcto para ser capetado y realizar todos los cálculos de accels y gyros
	public void testCPRFG_02() {
		AGCCalculator agcc = new AGCCalculator();
		
		try {
			File file = new File("/ESTARK-Component/tests-json/CE-y-VL/CP-RFG-02.json");
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/CE-y-VL/CP-RFG-02.json", 0, 40);
			boolean ficheroOk = file.isFile();
			
			assertEquals(ficheroOk, true);//comprueba que el fichero existe
		} catch (AGCException ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	//Comprueba que el cálculo de los giros totales son correctos
	public void testCPRF2_08() {
		AGCCalculator agcc = new AGCCalculator();
		
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/CE-y-VL/CP-RF2-08.json", 0, 40);
			FullTurnByAxes resultGyro = new FullTurnByAxes();

			//Comprobacion de Gyros
			assertEquals(5, resultGyro.getFullTurn_X(), 1.0d);
			assertEquals(66, resultGyro.getFullTurn_X(), 1.0d);
			assertEquals(543, resultGyro.getFullTurn_X(), 1.0d);
		} catch (AGCException ex) {
			ex.printStackTrace();
		}
	}

	//TODO CP-RF-USER-INPUT-01
	//TODO CP-RF-USER-INPUT-02
	
	@Test
	//fichero de entrada con sintaxis JSON incorrecta
	public void testCPRFG_04() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("", 0, 40);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: invalid input file syntax", message);
	}

	@Test
	//Time no cumple el formato valido (<YYYY-MM-DD HH:mm:ss.SSS. . . >)
	public void testCPRFG_05() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/CE-y-VL/CP-RFG-05.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: date format does not match <<YYYY-MM-DD HH:mm:ss.SSS...>", message);
	}
	
	@Test
	//Time tiene algun valor negativo
	public void testCPRFG_06() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/CE-y-VL/CP-RFG-06.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Time has negative values", message);
	}
	
	@Test
	//Time no aparece en alguna observación del fichero de entrada
	public void testCPRFG_07() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/CE-y-VL/CP-RFG-07.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Time does not appear in an observation in the input json file", message);
	}
	
	@Test
	//Time aparece mas de una vez para una observacion
	public void testCPRFG_08() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/CE-y-VL/CP-RFG-08.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Time appears more than once in a singular observation", message);
	}
	

	@Test
	//El separador de algun giro no es un punto
	public void testCPRF2_01() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/CE-y-VL/CP-RF2-01.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Separator is not a dot in GYRO axis", message);
	}
	
	@Test
	//algun giro no aparece para una observacion
	public void testCPRF2_02() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/CE-y-VL/CP-RF2-02.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: GYRO missing", message);
	}
	
	
	@Test
	//algun giro esta repetido
	public void testCPRF2_03() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/CE-y-VL/CP-RF2-03.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: GYRO axis has been repeted", message);
	}
	
	@Test
	//algun giro esta repetido
	public void testCPRF2_04() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/CE-y-VL/CP-RF2-04.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: GYRO value no in allowed range", message);
	}
	
//TODO CP-RF2-05

}
