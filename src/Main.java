import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso(); //Instanciando o objeto
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Desenvolvendo habilidades em Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso(); //Instanciando o objeto
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Desenvolvendo habilidades em JavaScript");
        curso2.setCargaHoraria(12);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Soft Skills");
        mentoria1.setDescricao("Aprimorando habilidades e competências");
        mentoria1.setData(LocalDate.now()); //Definindo a data atual

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Santander Code Girls");
        bootcamp.setDescricao("Bootcamp apenas para mulheres");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMarina = new Dev();
        devMarina.setNome("Marina");
        devMarina.inscreverBootcamp(bootcamp);
        System.out.println("DEV " + devMarina.getNome());
        System.out.println("Conteúdos Inscritos: " + devMarina.getConteudosInscritos());

        devMarina.progredir();
        devMarina.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos: " + devMarina.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devMarina.getConteudosConcluidos());
        System.out.println("XP: " + devMarina.calcularXp());

        System.out.println("\n");

        Dev devHelena = new Dev();
        devHelena.setNome("Helena");
        devHelena.inscreverBootcamp(bootcamp);
        System.out.println("DEV " + devHelena.getNome());
        System.out.println("Conteúdos Inscritos de Helena" + devHelena.getConteudosInscritos());
        devHelena.progredir();
        devHelena.progredir();
        devHelena.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Helena" + devHelena.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Helena" + devHelena.getConteudosConcluidos());
        System.out.println("XP: " + devHelena.calcularXp());
    }
}
