package cl.csantam;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import cl.csantam.interfaces.CalculadoraBeneficios;
import cl.csantam.interfaces.impl.CalculadoraCompleja;
import cl.csantam.interfaces.impl.CalculadoraSimple;

public class AlgotirmoCalculoTest {

	@Test
	public void testCasoSimple() {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(600);
		lista.add(800);
		lista.add(1500);
		CalculadoraBeneficios calc = new CalculadoraSimple();
		Integer valorBenefAlgoSimple = calc.calcula(lista);
		Integer valorEsperado = 2987;
		Integer valorObtenido = valorBenefAlgoSimple;
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void testCasoComplejo() {
		System.out.println("Complejo");
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(600);
		lista.add(800);
		lista.add(1500);
		CalculadoraBeneficios calc = new CalculadoraCompleja();
		Integer valorBenefAlgoComplejo = calc.calcula(lista);
		System.out.println( valorBenefAlgoComplejo);

		Integer valorEsperado = 3033;
		Integer valorObtenido = valorBenefAlgoComplejo;
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void testCondDeBordeSimple() {
		System.out.println("Caso Borde Simple");
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(0);
		lista.add(400);
		
		CalculadoraBeneficios calc = new CalculadoraSimple();
		Integer valorBenefAlgoSimple = calc.calcula(lista);
		
		Integer valorEsperado = (int)(400.0 * 1.03);
		Integer valorObtenido = valorBenefAlgoSimple;
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void testCondDeBordeComplejo() {
		System.out.println("Caso Borde Complejo****");
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(0);
		lista.add(400);
		lista.add(6000);
		
		CalculadoraBeneficios calc = new CalculadoraCompleja();
		Integer valorBenefAlgoComplejo = calc.calcula(lista);
		
		Integer valorEsperado = (int)((0.0 + 400.0  + 6000.0 * 1.05)) + 100 + 64;
		
		Integer valorObtenido = valorBenefAlgoComplejo;
		System.out.println("Valor Esperado:" +  valorEsperado);
		System.out.println("valor algo complejo borde:" + valorObtenido);
	}
	
}

