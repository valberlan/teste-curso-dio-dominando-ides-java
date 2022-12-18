package com.valberlan;

import com.valberlan.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato gato = new Gato();
		Livro livros = new Livro();
		
		System.out.println(gato);
		System.out.println(livros);
		System.out.println();
		
		int a = 12;
		int b = 2022;
		String c = "Parauapebas";
		System.out.println("Hello World! Valberlan Silva - "+ a +"/"+ b +" "+ c);

	}

}

class Livro {
	private String nome;
	private String nPag;
}
