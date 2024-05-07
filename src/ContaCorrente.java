public class ContaCorrente extends Conta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double valorDeposito1;
public ContaCorrente(){
    agencia = Conta.AGENCIA_PADRAO;
    numero=SEQUENCIAL++;
}
public void setSaldo(double saldo) {
    this.saldo = saldo;
}
public void imprimirExtrato() {

    System.out.println("Extrato da conta correte");
    System.out.println(String.format("Agencia :%d", agencia));
    System.out.println(String.format("Numero :%d", numero));
    System.out.println(String.format("Saldo :%.2f", saldo));
   
 }
@Override
public void imprimirExtrato(double valorDeposito1) {
    System.out.println("Extrato da conta correte");
    System.out.println(String.format("Agencia :%d", agencia));
    System.out.println(String.format("Numero :%d", numero));
    System.out.println(String.format("Saldo :%.2f", valorDeposito1));

}

double soma =valorDeposito1 - valorSaque1;

@Override
public void sacar(double valorDeposito1) {
    valorDeposito1 -=  valorSaque1;

}
public void depositar(double valorDeposito1) {

    valorDeposito1+=valorSaque1;

}
public void transferir(double soma, Conta ContaPoupanca) {
    
    this.depositar(soma);
    ContaPoupanca.depositar(soma);
}
}
