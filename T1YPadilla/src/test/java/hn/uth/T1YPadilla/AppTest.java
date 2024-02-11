package hn.uth.T1YPadilla;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	private Random rd;
	
	@BeforeClass
	public static void inicializacion1()
	{
		System.out.println("Ejecutando Prueba");
	}
	
	@Before
	public void inicializacion()
	{
		rd = new Random();
	}
	
	@Test
	public void areaCirculo1()
	{
		assertEquals(App.aCirculo(4),4,16);
	}
	
	@Test
	public void areaCirculo2()
	{
		assertNotNull(App.aCirculo(0.5));
	}
	
	@Test
	public void areaCirculo3()
	{
		double radio = rd.nextDouble();
		assertTrue(App.aCirculo(radio) == 0);
	}
	
	@AfterClass
	public static void finalizacion()
	{
		System.out.println("");
		System.out.println("Prueba Finalizada");
	}

}
