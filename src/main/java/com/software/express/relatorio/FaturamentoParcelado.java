package com.software.express.relatorio;

import java.util.List;

public class FaturamentoParcelado extends AbstractRelatorioFaturamento {

	public Integer calcularTotal(List listaVendas) {
		/*OBS: As regras de geração desse relatório como "qtdMaximaParcelas" são ilustrativas,
		 * inseridas apenas para fazer os cálculos totatis dos relatórios.*/
		
		int totalVendasParcelada = 0;
		int qtdMaximaParcelas = 3;
		
		if(qtdMaximaParcelas >=1 && qtdMaximaParcelas <= 3 ) {
			for (Object object : listaVendas) {
				totalVendasParcelada += (Integer) object;
			}
			
		}
		
		return totalVendasParcelada;
	}



	
}
