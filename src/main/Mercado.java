package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import modelo.Produto;

public class Mercado {
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Produto> produtos;
	private static Map<Produto, Integer> carrinho;
	
	public static void main (String[]args) {
		produtos = new ArrayList<>();
		carrinho = new HashMap<>();
		menu();
	}
	
private static void menu() {
		
		
		System.out.println("*****************************************************");
		System.out.println("                Bem Vindo ao Mercado                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("      Selecione uma Operação que Deseja Realizar     ");
		System.out.println("*****************************************************");
		System.out.println("*****************************************************");
		System.out.println("|    Opção 1 - Cadastrar    |");
		System.out.println("|    Opção 2 - Listar       |");
		System.out.println("|    Opção 3 - Comprar      |");
		System.out.println("|    Opção 4 - Carrinho     |");
		System.out.println("|    Opção 5 - Sair         |");
		System.out.println("                            |");
		System.out.println("*****************************************************");
		
		
		int option = input.nextInt();
		
		
		
   }
}