public class Values {
    double a1;
    double a2;
    double a3;
    double a4;
    double n2;
    String name;

    public Values (double a1, double a2,
                     double a3, double a4,
                     double n2, String name){
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.n2 = n2;
        this.name = name;
    }

    public void printData(){
        double n1 = (a1 + a2 + a3 + a4)/4;
        double n1mp = n1*0.4;
        double n2mp = n2*0.6;
        double mf = (n1mp + n2mp);
        
     System.out.print("MF| "+ name + " = " + mf);
     System.out.print(" | N1 = " + n1);
     System.out.println(" | N2 = " + n2);
    }

    public static  void main (String[] args){

        Values disciplinaA = new Values(9.8, 6.0,10.0,5.0, 8.0, "IHC");
        Values disciplinaB = new Values(6.0, 9.0,9.0,0.0, 0.0, "Fundamentos P/ Computador");
        
        System.out.println("Universidade Anhembi Morumbi \nGraduação Análise e Desenvolvimento de Sistemas \nMÉDIA FINAL POR DISCIPLINA(AP >=6) \n");
        
        
        disciplinaA.printData();
        disciplinaB.printData();
    }

}
