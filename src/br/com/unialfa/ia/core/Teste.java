package br.com.unialfa.ia.core;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import br.com.unialfa.ia.core.model.Grafo;
import br.com.unialfa.ia.core.model.Vertice;

public class Teste {

	public static void main(String[] args) {
		Vertice goiania = new Vertice("Goiania");
		Vertice belaVista = new Vertice("Bela Vista de Goi�s");
		Vertice caldasNovas = new Vertice("Caldas Novas");
		Vertice morrinhos = new Vertice("Morrinhos");
		Vertice edeia = new Vertice("Edeia");
		Vertice hidrolandia = new Vertice("Hidrolandia");
		Vertice silvania = new Vertice("Silvania");
		Vertice vianapolis = new Vertice("Orizona");
		Vertice ipameri = new Vertice("Ipameri");
		Vertice pontalina = new Vertice("Pontalina");
		Vertice piracanjuba = new Vertice("Piracanjuba");
		Vertice orizona = new Vertice("Orizona");

		Vertice[] cidades = { goiania, belaVista, caldasNovas, morrinhos, edeia, hidrolandia, silvania, vianapolis,
				ipameri, pontalina, piracanjuba, orizona };
		
		goiania.adicionarDestino(belaVista, 481);
		goiania.adicionarDestino(edeia, 124);
		goiania.adicionarDestino(hidrolandia, 33);
		goiania.adicionarDestino(silvania, 67);

		belaVista.adicionarDestino(caldasNovas, 117);

		edeia.adicionarDestino(pontalina, 69);

		pontalina.adicionarDestino(morrinhos, 124);

		morrinhos.adicionarDestino(caldasNovas, 57);

		hidrolandia.adicionarDestino(piracanjuba, 70);
		hidrolandia.adicionarDestino(morrinhos, 90);

		silvania.adicionarDestino(vianapolis, 18);

		vianapolis.adicionarDestino(orizona, 46);

		orizona.adicionarDestino(ipameri, 95);

		ipameri.adicionarDestino(caldasNovas, 61);

		Grafo grafo = new Grafo();
		
		grafo.adicionarVertice(goiania);
		grafo.adicionarVertice(belaVista);
		grafo.adicionarVertice(caldasNovas);
		grafo.adicionarVertice(hidrolandia);
		grafo.adicionarVertice(pontalina);
		grafo.adicionarVertice(orizona);
		grafo.adicionarVertice(morrinhos);
		grafo.adicionarVertice(edeia);
		grafo.adicionarVertice(silvania);
		grafo.adicionarVertice(vianapolis);
		grafo.adicionarVertice(piracanjuba);
		grafo.adicionarVertice(ipameri);
		
		
		grafo.listarVertices();

		System.out.println("####"+Integer.MAX_VALUE+"###");
		
		Grafo novoGrafo = grafo.calcularMenorCaminhodaOrigem(grafo, goiania);
		
		System.out.println("=============================================");
//	
		
		novoGrafo.solucao(caldasNovas);
	}

}
