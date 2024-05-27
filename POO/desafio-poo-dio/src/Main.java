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
        System.out.println(mentoria);
    }
}
