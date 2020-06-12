package com.software.express.controle.estoque;


import java.util.ArrayList;
import java.util.List;

import com.software.express.relatorio.FaturamentoAVista;
import com.software.express.relatorio.FaturamentoParcelado;
import com.software.express.relatorio.FaturamentoPromocao;
import com.software.express.relatorio.Relatorio;
import com.software.express.relatorio.RelatorioCanetasEmEstoque;
import com.software.express.util.Util;

public class Main {
	public static void main(String[] args) {		
		Estoque doisEmUm  = new DoisEmUm();
		System.out.println("RETORNA O DOBRO DO NUMERO PASSADO: "+doisEmUm.calcular(2));
		 
//####################################################		 
		
		List<Integer> Lista = new ArrayList<Integer>(); 
		Lista.add(10);
		Lista.add(20);
		Lista.add(30);
		Lista.add(40);
		Lista.add(50);
		Campanha campanha = new Campanha();
		System.out.println("RETORNA O DOBRO DE CADA ELEMENTO DA LISTA: " +campanha.calcularPromocao(Lista)); 
//#############################################################################################		
		// trás o total de canetas em estoque
		ArrayList<Integer> canetas = new ArrayList();
		canetas.add(3);
		canetas.add(-4);
		Relatorio canetasEmEstoque = new RelatorioCanetasEmEstoque();		
		System.out.println("O TOTAL DE CANETAS EM ESTOQUE É: "+canetasEmEstoque.calcularTotal(canetas));
//#############################################################################################		 
		// aplicação das taxas para cada classe que herda de AbstractRelatorioFaturamento
		 List<Float> listataxasAVista = new ArrayList<Float>();
		 listataxasAVista.add((float) 15.0);	
		 listataxasAVista.add((float) 3.0);
		 FaturamentoAVista faturamentoAVista = new FaturamentoAVista();		
		 System.out.println( faturamentoAVista.aplicarTaxas(33, listataxasAVista));		 
		 
		 List<Float> listataxasParcelado = new ArrayList<Float>();
		 listataxasParcelado.add((float) 18.0);	
		 listataxasParcelado.add((float) 10.0);
		 listataxasParcelado.add((float) 22.0);
		 FaturamentoParcelado faturamentoParcelado = new FaturamentoParcelado();		
		  System.out.println( faturamentoParcelado.aplicarTaxas(100, listataxasParcelado));
		
		 
		List<Float> listataxasPromocao= new ArrayList<Float>();
		listataxasPromocao.add((float) 101);			
		FaturamentoPromocao faturamentoPromocao = new FaturamentoPromocao();		
		System.out.println( faturamentoPromocao.aplicarTaxas(45, listataxasPromocao)); 
		  
//#############################################################################################
		
		// aplicação das taxas para cada classe que herda de AbstractRelatorioFaturamento
				 List listaVendasAVista = new ArrayList();
				// List listaValorComCentavos = new ArrayList();
				 listaVendasAVista.add(1.23);
				 listaVendasAVista.add(5.42);
				 listaVendasAVista.add(10.86);				 
					
				 System.out.println("TOTAL RELATORIO FATURAMENTO A VISTA: " + faturamentoAVista.calcularTotal(Util.ConverterCentavosEmInteiro(listaVendasAVista)));		 
				 
				 List listaVendasParcelado = new ArrayList();
				 listaVendasParcelado.add(13.98);	
				 listaVendasParcelado.add(22.67);						
				 System.out.println("TOTAL RELATORIO FATURAMENTO PARCELADO: " + faturamentoParcelado.calcularTotal(Util.ConverterCentavosEmInteiro(listaVendasParcelado)));
				
				 
				List listaVendasPromocao= new ArrayList();
				listaVendasPromocao.add(1.2);			
				listaVendasPromocao.add(1.1);
				listaVendasPromocao.add(1.0);
				//FaturamentoPromocao faturamentoPromocao = new FaturamentoPromocao();		
				 System.out.println("TOTAL RELATORIO FATURAMENTO PROMOCIONAL: " + faturamentoPromocao.calcularTotal(Util.ConverterCentavosEmInteiro(listaVendasPromocao)));
		 
	}



}
