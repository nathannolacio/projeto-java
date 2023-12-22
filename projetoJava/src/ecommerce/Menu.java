package ecommerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao;

		while (true) {

			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("                   DevCommerce                   ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("          1 - Visualizar todos os itens          ");
			System.out.println("          2 - Buscar item                        ");
			System.out.println("          3 - Comprar                            ");
			System.out.println("          4 - Ver carrinho                       ");
			System.out.println("          5 - Adicionar item ao carrinho         ");
			System.out.println("          6 - Sair                               ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("Entre com a opção desejada:                      ");
			System.out.println("                                                 ");

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("\nDevCommerce - Obrigado pela preferência!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1 -> {
					System.out.println("\nVisualizar todos os itens");
				}
				case 2 -> {
					System.out.println("\nBuscar item");
				}
				case 3 -> {
					System.out.println("\nComprar");
				}
				case 4 -> {
					System.out.println("\nVer carrinho");
				}
				case 5 -> {
					System.out.println("\nAdicionar item ao carrinho");
				}
				default -> System.out.println("\nOpção inválida!");
			}
		}

	}

}
