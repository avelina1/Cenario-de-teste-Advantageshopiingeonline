package Projetoland2and.AdvantageOnlineShoping;

import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cadastro")
public class Cadastro {

	String nome;
	String email;
	String dataNasc;
	String sexo;
	String usuario;
	static String senha;
	static String confirmarSenha;


	
	}


