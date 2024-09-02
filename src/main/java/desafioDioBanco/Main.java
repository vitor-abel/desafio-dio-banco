package desafioDioBanco;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Abel");

        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);
        cc.sacar(50);

        Conta poupanca = new ContaPoupanca(cliente);

        cc.transferir(25, poupanca);

        Conta salario = new ContaSalario(cliente);

        salario.receberSalario(2000, LocalDate.now());
        salario.debitoAutomatico(200, LocalDate.now());

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        salario.imprimirExtrato();

    }

}
