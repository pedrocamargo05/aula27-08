class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String descricao() {
        return "Veículo: " + marca + " " + modelo;
    }

    @Override
    public String toString() {
        return descricao();
    }
}

class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int portas) {
        super(marca, modelo);
        this.portas = portas;
    }

    @Override
    public String descricao() {
        return super.descricao() + ", Portas: " + portas;
    }

    @Override
    public String toString() {
        return descricao();
    }
}


class Caminhao extends Veiculo {
    private double capacidadeTon;

    public Caminhao(String marca, String modelo, double capacidadeTon) {
        super(marca, modelo);
        this.capacidadeTon = capacidadeTon;
    }

    @Override
    public String descricao() {
        return super.descricao() + ", Capacidade: " + capacidadeTon + " toneladas";
    }

    @Override
    public String toString() {
        return descricao();
    }
}


public class atividade2 {
    public static void main(String[] args) {
        
        Veiculo[] frota = new Veiculo[3];
        frota[0] = new Carro("Toyota", "Corolla", 4);
        frota[1] = new Caminhao("Volvo", "FH", 18);
        frota[2] = new Carro("Honda", "Civic", 4);

        
        for (Veiculo veiculo : frota) {
            System.out.println(veiculo);
        }
    }
}
