package com.software.express.relatorio;

import java.util.List;

public class FaturamentoPromocao extends AbstractRelatorioFaturamento {

	public Integer calcularTotal(List listaVendas) {
		/*OBS: As regras de geração desse relatório como "valorPadraoVenda" são ilustrativas,
		 * inseridas apenas para fazer os cálculos totatis dos relatórios.
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
