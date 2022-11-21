public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 78;
        int englishGrade = 65;
        
        if(chemistryGrade > 75 || englishGrade > 75){
            System.out.println("Congratulations! You got the scholarship!");
        } else {
            System.out.println("We are sorry. You didn't get the scholarship!");
        }
    }
}
