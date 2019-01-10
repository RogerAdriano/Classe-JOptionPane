package Aplicacao;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome: ");
		
		String menssagem = String.format("Bem vindo, %s, a programação Java!", nome);  // String.format() formata e retorna uma String
		
		JOptionPane.showMessageDialog(null, menssagem);
	}

}
