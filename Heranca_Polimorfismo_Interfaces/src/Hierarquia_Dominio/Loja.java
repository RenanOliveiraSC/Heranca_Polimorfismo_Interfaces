package Hierarquia_Dominio;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {

		List<Livros> livros = new ArrayList<>();
		List<Cds> cds = new ArrayList<>();
		List<Dvds> dvd = new ArrayList<>();

		Livros livro1 = new Livros("O alquimista", 50d, 1566516516, "Paulo Coelho");
		livros.add(livro1);
		Livros livro2 = new Livros("El Chappo", 65d, 45678798, "Roberto G�mez Bola�os");
		livros.add(livro2);

		Cds cds1 = new Cds("Ramones", 45d, 358574354, "15");
		cds.add(cds1);
		Cds cds2 = new Cds("Billy Idol", 55d, 156789434, "24");
		cds.add(cds2);

		Dvds dvd1 = new Dvds("Piratas do Caribe", 15d, 365418934, "1.45");
		dvd.add(dvd1);
		Dvds dvd2 = new Dvds("Dr�cula", 10d, 365417934, "1.38");
		dvd.add(dvd2);

		System.out.println(livro1 + "\n" + livro2 + "\n" + cds1 + "\n" + cds2 + "\n" + dvd1 + "\n" + dvd2);
		System.out.println();
		System.out.println("A compara��o entre os c�digos de barras do DVD1 e DVD2: " + dvd1.equals(dvd2));

		//Para buscar um produto e mostrar em qual posi��o ele est�, deve ser usado como base o exercicio da mega sena, onde � criado
		//um m�todo para buscar.
		}
	}
}
