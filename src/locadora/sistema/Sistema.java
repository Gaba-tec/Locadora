package locadora.sistema;

import java.util.Scanner;

import locadora.contas.Conta;
import locadora.login.Login;

public class Sistema {
	
	private Scanner scanner = new Scanner(System.in);
	private Conta conta;
	
	public void telaInicial() 
	{
		System.out.println("-------------------------------");
		System.out.println("---Bem vindo a Locadora Gaba---");
		System.out.println("-------------------------------");
		
		System.out.println("1 - Logar");
		System.out.println("2 - Cadastrar");
		System.out.println("3 - Verificar Listas de filmes");
		
		System.out.println("Escolha uma opção para proseguir");
		
		System.out.print("Opção: ");
		String opcao = scanner.next();
		scanner.nextLine();
		telaInicialOpcoes(opcao);
	}
	
	public void telaSistemaUser()
	{
		
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
	
	public void telaInicialOpcoes(String opcao)
	{
		if(opcao.equals("1"))
		{
			telaLogin();
		}
		else if(opcao.equals("2"))
		{
			conta = new Conta();
			this.conta.cadastraUsuario();
		}
		else if(opcao.equals("3"))
		{
			
		}
		else if(opcao.equals("4"))
		{
			telaInicial();
		}
		else 
		{
			System.out.println("Não é uma opção valida, por favor tente novamente");
			telaInicial();
		}
			
	}
	
	public void telaLogin()
	{
		Login login = new Login();
		System.out.println("--TELA DE LOGIN--");
		System.out.print("User: ");
		String user = scanner.nextLine();
		System.out.print("Senha: ");
		String senha = scanner.nextLine();
		login.loginConta(user,senha);
	}
}
