package cl.csantam.interfaces.impl;

import java.util.List;

import cl.csantam.interfaces.CalculadoraBeneficios;

public class CalculadoraCompleja implements CalculadoraBeneficios {

	public Integer calcula(List<Integer> lista) {
		double factor = 1.03;
		Integer sumaTotalVentasInicial = 0;
		Integer sumaFinal = 0;
		
		// Calculo suma total
		for( Integer dato:lista ) {
			sumaTotalVentasInicial+=dato;
		}
		
		
		for( Integer dato:lista) { 
			
			// Caso venta individual entre 500 y 5000
			if (dato > 500 && dato < 1000) {
				factor = 1.02;
				double estaVenta = dato * factor;
				System.out.println( estaVenta);
				sumaFinal += (int) estaVenta;
			}
						
			// Caso venta individual > 1000
			if( dato > 1000 ) {
				factor = 1.05;
				double estaVenta = dato * factor;
				System.out.println( estaVenta);
				sumaFinal += (int)estaVenta;
			}
			
		}
		
		// Otros casos
		// Caso ventas totales > 5000 agrega 100
		if (sumaTotalVentasInicial > 5000) {
			sumaFinal += 100;
		}

		// Beneficio General Caso 1%
		double sumaFinalBeneficioGral = sumaFinal * 1.01;
		sumaFinal = (int) sumaFinalBeneficioGral;
		
		return sumaFinal;
	}

}
