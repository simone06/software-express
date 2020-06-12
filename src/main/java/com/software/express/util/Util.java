package com.software.express.util;

import java.util.ArrayList;
import java.util.List;

public class Util {
	/*METODO FEITO PARA APICAR A SEGUINTE REGRA :
	 * Para Preços de produtos e valores de venda/compra, considerar valores como inteiros, em centavos.
      Exemplo: 1,99 -> representado no Sistema como 199. Neste caso, estou passando uma lista com os valores de venda*/
	
	public static List<Integer> ConverterCentavosEmInteiro(List ListaValorVenda) {
		 List<Integer> listaValorEmInteiro = new ArrayList<Integer>();
		 String valorEmString;
		 int valorEminteiro;		 
		 
		 for (Object object : ListaValorVenda) {
			 valorEmString =String.valueOf(object);			
			 valorEminteiro = Integer.parseInt(valorEmString.replace(".",""));
			 listaValorEmInteiro.add(valorEminteiro);
		}		
		
		return listaValorEmInteiro;
		

	}

}
