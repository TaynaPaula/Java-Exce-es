public class Financiamento {
    private double valor;

    public Financiamento(double valor) throws ValorFinanciamento {
        if (valor < 15000 || valor > 150000) {
            throw new ValorFinanciamento("O valor do financiamento deve estar entre R$ 15.000,00 e R$ 150.000,00.");
        }
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Financiamento no valor de R$ " + valor;
    }

}
