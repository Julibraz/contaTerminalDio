
public class ContaBanco {
    private int numeroConta;
    private String agencia;
    private String nome;
    private double saldo;

    public ContaBanco() {
        numeroConta = numeroConta;
        agencia = agencia;
        nome = nome;
        saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
