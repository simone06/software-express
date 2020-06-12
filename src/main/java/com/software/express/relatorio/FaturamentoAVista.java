package com.software.express.relatorio;

import java.util.ArrayList;
import java.util.List;

public class FaturamentoAVista extends AbstractRelatorioFaturamento {

	public Integer calcularTotal(List listaVendas) {		
		/*OBS: As regras de gera��o desse relat�rio como "qtdMinimaParcelas" s�o ilustrativas,
		 * inseridas apenas para fazer os c�lculos totatis dos relat�rios.*/
		
		int totalVendasAVista= 0;
		int qtdParcelas = 1;
		
		if(qtdParcelas == 1) {
			for (Object object : listaVendas) {
				totalVendasAVista += (Integer) object;
			}
			
		}		
		return totalVendasAVista;
	}

	

	
}
