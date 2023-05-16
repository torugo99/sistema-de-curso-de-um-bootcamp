import edu.dio.desafio.domain.Bootcamp;
import edu.dio.desafio.domain.Curso;
import edu.dio.desafio.domain.Dev;
import edu.dio.desafio.domain.Mentoria;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Descricao curso C#");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao Mentoria Java");
        mentoria1.setData(LocalDateTime.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria C#");
        mentoria2.setDescricao("Descricao Mentoria C#");
        mentoria2.setData(LocalDateTime.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp");
        bootcamp.setDescricao("Decrição Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);
        
        Dev victor99dev = new Dev();
        victor99dev.setNome("Victor99dev");
        victor99dev.inscreverBootcamp(bootcamp);
        System.out.println("\n Cursos Inscritos de Victor99dev " + victor99dev.getConteudosInscritos());

        victor99dev.progredir();
        victor99dev.progredir();
        victor99dev.progredir();
        victor99dev.progredir();

        System.out.println("\n Cursos em Andamento de Victor99dev " + victor99dev.getConteudosInscritos());
        System.out.println("\n Cursos Concluidos de Victor99dev " + victor99dev.getConteudosConcluidos());
        System.out.println("\n XP:" + victor99dev.calcularTotalXp());


        System.out.println("-----------------------------------------------------------");

        Dev devTeste123 = new Dev();
        devTeste123.setNome("devTeste123");
        devTeste123.inscreverBootcamp(bootcamp);
        System.out.println("\n Cursos Inscritos de devTeste123 " + devTeste123.getConteudosInscritos());

        devTeste123.progredir();

        System.out.println("\n Cursos em Andamento de devTeste123 " + devTeste123.getConteudosInscritos());
        System.out.println("\n Cursos Concluidos de devTeste123 " + devTeste123.getConteudosConcluidos());
        System.out.println("\n XP:" + devTeste123.calcularTotalXp());
    }
}
