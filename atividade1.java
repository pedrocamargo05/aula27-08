import java.util.ArrayList;
import java.util.List;

class Funcionario {
    private String nome;
    private double salarioBase;
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public final double calcularPagamento() {
        return salarioBase;
    }
    public String getNome() {
        return nome;
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    public double calcularPagamentoGerente() {
        return super.calcularPagamento() * 1.2; 
    }
}
class Vendedor extends Funcionario {
    private double comissao;
    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    public double calcularPagamentoVendedor() {
        return super.calcularPagamento() + comissao; 
    }
}

public class atividade1 {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("João", 3000));
        funcionarios.add(new Gerente("Maria", 5000));
        funcionarios.add(new Vendedor("Carlos", 2500, 500));
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Gerente) {
                System.out.println(funcionario.getNome() + ": " + ((Gerente) funcionario).calcularPagamentoGerente());
            } else if (funcionario instanceof Vendedor) {
                System.out.println(funcionario.getNome() + ": " + ((Vendedor) funcionario).calcularPagamentoVendedor());
            } else {
                System.out.println(funcionario.getNome() + ": " + funcionario.calcularPagamento());
            }
        }
    }
}