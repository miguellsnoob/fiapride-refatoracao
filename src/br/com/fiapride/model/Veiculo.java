package br.com.fiapride.model;

public class Veiculo {

    private String dono;
    private String placa;
    private double combustivel;

    // Construtor
    public Veiculo(String dono, String placa, double combustivelInicial) {
        this.dono = dono;
        this.placa = placa;
        setCombustivel(combustivelInicial);
    }

    // Getters
    public String getDono() {
        return dono;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCombustivel() {
        return combustivel;
    }

    // Setter com validação
    public void setCombustivel(double combustivel) {
        if (combustivel >= 0) {
            this.combustivel = combustivel;
        } else {
            this.combustivel = 0;
        }
    }

    // Métodos
    public void abastecer(double valor) {
        if (valor > 0) {
            combustivel += valor;
        }
    }

    public void consumir(double valor) {
        if (valor > 0 && combustivel >= valor) {
            combustivel -= valor;
        } else {
            System.out.println("Combustível insuficiente!");
        }
    }
}
