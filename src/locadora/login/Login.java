package locadora.login;

import java.util.*;

import locadora.contas.Conta;
import locadora.sistema.Sistema;

public class Login {
	
	private Sistema sistema = new Sistema();
	private Conta usuarios = new Conta(); 
	
	public void loginConta(String user, String senha)
	{
		if(usuarios.getUsuarios().containsKey(user) && usuarios.getUsuarios().containsValue(senha))
		{
			sistema.telaSistemaUser();
		}
		else 
		{
			System.out.println("Acesso Negado");
		}
		
	}
}
