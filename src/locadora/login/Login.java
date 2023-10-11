package locadora.login;

import java.util.*;

import locadora.contas.Conta;
import locadora.sistema.Sistema;

public class Login {
	
	private Sistema sistema = new Sistema();
	private Conta usuarios = new Conta(); 
	private Scanner scanner = new Scanner(System.in);
	
	public void loginConta(String user, String senha)
	{
		if(usuarios.getUsuarios().containsKey(user) && usuarios.getUsuarios().containsValue(senha))
		{
			sistema.telaSistemaUser();
		}
		else 
		{
			System.out.println("--Usuario não encontrado--");
			System.out.println("1 - Tentar logar novamente");
			System.out.println("2 - Cadastras conta");
			System.out.println("3 - Verificar Lista de filmes");
			System.out.println("4 - Voltar para tela inicial");
			System.out.print("Opção: ");
			String op = scanner.next();
			sistema.telaInicialOpcoes(op);	
		}
		
	}
}
