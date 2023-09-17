package view;

import javax.swing.JOptionPane;

import controller.controllerPalindromo;

public class Principal {

	public static void main(String[] args) throws Exception {
		String palavra = JOptionPane.showInputDialog("Digite palavra para verificar se é um palíndromo");
		controllerPalindromo cp = new controllerPalindromo();
		cp.InvertePalavra(palavra);

	}

}
