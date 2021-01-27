package cl.csantam.interfaces.impl;

import java.util.ArrayList;
import java.util.List;

import cl.csantam.interfaces.CalculadoraBeneficios;

public class CalculadoraSimple  implements CalculadoraBeneficios{
	
	

	public CalculadoraSimple() {
		super();
	}

	public Integer calcula(List<Integer> lista) {
		// TODO Auto-generated method stub
		double factor = 1.03;
		Integer valorFinal = 0;
		for( Integer dato:lista) {
			double nuevoValor =  dato * factor;
			Integer nuevoValorInt = (int) nuevoValor;
			valorFinal += nuevoValorInt;
		}
		return valorFinal;
	}

}
