package EX_02;
public class Vendedor extends Empregado {
    
    private double valorVendas;
    private int quantidaDeVendas;

    public int getQuantidadeVendas() {
        return quantidaDeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidaDeVendas = quantidadeVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
    

}
