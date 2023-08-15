package EX_02;
public class Main {
    
public static void main(String[] args) {
    
    Gerente g = new Gerente();
    Vendedor v = new Vendedor();
    Cliente c = new Cliente();
    
    g.setNome("Caio");
    g.setIdade(18);
    g.setMatricula("121212");
    g.setNomeGerencia( "Caio");
    g.setSexo("Nao-Binarie");

    v.setNome( "Douglas");
    v.setIdade(14);
    v.setMatricula("111111");
    v.setSalario(10.00);
    v.setValorVendas(1.00);
    v.setQuantidadeVendas(1);
    v.setSexo("Nao-Binarie");

    c.setNome("Jessica");
    c.setIdade(23);
    c.setSexo("Trans");
    c.setAnoNascim(2000);
    c.setValorDivida(1.000);

    System.out.println("Informacoes do Gerente" + "\n" +
    "Nome: " + g.getNome() + "\n" +
    "Sexo: " + g.getSexo() + "\n" +
    "Idade: " + g.getIdade() + "\n" +
    "Matricula: " + g.getMatricula() + "\n" +
    "Nome Gerencia: " + g.getNomeGerencia() + "\n");

    System.out.println("Informacoes do Vendedor" + "\n" +
    "Nome: " + v.getNome() + "\n" +
    "Sexo: " + v.getSexo() + "\n" +
    "Idade: " + v.getIdade() + "\n" +
    "Matricula: " + v.getMatricula() + "\n" +
    "Quantidade de vendas: " + v.getQuantidadeVendas() + "\n" +
    "Valor vendas: " + v.getValorVendas() + "\n");

    System.out.println("Informacoes do Cliente" + "\n" +
    "Nome: " + c.getNome() + "\n" +
    "Sexo: " + c.getSexo() + "\n" +
    "Idade: " + c.getIdade() + "\n" +
    "Ano de Nascimento: " + c.getAnoNascim() + "\n" +
    "Ta devendo: " + c.getValorDivida() + "\n" + "\n");

}

}
