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

public class CalculateFullTurn_Syntax {

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
	/* Caso de Prueba: T-CP-RFG-01
	* Nodo/s del Árbol de Derivación: Todos
	* Tipo de Prueba: Caso válido, todos los nodos terminales visitados
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Sin errores, cálculo y fichero correctos
	*/
	public void testTreeRFG_01() {
		AGCCalculator agcc = new AGCCalculator();
		try {
			AccelerationByAxes aba = agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-01.json", 0, 40);
			fail("not yet implemented syntax control in agc calculator");
		} catch (AGCException ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	/* Caso de Prueba: T-CP-RFG-02
	* Nodo/s del Árbol de Derivación: Todos excepto 21 y 20
	* Tipo de Prueba: Caso válido, todos los nodos terminales visitados al menos una vez
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Sin errores, cálculo y fichero correctos
	*/
	public void testTreeRFG_02() {
		AGCCalculator agcc = new AGCCalculator();
		try {
			AccelerationByAxes aba = agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-02.json", 0, 20);
			fail("not yet implemented syntax control in agc calculator");
		} catch (AGCException ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	/* Caso de Prueba: T-CP-RFG-03
	* Nodo/s del Árbol de Derivación: Omisión 2 (abre-llaves)
	* Tipo de Prueba: Omisión
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/
	public void testTreeRFG_03() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-03.json", 0, 40);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, missing \"{\" ", message);
	}
	
	@Test
	/* Caso de Prueba: T-CP-RFG-04
	* Nodo/s del Árbol de Derivación: Omisión 3 (DATOS)
	* Tipo de Prueba: Omisión
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/
	public void testTreeRFG_04() {

		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-04.json", 0, 40);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, missing data inside structure", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-05
	* Nodo/s del Árbol de Derivación: Omisión 12 (cierra-corchetes)
	* Tipo de Prueba: Omisión
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/
	public void testTreeRFG_05() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-05.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, missing \"]\"", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-06
	* Nodo/s del Árbol de Derivación: Omisión 23 (abre-llaves)
	* Tipo de Prueba: Omisión
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/
	public void testTreeRFG_06() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-06.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, missing \"]\"", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-07
	* Nodo/s del Árbol de Derivación: Omisión 25 (cierra-llaves)
	* Tipo de Prueba: Omisión
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/
	public void testTreeRFG_07() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-07.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, missing \"}\"", message);
	}
	
	@Test
	/* Caso de Prueba: T-CP-RFG-08
	* Nodo/s del Árbol de Derivación: Omisión 24 (OBSERVACION)
	* Tipo de Prueba: Omisión
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/
	public void testTreeRFG_08() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-08.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, missing observation", message);
	}
	
	@Test
	/* Caso de Prueba: T-CP-RFG-09
	* Nodo/s del Árbol de Derivación: Omisión 47, 48, 49 (el valor de la fecha)
	* Tipo de Prueba: Omisión
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error semántico en fecha.
	*/
	public void testTreeRFG_09() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-09.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, missing time values", message);
	}
	
	@Test
	/* Caso de Prueba: T-CP-RFG-10
	* Nodo/s del Árbol de Derivación: Omisión 32 (GYRO-X)
	* Tipo de Prueba: Omisión
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/
	public void testTreeRFG_10() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-10.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, missing GYRO data", message);
	}
	
	@Test
	/* Caso de Prueba: T-CP-RFG-11
	* Nodo/s del Árbol de Derivación: Omisión 31 (COMA)
	* Tipo de Prueba: Omisión
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/

	public void testTreeRFG_11() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-11.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, missing \",\"", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-12
	* Nodo/s del Árbol de Derivación: Omisión 14 (COMILLAS)
	* Tipo de Prueba: Omisión
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/
	public void testTreeRFG_12() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-12.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, missing \" ", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-13
	* Nodo/s del Árbol de Derivación: Omisión 72 (HORA)
	* Tipo de Prueba: Omisión
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error semántico en fecha.
	*/
	public void testTreeRFG_13() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-13.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, missing HOUR value", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-14
	* Nodo/s del Árbol de Derivación: 52 (ET-G-X)
	* Tipo de Prueba: Omisión
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/
	public void testTreeRFG_14() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-14.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, missing GYRO label", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-15
	* Nodo/s del Árbol de Derivación: 55 (CIFRA)
	* Tipo de Prueba: Omisión
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/
	public void testTreeRFG_15() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-15.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, missing GYRO value", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-16
	* Nodo/s del Árbol de Derivación: 2 ({)
	* Tipo de Prueba: Adición
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/
	public void testTreeRFG_16() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-16.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, \"{\" has not been closed", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-17
	* Nodo/s del Árbol de Derivación: 3 (DATOS)
	* Tipo de Prueba: Adición
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/
	public void testTreeRFG_17() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-17.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, data structure invalid", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-18
	* Nodo/s del Árbol de Derivación: 24 (OBSERVACION)
	* Tipo de Prueba: Adición
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/

	public void testTreeRFG_18() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-18.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, data structure invalid", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-19
	* Nodo/s del Árbol de Derivación: 12 (CIERRA-CORCHETES)
	* Tipo de Prueba: Adición
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/

	public void testTreeRFG_19() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-19.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, innecesary \"]\"", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-20
	* Nodo/s del Árbol de Derivación: 32 (GYRO-X)
	* Tipo de Prueba: Adición
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/

	public void testTreeRFG_20() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-20.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, innecesary \"]\"", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-21
	* Nodo/s del Árbol de Derivación: 6 (COMILLAS)
	* Tipo de Prueba: Adición
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/

	public void testTreeRFG_21() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-21.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, innecesary \" ", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-22
	* Nodo/s del Árbol de Derivación:30, 31 (FECHA y COMA)
	* Tipo de Prueba: Adición
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/
	public void testTreeRFG_22() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-22.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, time repeated for a singular observation ", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-23
	* Nodo/s del Árbol de Derivación:73 (DOS-PUNTOS)
	* Tipo de Prueba: Adición
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error semántico en fecha.
	*/
	public void testTreeRFG_23() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-23.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, innecesary \":\" ", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-24
	* Nodo/s del Árbol de Derivación:  55 (CIFRA)
	* Tipo de Prueba: modificacion
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/
	public void testTreeRFG_24() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-24.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, repeted GYRO data ", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-25
	* Nodo/s del Árbol de Derivación:  27 (cambio { por ( )
	* Tipo de Prueba: modificacion
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/
	public void testTreeRFG_25() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-25.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, missing {", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-26
	* Nodo/s del Árbol de Derivación:  15 (Data -> Datos)
	* Tipo de Prueba: modificacion
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error semántico en Data.
	*/
	public void testTreeRFG_26() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-26.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, bad data label", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-27
	* Nodo/s del Árbol de Derivación:  18 ( ’[’ -> ’=’)
	* Tipo de Prueba: modificacion
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error de sintaxis del fichero.
	*/
	public void testTreeRFG_27() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-27.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, missing [", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-28
	* Nodo/s del Árbol de Derivación:  81 (GYRO-X -> GYRO-EJE-X)
	* Tipo de Prueba: modificacion
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error semántico en Gyro.
	*/
	public void testTreeRFG_28() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-28.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, bad GYRO label ", message);
	}

	@Test
	/* Caso de Prueba: T-CP-RFG-29
	* Nodo/s del Árbol de Derivación:  90 ( ’-’ -> ’:’)
	* Tipo de Prueba: modificacion
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error semántico en fecha.
	*/
	public void testTreeRFG_29() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-29.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, missing - ", message);
	}
	
	@Test
	/* Caso de Prueba: T-CP-RFG-30
	* Nodo/s del Árbol de Derivación:  102 (’.’ -> ’,’)
	* Tipo de Prueba: modificacion
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error semántico en cifra de Gyro.
	*/
	public void testTreeRFG_30() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-30.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, GYRO number separator not valid", message);
	}
	
	@Test
	/* Caso de Prueba: T-CP-RFG-31
	* Nodo/s del Árbol de Derivación:  119, 120 (cifras sustituidas por letras)
	* Tipo de Prueba: modificacion
	* Técnica de prueba: Análisis Sintáctico 
	* Resultado Esperado: Error semántico  en cifra de Gyro.
	*/
	public void testTreeRFG_31() {
		AGCCalculator agcc = new AGCCalculator();
		String message = "";
		try {
			agcc.CalculateMinMaxAcceleration("/ESTARK-Component/tests-json/Tree-syntax/T-CP-RFG-31.json", 0, 20);
		} catch (AGCException ex) {
			message = ex.getMessage();
		}
		assertEquals("Error: Syntax error, invalid GYRO values", message);
	}














	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
