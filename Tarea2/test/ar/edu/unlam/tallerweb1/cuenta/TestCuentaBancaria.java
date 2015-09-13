package ar.edu.unlam.tallerweb1.cuenta;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuentaBancaria {

	@Test
	public void testConsultarSaldo() {
		
		CuentaBancaria cuenta = new CuentaBancaria(1500d);
		assertEquals(1500d, cuenta.consultarSaldo(), 0.01);
	}
	
	@Test
	public void testDepositarSaldo() {
	
		CuentaBancaria cuenta = new CuentaBancaria(1500d);
		cuenta.depositarSaldo(500d);
		
		assertEquals(2000d, cuenta.consultarSaldo(), 0.01);
	}
	
	@Test
	public void testExtraerSaldo() {
	
		CuentaBancaria cuenta = new CuentaBancaria(1500d);
		cuenta.extraer(200);
		
		assertEquals(1300d, cuenta.consultarSaldo(), 0.01);
	}
	
	@Test
	public void testExtraerSaldoNegativo() {
		
		CuentaBancaria cuenta = new CuentaBancaria(1500d);
		cuenta.extraer(-200);
		
		assertFalse(1300d == cuenta.consultarSaldo());
	}
	
	@Test
	public void testExtraerSaldoMayorAlActual() {
		
		CuentaBancaria cuenta = new CuentaBancaria(1500d);
		cuenta.extraer(2000);
		
		assertFalse(-500 == cuenta.consultarSaldo());
	}

}
