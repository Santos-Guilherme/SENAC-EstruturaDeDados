package RevisaoED;

import javax.swing.JOptionPane;

public class Executor {
	public static void main(String []args) {
		try {
		Vetor vetor = new Vetor(5);
		
		
		vetor.adicionar("elemento 1");
		vetor.adicionar("elemento 2");
		vetor.adicionar("elemento 3");
		vetor.adicionar("elemento 4");
		vetor.adicionar("elemento 5");
		vetor.adicionar("elemento 6");
		vetor.adicionar("elemento 7");
		vetor.adicionar("elemento 8");
	
		System.out.println("O tamanho do vetor é "+ vetor.tamanho());
		
		System.out.println(vetor.toString());
		
		/*
		String elementoBuscado = vetor.busca(Integer.parseInt(JOptionPane.showInputDialog("Digite o indice que deseja buscar:")));
		System.out.println(elementoBuscado);
		
		
		int indiceBuscado = vetor.buscaN(JOptionPane.showInputDialog("Digite o elemento que está buscando:"));
		System.out.println(indiceBuscado);
		*/
		
		vetor.remove(Integer.parseInt(JOptionPane.showInputDialog("Digite o indice do elemento que deseha remover:")));
		
		
		System.out.println("O tamanho do vetor é "+ vetor.tamanho());
		System.out.println(vetor.toString());
		
		String elementoBuscado = vetor.busca(Integer.parseInt(JOptionPane.showInputDialog("Digite o indice que deseja buscar:")));
		System.out.println(elementoBuscado);
		
		System.out.println(vetor.toString());
		}
		
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
