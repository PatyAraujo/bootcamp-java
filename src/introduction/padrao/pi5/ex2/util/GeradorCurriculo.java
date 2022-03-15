package introduction.padrao.pi5.ex2.util;

import introduction.padrao.pi5.ex2.Curriculo;
import introduction.padrao.pi5.ex2.Curso;
import introduction.padrao.pi5.ex2.ExperienciaProfissional;

import java.util.ArrayList;
import java.util.List;

public class GeradorCurriculo {

    public static Curriculo gerarCurriculoAna(){
        Curriculo curriculoAna = new Curriculo();
        curriculoAna.setNome("Ana Paula");
        curriculoAna.setEmail("ana.paula@gmail.com");
        curriculoAna.setEndereco("Alameda Itu, 500 - Jardins - São Paulo - SP");
        curriculoAna.setTelefone("(11)999998888");
        List<Curso> cursos = new ArrayList<>();
        cursos.add(gerarCursoAnhembi());
        List<ExperienciaProfissional> experienciaProfissionals = new ArrayList<>();
        experienciaProfissionals.add(gerarExp1());
        experienciaProfissionals.add(gerarExp2());
        curriculoAna.setCursos(cursos);
        curriculoAna.setExperienciaProfissionais(experienciaProfissionals);
        return curriculoAna;
    }

    public static Curriculo gerarCurriculoAndre(){
        Curriculo curriculoAndre = new Curriculo();
        curriculoAndre.setNome("Andre Araujo");
        curriculoAndre.setEmail("andre.araujo@gmail.com");
        curriculoAndre.setEndereco("Rua Piaui, 30 - Higienopolis - São Paulo - SP");
        curriculoAndre.setTelefone("(11)934569516");
        List<ExperienciaProfissional> experienciaProfissionals = new ArrayList<>();
        experienciaProfissionals.add(gerarExp1());
        curriculoAndre.setExperienciaProfissionais(experienciaProfissionals);
        return curriculoAndre;
    }

    public static Curso gerarCursoAnhembi(){
        return new Curso("Engenharia da Computação", "Anhembi Morumbi", 2000,2014,
                2017);
    }

    public static ExperienciaProfissional gerarExp1() {
        return new ExperienciaProfissional("Brisa", "Analista de Qualidade",
                "Testar smartphones LG", 2014,2016);
    }

    public static ExperienciaProfissional gerarExp2() {
        return new ExperienciaProfissional("Accenture","Desenvolvedor","Criar aplicações Web",
                2016,2018);
    }
}
