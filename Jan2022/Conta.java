public class Conta{
    int numero;
    double saldo;
    int agencia;
    
    
    public Conta(){ }
    
     public Conta(double saldo){ 
         this.saldo =saldo;
     }
    
    public Conta(int numero, double saldo, int agencia) {
        this.numero = numero;
        this.saldo = saldo;
        this.agencia = agencia;
    }
    
    public void deposito(double valor){
        saldo = saldo + valor;
    }
    
    public void retirada(double valor){
        saldo = saldo - valor;
    }
    
    public double verificaSaldo(){
        return saldo;
    }
    
    
    
}
