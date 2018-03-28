package agc.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import agc.AGCCalculator;
import agc.data.AccelerationByAxes;
import agc.exceptions.AGCException;

public class CalculateMinMaxAcceleration_EClasses {

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
		assertEquals(3, 3);
	}
	
	
	@Test
	//comprueba que las aceleraciones min-max calculadas son correctas
	public void testRF1_07() {
		AGCCalculator agcc = new AGCCalculator();
		try {
			AccelerationByAxes aba = agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/CE-y-VL/CP-RF1-07.json", 0, 40);
			assertEquals(1, aba.getX_Axis().getMinAcceleration(), 1.0d);
			assertEquals(1, aba.getY_Axis().getMinAcceleration(), 1.0d);
			assertEquals(1, aba.getZ_Axis().getMinAcceleration(), 1.0d);
			assertEquals(1, aba.getX_Axis().getMaxAcceleration(), 1.0d);
			assertEquals(1, aba.getY_Axis().getMaxAcceleration(), 1.0d);
			assertEquals(1, aba.getZ_Axis().getMaxAcceleration(), 1.0d);
		} catch (AGCException ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	//comprueba que la precisión de las aceleraciones del fichero de entrada tiene 3 o más decimales
	public void testRF1_01() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/CE-y-VL/CP-RF1-01.json", 0, 40);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: min-max accels do not match the compulsory 3 digits or more", message);
	}

	//TODO CP-RF1-04
	
	//TODO CP-RF1_05
	
	@Test
	//comprueba que las aceleraciones min-max calculadas son correctas
	public void testRF1_06() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/CE-y-VL/CP-RF1-06.json", 0, 40);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: calculation interval is not 20ms", message);
	}
	
	
}
