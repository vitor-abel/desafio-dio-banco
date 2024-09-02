package desafioDioBanco;

import java.time.LocalDate;

public class ContaSalario extends Conta {

    public ContaSalario(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Salário ===");
        super.imprimirInfosComuns();
    }

    public void receberSalario(double valor, LocalDate diaPagamento) {
        if (LocalDate.now().equals(diaPagamento)) {
            depositar(valor);
        }
        diaPagamento = LocalDate.now().plusMonths(1);
    }

}
