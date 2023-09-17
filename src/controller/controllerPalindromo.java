package controller;

import Model.PilhaString;

public class controllerPalindromo {

	PilhaString p = new PilhaString();

	public controllerPalindromo() {
		super();
	}

	public void InvertePalavra(String palavra) throws Exception {
		int tamanho = palavra.length();
		for (int c = 0; c < tamanho; c++) {
			String letra = palavra.substring(c, (c + 1));
			p.push(letra);
			System.out.println(letra);
		}
		verificaPalindromo(palavra);
	}

	public void verificaPalindromo(String palavra) throws Exception {
		String invertida = "";
		while (!p.isEmpty()) {
			invertida = invertida + p.pop();
		}
		System.out.println(palavra);
		System.out.println(invertida);

		if (palavra.equals(invertida)) {
			System.out.println("Palindromo");
		} else {
			System.out.println("Não é palindromo");
		}

	}

}
