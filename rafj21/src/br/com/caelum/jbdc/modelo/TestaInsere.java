package br.com.caelum.jbdc.modelo;

import java.util.Calendar;

public class TestaInsere {

	public static void main(String[] args) {
		 // pronto para gravar
		 Contato contato = new Contato();
		 
		 contato.setNome("Caelum");
		 contato.setEmail("contato@caelum.com.br");
		 contato.setEndereco("R. Vergueiro 3185 cj87");
		 contato.setDataNascimento(Calendar.getInstance());
		 // grave nessa conexão!!!
		 Misterio bd= new Misterio();
		 // método elegante
		 bd.adiciona (contato);
		 System.out.println("Gravado!");
		 }
}

