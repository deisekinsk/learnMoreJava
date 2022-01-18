
public class Main
{
    public static void main(String[] args) {
        System.out.println("Contas Bancárias");
        Conta Joana = new Conta();
        Conta Cleiton = new Conta(1045);
        Conta Isaak = new Conta(9977, 1045, 667);
        
        System.out.println(Joana.saldo);
        
        Isaak.deposito(145);
        System.out.println(Isaak.saldo);

        System.out.println("Processo encerrado");
    }
}
