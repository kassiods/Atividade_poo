package contaestudantil;

public class ContaEstudantil {

    private final String numeroConta;
    private double saldo;
    private Aluno titular;
    private double limiteCredito;

    public ContaEstudantil(String numeroConta, Aluno titular, double limiteCredito) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.limiteCredito = limiteCredito;
        this.saldo = 0.0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Aluno getTitular() {
        return titular;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean pagar(double valor) {
        if ((saldo + limiteCredito) >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(ContaEstudantil destino, double valor) {
        if (pagar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}
