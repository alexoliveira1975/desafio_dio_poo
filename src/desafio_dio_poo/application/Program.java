package desafio_dio_poo.application;

import java.time.LocalDate;

import desafio_dio_poo.entities.Bootcamp;
import desafio_dio_poo.entities.Curso;
import desafio_dio_poo.entities.Dev;
import desafio_dio_poo.entities.Mentoria;

public class Program {

	public static void main(String[] args) {
		
		Curso c1 = new Curso();
		c1.setTitulo("Curso Java");
		c1.setDescricao("POO");
		c1.setCargaHoraria(8);
		
		Curso c2 = new Curso();
		c2.setTitulo("Curso Spring Boot");
		c2.setDescricao("Criação API RESTful");
		c2.setCargaHoraria(4);
		
		Mentoria m1 = new Mentoria();
		m1.setTitulo("Mentoria Java");
		m1.setDescricao("Descrição Mentoria Java");
		m1.setDataMentoria(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp(); 
		bootcamp.setNome("Bootcamp Banco PAN - Java Developer");
		bootcamp.setDescricao("Parceira entre a DIO e o Banco PAN para desenvolvedores Java.");
		bootcamp.getConteudos().add(c1);
		bootcamp.getConteudos().add(c2);
		bootcamp.getConteudos().add(m1);
		
		Dev devArthur = new Dev();
		devArthur.setNome("Arthur Soledade");
		devArthur.inscreverBootcamp(bootcamp);
		System.out.println(devArthur.getNome());
		System.out.println("Conteudos Inscritos: " + devArthur.getConteudosInscritos());
		devArthur.progredir();
		devArthur.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos: " + devArthur.getConteudosInscritos());
		System.out.println("Conteudos Concluidos: " + devArthur.getConteudosConcluidos());
		System.out.println("XP: " + devArthur.calcularTotalXP());
		System.out.println("--------------------------------------");
		
		Dev devGeanna = new Dev();
		devGeanna.setNome("Geanna Silva");
		devGeanna.inscreverBootcamp(bootcamp);
		System.out.println(devGeanna.getNome());
		System.out.println("Conteudos Inscritos: " + devGeanna.getConteudosInscritos());
		devGeanna.progredir();
		devGeanna.progredir();
		devGeanna.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos: " + devGeanna.getConteudosInscritos());
		System.out.println("Conteudos Concluidos: " + devGeanna.getConteudosConcluidos());
		System.out.println("XP: " + devGeanna.calcularTotalXP());
		System.out.println("--------------------------------------");
		
	
		
	

	}

}
