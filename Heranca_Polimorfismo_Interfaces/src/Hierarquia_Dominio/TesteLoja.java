package Hierarquia_Dominio;

public class TesteLoja {
	
	public static void main(String[] args) {
	
		Livros livro1 = new Livros();
		Cds Cds1 = new Cds();
		Dvds dvd1 = new Dvds();
		
		
		
		
		livro1.setNome("O alquimista");
		livro1.setPreco(50d);
		livro1.setAutor("Paulo Coelho");
		System.out.println(livro1.toString());
		System.out.println();
		
		Cds1.setNome("Ramones");
		Cds1.setPreco(45d);
		Cds1.setNumeroFaixas("15");
		System.out.println(Cds1.toString());
		System.out.println();
		
		dvd1.setNome("Piratas do Caribe");
		dvd1.setPreco(10d);
		dvd1.setDuracao("1.45");
		System.out.println(dvd1.toString());
		
	}
}
