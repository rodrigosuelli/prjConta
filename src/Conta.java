public class Conta {
    private String conta;
    private String agencia;
    private double saldo;
    private String nomeCliente;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "Conta{" + "\n" +
                "conta='" + conta + '\'' + "\n" +
                "agencia='" + agencia + '\'' + "\n" +
                "saldo=" + saldo + "\n" +
                "nomeCliente='" + nomeCliente + '\'' + "\n" +
                '}';
    }

    public int sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            return 1;
        }
        return 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = valor;
        }
    }
}
