package cl.csantam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cl.csantam.interfaces.CalculadoraBeneficios;
import cl.csantam.interfaces.impl.CalculadoraCompleja;
import cl.csantam.interfaces.impl.CalculadoraSimple;

public class AlgoritmoCalculo {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		
		
		System.out.println("-----------------------------------------------");
		System.out.println("Demostracion Calculo Beneficios para Vendedores");
		System.out.println("-----------------------------------------------");
		System.out.println("\nTomando 10 valores de montos de venta aleatorios... ");
		
		Random r = new Random();
		for(int i = 0; i < 10; i++)			
		  lista.add((int) r.nextInt(2000-100 +1 )+100);
		
		for(Integer dato:lista)
			System.out.print( dato + " " );
		CalculadoraBeneficios calc = new CalculadoraSimple();
		Integer valorBenefAlgoSimple = calc.calcula(lista);
		System.out.println("\n\nBeneficio con Algoritmo Simple:" + valorBenefAlgoSimple + " US$");
		
		CalculadoraBeneficios calc2 = new CalculadoraCompleja();
		Integer valorBenefAlgoComplejo = calc2.calcula(lista);
		System.out.println("\n\nBeneficio con Algoritmo Complejo:" + valorBenefAlgoComplejo + " US$");
		
		
		
	}

}
