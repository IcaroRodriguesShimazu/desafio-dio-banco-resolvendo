
import java.util.Scanner;




public class Pessoa {

    public static void main(String[] args) {

     double valorDeposito1=0.0;
     double valorDeposito=0.0;
     double valorSaque=0.0;
     double valorSaque1=0.0;
     double trd = 0.0;
        Scanner scanner = new Scanner(System.in);
        int escolha;
  

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Modo administrador");
            System.out.println("2 - Modo cliente");
            System.out.println("3 - Encerrar");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Modo administrador selecionado.");

                    // Laço para o modo administrador
                    int opcaoAdmin;
                    do {
                        System.out.println("Escolha uma opção:");
                        System.out.println("1 - Ver nome dos Clientes");
                        System.out.println("2 - Ver quantas contas estão abertas");
                        System.out.println("3 - Voltar ao menu principal");
                        opcaoAdmin = scanner.nextInt();

                        switch (opcaoAdmin) {
                            case 1:
                            Banco banco = new Banco();
                            banco.imprimindoClientes();
                                break;
                            case 2:
                                Banco banco2 = new Banco();
                                banco2.numeroDeContas();
                                // Adicione aqui o código para ver quantas contas estão abertas
                                break;
                            case 3:
                                System.out.println("Voltando ao menu principal.");
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                        }
                    } while (opcaoAdmin != 3);

                    break;
                case 2:
                    System.out.println("Modo cliente selecionado.");

                    // Laço para o modo cliente
                    int opcaoCliente;
                    do {
                        System.out.println("Escolha uma opção:");
                        System.out.println("1 - Sacar dinheiro na poupança");
                        System.out.println("2 - Sacar dinheiro na conta corrent");

                        System.out.println("3 - Depositar dinheiro na poupança");
                        System.out.println("4 - Depositar dinheiro na conta corrente");

                        System.out.println("5 - Imprimir extrato da conta corrente");
                        System.out.println("6 - Imprimir extrato da conta poupança");
                        System.out.println("7 - Depositar da conta corrente para a poupança");
                        System.out.println("8 - Voltar ao menu principal");
                        opcaoCliente = scanner.nextInt();

                        switch (opcaoCliente) {
                            case 1:
                            System.out.println("Digite o valor que deseja sacar da conta poupança:");
                            valorSaque = scanner.nextDouble();
                            Conta c2 = new ContaPoupanca();
                          

                            c2.sacar(valorSaque); 

                            if (valorSaque <= valorDeposito) { // Verifica se o saldo após o saque é suficiente
                                System.out.println("Saque realizado com sucesso na conta poupança no valor de R$: " + valorSaque);
                            } else {
                                System.out.println("Saldo insuficiente na conta.");
                                valorSaque = 0; // Definindo o valor do saque como zero caso o saldo seja insuficiente
                            }
                            break;
                        case 2:
                            System.out.println("Digite o valor que deseja sacar:");
                            valorSaque1 = scanner.nextDouble();
                            Conta c1 = new ContaCorrente();
                            

                            c1.sacar(valorSaque1); 
                            if (valorDeposito1 <= valorSaque1) { // Verifica se o saldo após o saque é suficiente
                                System.out.println("Saque realizado com sucesso na conta corrente no valor de R$: " + valorSaque1);
                            } else {
                                System.out.println("Saldo insuficiente na conta.");
                                valorSaque1 = 0; // Definindo o valor do saque como zero caso o saldo seja insuficiente
                            }
                            break;
                        
                            case 3:
                            System.out.println("Digite o valor do deposito na poupança");
                            valorDeposito= scanner.nextDouble();
                            Conta c22 = new ContaPoupanca();
                            if (valorDeposito > 0) {
                                c22.depositar(valorDeposito);
                              c22.depositar(valorDeposito);

                                System.out.println("Deposito efetivado com sucesso de R$:"+valorDeposito);

                            } else {
                                System.out.println("Valor do depósito inválido.");
                            }                                 
                            break;

                            
                            case 4:
                            System.out.println("Digite o valor do deposito na conta corrente");
                            valorDeposito1= scanner.nextDouble();
                            Conta cdConta = new ContaCorrente();
                            if (valorDeposito1 > 0) {
                            ;
                                
                                cdConta.depositar(valorDeposito1);
                                System.out.println("Deposito efetivado com sucesso de R$:"+valorDeposito1);
                                   
                            } else {
                                System.out.println("Valor do depósito inválido.");
                            }             
                            break;
                            case 5:
                                
                                Conta cc= new ContaCorrente();
                                cc.imprimirExtrato(valorDeposito1-valorSaque1-trd);

                                break;
                            case 6:
                                Conta cp= new ContaPoupanca();
                                
                                cp.imprimirExtrato(valorDeposito-valorSaque+trd);
                            break;
                            
                            case 7:System.out.println("Depositar da conta corrente para a poupança");
                            trd= scanner.nextDouble();
                                Conta tr= new ContaCorrente();
                            tr.transferir(trd, tr);
                            System.out.println("Valor depositado R$:"+trd);
                            break;
                            case 8:
                                System.out.println("Voltando ao menu principal.");
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                        }
                    } while (opcaoCliente != 8);

                    break;
                case 3:
                    System.out.println("Seção encerrada.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (escolha != 3);

        scanner.close();
    }
}

