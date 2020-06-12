package com.software.express.relatorio;

import java.util.List;

public class FaturamentoParcelado extends AbstractRelatorioFaturamento {

	public Integer calcularTotal(List listaVendas) {
		/*OBS: As regras de gera��o desse relat�rio como "qtdMaximaParcelas" s�o ilustrativas,
		 * inseridas apenas para fazer os c�lculos totatis dos relat�rios.*/
		
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
