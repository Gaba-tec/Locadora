package locadora.contas;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import locadora.sistema.Sistema;

public class Conta {
	
	private static Map<String,String> usuarios = new HashMap<String,String>();
	private Scanner scanner = new Scanner(System.in);
	private Sistema sistema = new Sistema();
	
	public void setAdminUser(String user, String senha)
	{
		usuarios.put(user,senha);
	}
	
	public void cadastraUsuario()
	{
		System.out.println("--PAGINA DE CADASTRO--");
		System.out.print("User: ");
		String user = scanner.nextLine();
		if(!verificaUser(user))
		{
			System.out.print("Senha: ");
			String senha = scanner.nextLine();
			usuarios.put(user, senha);
			System.out.println("Usuario Criado!!");
			sistema.telaSistemaUser();
		}
		else
		{
			System.out.println("Usúario já existe no sistema");
			sistema.telaInicial();
		}
		
	}
	
	public boolean verificaUser(String user)
	{
		return usuarios.containsKey(user);

		
		
	}
	
	public Map<String,String> getUsuarios()
	{
		return Collections.unmodifiableMap(usuarios);
	}
}
