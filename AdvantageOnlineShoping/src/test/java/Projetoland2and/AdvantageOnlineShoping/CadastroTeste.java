package Projetoland2and.AdvantageOnlineShoping;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CadastroTeste {

	@Test
	public void ValidaSenha(){

		Cadastro cadastro = new Cadastro();

		 assertEquals( expected: "Senha", cadastro.getSenha(0));
		
		

	}
	
	@Test
	public void ValidaEmail() {

		Login login = new Login();

		 assertEquals( expected: "Email", login.email(0));
		

}
}
