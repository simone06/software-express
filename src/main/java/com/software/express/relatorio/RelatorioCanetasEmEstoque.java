package com.software.express.relatorio;

import java.util.List;

public class RelatorioCanetasEmEstoque implements Relatorio {

	public Integer calcularTotal(List valorEventoEstoque) {
		Integer totalEstoque = 0;		
		int aux = -1;
		int total = 0;
		
		if (valorEventoEstoque == null || valorEventoEstoque.isEmpty()) {
			return totalEstoque;
		}
			for (Object object : valorEventoEstoque) {
				aux = (Integer) object;
				total = total + aux;			
				aux = 50;
			}
			totalEstoque = new Integer(total * aux);
		

		return totalEstoque;
	}	

}
