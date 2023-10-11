package locadora.telalogin;

import locadora.contas.Conta;
import locadora.contas.ContaAdmin;
import locadora.sistema.Sistema;

public class TelaLogin {
	
	public static void main(String[] args) {
		
		Sistema sistema = new Sistema();
		ContaAdmin contaAdmin = new ContaAdmin();
		Conta conta = new Conta();
		
		conta.setAdminUser(contaAdmin.getUserAdmin(), contaAdmin.getSenhaAdmin());
		
		sistema.telaInicial();
	}
}
