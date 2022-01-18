public class Main
{
    public static void main(String[] args) {
        System.out.println("Contas Bancárias");
        Conta Joana = new Conta();
        Conta Cleiton = new Conta(1045);
        
        System.out.println(Joana.saldo);
        
        System.out.println(Cleiton.saldo);

        System.out.println("Processo encerrado");
    }
}
