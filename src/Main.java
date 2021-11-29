import br.com.alexandre.dominio.Bootcamp;
import br.com.alexandre.dominio.Curso;
import br.com.alexandre.dominio.Dev;
import br.com.alexandre.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devCamila.getNome() + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("...");
        System.out.println("Conteúdos inscritos " + devCamila.getNome() + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + devCamila.getNome() + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        Dev devAlex = new Dev();
        devAlex.setNome("Alexandre");
        devAlex.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devAlex.getNome() + devCamila.getConteudosInscritos());
        devAlex.progredir();
        devAlex.progredir();
        devAlex.progredir();
        System.out.println("...");
        System.out.println("Conteúdos inscritos " + devAlex.getNome() + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + devAlex.getNome() + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devAlex.calcularTotalXp());

    }
}
