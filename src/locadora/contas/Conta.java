package locadora.contas;

import java.util.HashMap;
import java.util.Map;

public class Conta {
	
	private Map<String,String> usuarios = new HashMap<String,String>();
	
	public void cadastraUsuario(String user, String senha)
	{
		if(!verificaUser(user))
		{
			this.usuarios.put(user, senha);
		}
	}
	
	public boolean verificaUser(String user)
	{
		return usuarios.containsKey(user);
	}
	
	public Map<String,String> getUsuarios()
	{
		return usuarios;
	}
}
