

public abstract class Conta implements IContas {
    protected static  int AGENCIA_PADRAO = 1;
    protected static  int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double valorSaque1;
    protected double valorSaque;
    protected double soma;
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void extratoSimplificado(){
        
        System.out.println(String.format("Agencia :%d", agencia));
   System.out.println(String.format("Numero :%d", numero));
   System.out.println(String.format("Saldo :%.2f", saldo));
    }

    public void sacar(double valor) {
        saldo -= valor;
    }
  
    public void depositar(double valor) {

        saldo+=valor;

    }

    public void transferir(double valor, Conta contaDestino) {

        this.depositar(valor);
        contaDestino.depositar(valor);
    }
    
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    
}
