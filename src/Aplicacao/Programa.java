package Aplicacao;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
		String num2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
		
		int numero1 = Integer.parseInt(num1);
		int numero2 = Integer.parseInt(num2);
		
		JOptionPane.showMessageDialog(null, numero1 + " + " + numero2 + " = " + (numero1 + numero2));
		
	}

}
