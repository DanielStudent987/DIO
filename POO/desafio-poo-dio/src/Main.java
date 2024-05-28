import java.time.LocalDate;

import br.com.dio.desafio.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(4);
        curso1.setDescricao("Curso de Python");
        curso1.setTitulo("Python");
        
        Curso curso2 = new Curso();
        curso2.setCargaHoraria(6);
        curso2.setDescricao("Curso de Java");
        curso2.setTitulo("Java");

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria("JavaScript", "Eh isso mesmo", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Development");
        bootcamp.setDescricao("Descricao");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println(devDaniel.getConteudoInscritos());
        devDaniel.progredir();

        Dev devTau = new Dev();
        devTau.setNome("Tatau");
        devTau.inscreverBootcamp(bootcamp);







        System.out.println(mentoria);
    }
}
