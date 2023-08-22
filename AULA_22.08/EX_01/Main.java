public class Main {

public static void main(String[] args) {

    Aluno a = new Aluno();
    Curso c = new Curso();

    c.setNome("Curso de Java");
    c.setDuracao("8 horas");
    c.setValor("R$ 200,00");

    a.setNome("Caio");
    a.setRg("5732329323232");
    a.setCurso(c);

    System.out.println("Alunos cadastrados" + "\n" + "Nome: " + a.getNome() + "\n" + "Rg: " + a.getRg() + "\n" + "Curso: " + a.getCurso().getNome() + "\n" + "\n" + "Informacoes do curso de " + a.getNome() + "\n" + "Nome do curso: " + a.getCurso().getNome() + "\n" + "Duracao do curso: " + a.getCurso().getDuracao() + "\n" + "Valor do curso: " + a.getCurso().getValor());
    
}

}