public class ProjectA {
    int year;
    String name;

    public ProjectA (int yearBirth, String firstName){
        year = yearBirth;
        name = firstName;
    }

    public void printData(){
     System.out.println(year +", " + name);
    }

    public static  void main (String[] args){

        ProjectA userOne = new ProjectA(1988,"Deise");
        System.out.println("Start in Everis!");
        userOne.printData();
    }

}
