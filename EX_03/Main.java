package EX_03;

public class Main {
    
    public static void main(String[] args) {
        
        Funcionario f = new Funcionario();
        Professor p = new Professor();

        f.setNome("Caio");
        f.setIdade("18");

        p.setNome("Jessica");
        p.setIdade("23");
        p.setSalario(1.00);

        System.out.println("Informacoes de funcionarios: " + "\n" +
        "Nome: " + f.getNome() + "\n" +
        "Idade: " + f.getIdade() + "\n" + "\n");

        System.out.println("Informacoes de professores: " + "\n" +
        "Nome: " + p.getNome() + "\n" +
        "Idade: " + p.getIdade() + "\n" +
        "Salario: " + p.getSalario() + "\n");

    }

}
