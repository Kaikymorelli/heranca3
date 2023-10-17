package Produto;

public class Produto2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Produto produto = new Produto(1,"Kaiky",300);
		System.out.println("id: "+produto.getId());
		System.out.println("nome: " +produto.getNome());
		System.out.println("preco: "+produto.getPreco());


		Sorvete sorvete = new Sorvete(10);
		System.out.println("tempo adequado: "+sorvete.getTempAdequada());


		Camisa camisa = new Camisa("Preta e vermelha", "seda", "16");
		System.out.println("cor: "+camisa.getCor());
		System.out.println("tecido: "+camisa.getTecido());
		System.out.println("tamanho"+camisa.getTamanho());

		}
}
