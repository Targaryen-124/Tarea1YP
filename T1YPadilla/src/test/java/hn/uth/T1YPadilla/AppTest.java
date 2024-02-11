package hn.uth.T1YPadilla;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
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
		assertEquals(App.aCirculo(4),50.26548,0.1);
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
		assertTrue(App.aCirculo(radio) > 0);
	}
	
	@Test
	public void areaCuadrado1()
	{
		assertEquals(App.aCuadrado(4),4,16);
	}
	
	@Test
	public void areaCuadrado2()
	{
		assertNotNull(App.aCuadrado(0.5));
	}
	
	@Test
	public void areaCuadrado3()
	{
		double radio = rd.nextDouble();
		assertTrue(App.aCuadrado(radio) > 0);
	}
	
	@Test
	public void areaTriangulo1()
	{
		assertEquals(App.aTriangulo(12,15),90,0);
	}
	
	@Test
	public void areaTriangulo2()
	{
		assertNotNull(App.aTriangulo(12,15));
	}
	
	@Test
	public void areaTriangulo3()
	{
		double base = rd.nextDouble();
		double altura = rd.nextDouble();
		assertTrue(App.aTriangulo(base,altura) > 0);
	}
	
	@Test
	public void areaRectangulo()
	{
		assertEquals(App.aRectangulo(12,15),180,0);
	}
	
	@Test
	public void areaRectangulo2()
	{
		assertNotNull(App.aRectangulo(12,15));
	}
	
	@Test
	public void areaRectangulo3()
	{
		double base = rd.nextDouble();
		double altura = rd.nextDouble();
		assertTrue(App.aRectangulo(base,altura) > 0);
	}
	
	@AfterClass
	public static void finalizacion()
	{
		System.out.println("");
		System.out.println("Prueba Finalizada");
	}

}
