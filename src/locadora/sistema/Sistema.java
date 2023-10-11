package locadora.sistema;

import java.util.Scanner;

import locadora.login.Login;

public class Sistema {
	
	private Login login = new Login();
	
	public void telaInicial() 
	{
		System.out.println("-------------------------------");
		System.out.println("---Bem vindo a Locadora Gaba---");
		System.out.println("-------------------------------");
		
		System.out.println("1 - Logar");
		System.out.println("2 - Cadastrar");
		System.out.println("3 - Verificar Listas de filmes");
		
		System.out.println("Escolha uma opção para proseguir");
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Opção: ");
		int opcao = scanner.nextInt();
		
	}
	
	public void telaSistemaUser()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--------------------------");
		System.out.println("Login efetuado com sucesso");
		System.out.println("--------------------------");
		
		System.out.println("-------------------------");
		System.out.println("1 - Lista de Flmes");
		System.out.println("2 - Alugar um filme");
		System.out.println("3 - Historico");
		System.out.println("4 - Datas de devolução");
		System.out.println("5 - Configuração de Conta");
		System.out.println("-------------------------");
		
		System.out.print("Opção: ");
		String opcao = scanner.next();
	}
	
	private void telaInicialOpcoes(int opcao)
	{
		if(opcao == 1)
		{
			telaLogin();
		}
		
	}
	
	private void telaLogin()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("--TELA DE LOGIN--");
		System.out.print("User: ");
		String user = scanner.nextLine();
		System.out.print("Senha: ");
		String senha = scanner.nextLine();
		login.loginConta(user,senha);
	}
}
