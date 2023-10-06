package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.empleado;
import pkg.empleado.TipoEmpleado;

class empleadoTest {

	empleado empleado = new empleado();
	private float ventaMes;
	private float horaExtra;
	private float nominaBruta;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ventaMes=1000;
		horaExtra=2;
		nominaBruta=2500;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	//Tipos de empleado
	@Test
    void testCalculoNominaBrutaVendedor() {
        float expected=2160;
        float resultado = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, ventaMes, horaExtra);
        assertEquals(expected, resultado);
    }

    @Test
    void testCalculoNominaBrutaEncargado() {
        float expected=2660;
        float resultado = empleado.calculoNominaBruta(TipoEmpleado.Encargado, ventaMes, horaExtra);
        assertEquals(expected, resultado);
    }

    @Test
    void testCalculoNominaBrutaOtro() {
        float expected=2660;
        float resultado = empleado.calculoNominaBruta(TipoEmpleado.Encargado, ventaMes, horaExtra);
        assertEquals(expected, resultado); // Cambia el valor esperado según el comportamiento deseado para "Otro"
    }
	
	//Rango de ventas
    @Test
    void testCalculoNominaBrutaVentasNegativas() {
        float expected=2160;
        float resultado = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, ventaMes, horaExtra);
        assertEquals(expected, resultado); // Cambia el valor esperado según el comportamiento deseado para ventas negativas
    }

    @Test
    void testCalculoNominaBrutaEntre_0_y_1000() {
        float expected=2160;
        float resultado = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, ventaMes, horaExtra);
        assertEquals(expected, resultado);
    }

    @Test
    void testCalculoNominaBrutaEntre_1000_y_1500() {
    	float expected=2660;
        float resultado = empleado.calculoNominaBruta(TipoEmpleado.Encargado, ventaMes, horaExtra);
        assertEquals(expected, resultado);
    }

    @Test
    void testCalculoNominaBrutaMayor1500() {
    	float expected=2160;
        float resultado = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, ventaMes, horaExtra);
        assertEquals(expected, resultado);
    }

    @Test
    void testCalculoNominaBrutaHorasExtrasNegativas() {
    	float horaExtra=-3;
    	float expected=2510;
        float resultado = empleado.calculoNominaBruta(TipoEmpleado.Encargado, ventaMes, horaExtra);
        assertEquals(expected, resultado); 
        // Cambia el valor esperado según el comportamiento deseado para horas extras negativas
    }

    @Test
    void testCalculoNominaBrutaHorasExtrasPositivas() {
    	float horaExtra=3;
        float expected=2190;;
        float resultado = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, ventaMes, horaExtra);
        assertEquals(expected, resultado);
    }
    @Test
    void testCalculNominaNeta() {
        float expected=375f;
        float resultado = empleado.calculNominaNeta(2500);
        assertEquals(expected, resultado);
    }

}
