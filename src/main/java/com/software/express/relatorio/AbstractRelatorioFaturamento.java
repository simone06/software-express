package com.software.express.relatorio;

import java.util.List;

abstract class AbstractRelatorioFaturamento implements Relatorio {

 public	Float aplicarTaxas(Integer valorVenda, List<Float> valorTaxas) {		
	 Float aplicarUmaTaxa = 0F;

		if (valildarTaxas(valorTaxas)) {
			for (Float taxa : valorTaxas) {
				aplicarUmaTaxa += (valorVenda * (taxa/100));
				
			}
          
		}
		return aplicarUmaTaxa;

	}

	static Boolean valildarTaxas(List<Float> valorTaxas) {
		for (Float taxa : valorTaxas) {
			if (taxa < 0 || taxa > 100) {
				System.out.println("A taxa dever ser um número ente 0 e 100");
				return false;
			}

		}
		return true;
	}

}
