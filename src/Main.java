import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
