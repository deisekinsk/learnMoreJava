public class GuestRoutine{
    //variables: declare, allocate, initialize an instance | instance, methods and properties | constructos: default, custom
    
    boolean outOfBed = true;
    
    int yogaExpendTime = 40;
    String fruit = "apple";
    double cupOfTea = 1.5;
    
    int daysSpentInHosting = 0;
    double hourOfSleep = 6.30;

    
    public GuestRoutine(int howMuchYogaExpTime, String whichFruit, double howMuchCupOfTea){
        yogaExpendTime = howMuchYogaExpTime;
        fruit = whichFruit;
        cupOfTea = howMuchCupOfTea;
    
    }
    
    public void printGuestRoutine (){
        System.out.println("Did the guest get out of bed: " + outOfBed + ".");
        System.out.println("Today you made " + yogaExpendTime + " minutes in yoga.");
        System.out.println("Favorite fruit: " + fruit + ".");
        System.out.println("Quantity the cup of tea: " + cupOfTea + ".");
        
        System.out.println("Days in Spa: " + daysSpentInHosting);
        
    
    }
    
    public void daysSpent() {
        daysSpentInHosting++;
    }
    
    public double hourOfSleep(){
        return hourOfSleep;
    }
    
    public static void main(String[] args) {
        
        GuestRoutine guestAmanda = new GuestRoutine(25, "banana", 3.5 );
        System.out.println("*** Amanda ***");
        guestAmanda.daysSpent();
        guestAmanda.daysSpent();
        guestAmanda.printGuestRoutine();
        System.out.println("Sleep night: " + guestAmanda.hourOfSleep());
        
        GuestRoutine guestJonas = new GuestRoutine(60, "Don't eat fruit", 6.5);
        System.out.println("*** Jonas ****");
        guestJonas.daysSpent();
        guestJonas.daysSpent();
        guestJonas.daysSpent();
        guestJonas.printGuestRoutine();
        
    }
    
}
