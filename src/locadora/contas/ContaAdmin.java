package locadora.contas;

public class ContaAdmin extends Conta
{
	private String userAdmin = "admin";
	private String senhaAdmin = "admin123";
	
	
	public String getUserAdmin()
	{
		return this.userAdmin;
	}
	
	public String getSenhaAdmin()
	{
		return this.senhaAdmin;
	}
}
