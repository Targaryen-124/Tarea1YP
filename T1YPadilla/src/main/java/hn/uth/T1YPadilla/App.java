package hn.uth.T1YPadilla;

import java.util.Scanner;
import java.lang.Math;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Menu de Opciones de Calculos");
    	System.out.println("\t1. Calcular el área de un círculo");
		System.out.println("\t2. Calcular el área de un cuadrado");
		System.out.println("\t3. Calcular el área de un rectángulo");
		System.out.println("\t4. Calcular el área de un triángulo");
		System.out.print("Ingrese la opcion: ");
		int opcion = sc.nextInt();
		
		if (opcion==1) {
			System.out.println("Selecciono Calcular el área de un círculo");
			System.out.print("Ingrese el Radio: ");
			double radio = sc.nextDouble();
			sc.close();
			aCirculo(radio);
		}
		
		if (opcion==2) {
			System.out.println("Selecciono Calcular el área de un cuadrado");
			System.out.print("Ingrese el Lado del cuadrado: ");
			double lado = sc.nextDouble();
			sc.close();
			aCuadrado(lado);
		}
		
		if (opcion==3) {
			System.out.println("Selecciono Calcular el área de un rectángulo");
			System.out.print("Ingrese la Base: ");
			double base= sc.nextDouble();
			System.out.print("Ingrese la Altura: ");
			double altura= sc.nextDouble();
			sc.close();
			aRectangulo(base,altura);
		}
		
		if (opcion==4) {
			System.out.println("Selecciono Calcular el área de un triángulo");
			System.out.print("Ingrese la Base: ");
			double base= sc.nextDouble();
			System.out.print("Ingrese la Altura: ");
			double altura= sc.nextDouble();
			sc.close();
			aTriangulo(base,altura);
		}
    }
    
    public static double aCirculo(double radio) {
    	double resul = (radio*radio)*Math.PI;
    	System.out.println("El area es de: " + resul);
		return resul;
	}
    
    public static double aCuadrado(double lado) {
    	double resul = lado*lado;
    	System.out.println("El area es de: " + resul);
		return resul;
	}
    
    public static double aTriangulo(double base, double altura) {
    	double resul = (base*altura)/2;
    	System.out.println("El area es de: " + resul);
		return resul;
	}
    
    public static double aRectangulo(double base, double altura) {
    	double resul = base*altura;
    	System.out.println("El area es de: " + resul);
		return resul;
	}
    
}
