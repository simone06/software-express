package com.software.express.relatorio;

import java.util.List;

public class FaturamentoPromocao extends AbstractRelatorioFaturamento {

	public Integer calcularTotal(List listaVendas) {
		/*OBS: As regras de gera��o desse relat�rio como "valorPadraoVenda" s�o ilustrativas,
		 * inseridas apenas para fazer os c�lculos totatis dos relat�rios.
		 * */
		int totalVendasPromocao= 0;
		Integer valorPadraoVenda = 35;
		
		
			for (Object object : listaVendas) {
				if(valorPadraoVenda.compareTo((Integer) object) == 1) {
				totalVendasPromocao += (Integer) object;
			}
			
		}		
		return totalVendasPromocao;
	}




}
