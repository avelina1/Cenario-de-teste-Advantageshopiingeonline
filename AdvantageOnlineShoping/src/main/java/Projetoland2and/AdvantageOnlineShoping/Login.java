package Projetoland2and.AdvantageOnlineShoping;

import java.util.Scanner;

public class Login extends Cadastro {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Cadastro cadastro = new Cadastro();
		System.out.println("Digite nome completo :\n");
		cadastro.nome = leia.next();
		System.out.println("Digite o seu e-mail \n");
		cadastro.email = leia.next();

		System.out.println("Digite a senha: \n");
		cadastro.senha = leia.next();
		System.out.println("Confirmar senha: \n");
		cadastro.confirmarSenha = leia.next();

		System.out.println("Digite data de nascimento");
		cadastro.dataNasc = leia.next();
		System.out.println("Digite seu sexo (M)" + "Masculino " + "(F)" + "Femenino" + "() " + "Outros \n");
		cadastro.sexo = leia.next();
		System.out.println("Cadastro realizado com sucesso!");
		System.out.println("Faça login! \n");
		System.out.println("===========================================");
		System.out.println("Digite seu usuário! \n");
		cadastro.usuario = leia.next();
		System.out.println("Digite senha cadastrada: \n");
		cadastro.senha = leia.next();
		if (senha == senha) {
			System.out.println("Login Realizado com suceso!");

		} else {
			System.out.println("Usuário não cadastrado, por favor realizar cadastro!");
		}

	}

}
