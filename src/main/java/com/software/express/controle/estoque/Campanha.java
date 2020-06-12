package com.software.express.controle.estoque;

import java.util.ArrayList;
import java.util.List;

public class Campanha {

	List<Integer> calcularPromocao(List<Integer> listaValores) {
		DoisEmUm doisEmUm = new DoisEmUm();
		List<Integer> listaValoresEmDobbro = new ArrayList<Integer>();

		for (Integer valor : listaValores) {
			
			listaValoresEmDobbro.add(doisEmUm.calcular(valor));
		}

		return listaValoresEmDobbro;
	}
	
 /*Foi utilizado o conceito de sobrecarga para que a classe tivesse 
  * esses dois métodos com os mesmos nomes.
  */  
	List<Integer> calcularPromocao(List<Integer> listaValores, Estoque estoque) {
		List<Integer> listaValoresRetorno = new ArrayList<Integer>();

		for (Integer valor : listaValores) {
			listaValoresRetorno.add(estoque.calcular(valor));
		}

		return listaValoresRetorno;
	}
}
