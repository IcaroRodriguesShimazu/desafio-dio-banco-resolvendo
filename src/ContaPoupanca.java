public class  ContaPoupanca extends Conta{
    protected int agencia;
    protected int numero;
    protected double saldop;
    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }


   


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public double getSaldo() {
        return saldo;
    }


    protected double saldo;
   public ContaPoupanca(){
    {
        agencia =Conta.AGENCIA_PADRAO;
        numero=SEQUENCIAL++;
    }

   }


public void imprimirExtrato() {

   System.out.println("Extrato da conta poupança");
   System.out.println(String.format("Agencia :%d", agencia));
   System.out.println(String.format("Numero :%d", numero));
   System.out.println(String.format("Saldo :%.2f", saldo));   


}


@Override
public void imprimirExtrato(double valorDeposito) {
    System.out.println("Extrato da conta poupança");
   System.out.println(String.format("Agencia :%d", agencia));
   System.out.println(String.format("Numero :%d", numero));
   System.out.println(String.format("Saldo :%.2f", valorDeposito+super.soma));   
   
}
@Override
public void sacar(double valorDeposito) {
    valorDeposito -= super.valorSaque;

}
public void depositar(double valorDeposito) {

    valorDeposito+=valorSaque;

}


}
