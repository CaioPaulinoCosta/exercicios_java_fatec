class Main {

public static void main(String[] args) {
    
    Endereco end = new Endereco();
    Cliente c = new Cliente();

    end.setLogradouro("Rua João Claudino do Nascimento");
    end.setNumero("144");
    end.setBairro("Jardim Flamboyant");

    c.setNome("Caio");
    c.setCpf("468095858885");
    c.setEndereco(end);

    System.out.println("Cliente: " + c.getNome() + "\n" + "Rua: " + c.getEndereco().getLogradouro());

}

}