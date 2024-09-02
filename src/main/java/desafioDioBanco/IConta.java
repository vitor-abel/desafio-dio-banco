package desafioDioBanco;

import java.time.LocalDate;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void receberSalario(double valor, LocalDate diaPagamento);

    void debitoAutomatico(double valor, LocalDate diaDebito);

    void imprimirExtrato();
}
