package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Sorvete;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Sorvete> lista = new ArrayList<>();

		int opcao, id;
		String tipo;

		do {
			System.out.println("Bem-vindo!");
			System.out.println("=====================================================");
			System.out.println("Sistema de controle de estoque da Sorveteria Igarapé");
			System.out.println("=====================================================");
			System.out.println("Escolha uma opção: ");
			System.out.println("=====================================================");
			System.out.println("[1] - Adicionar itens");
			System.out.println("[2] - Remover itens");
			System.out.println("[3] - Listar os itens do estoque");
			System.out.println("[4] - Sair");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1: // Adiciona itens ao estoque
				System.out.println("Digite o ID do produto: ");
				id = sc.nextInt();
				System.out.println("Por favor, digite o sabor: ");
				sc.nextLine();
				String sabor = sc.nextLine().toUpperCase();
				System.out.println("Informe o tipo: ");
				tipo = sc.nextLine().toUpperCase();
				System.out.println("Digite o valor: ");
				double valor = sc.nextDouble();
				lista.add(new Sorvete(id, sabor, tipo, valor));
				break;

			case 2: // Remove itens do estoque
				System.out.println("Por favor informe o ID do produdo a ser removido:");
				id = sc.nextInt();
				lista.remove(id);
				System.out.println("Produto removido com sucesso!");
				System.out.println("=====================================================");
				break;

			case 3: // Lista os itens cadastrados
				System.out.println();
				System.out.println("Itens cadastrados: ");
				for (Sorvete obj : lista) {
				System.out.println(obj);
				System.out.println("=====================================================");
				}
				break;

			case 4: // Lógica de saída do programa
				System.out.println("FIM!");

			default:
				System.out.println("Opção inválida, tente novamente!");
			}

		} while (opcao != 4);
	}
}
