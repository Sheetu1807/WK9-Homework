package que19_encapsulation26;

public class Test_Encapsulation {

    public static void main (String[] args){
        Encapsulate obj = new Encapsulate();

        // Setting values of the variable

        obj.setName("Bhavesh");
        obj.setAge(19);
        obj.setRollNo(51);

        // Displaying values of the variables
        System.out.println("CodeBusters name: " +obj.getName());
        System.out.println("CodeBuster age: " +obj.getAge());
        System.out.println("CodeBuster rollNo: " +obj.getRollNo());

        // Direct access of rollNo is not possible due to encapsulation
       // System.out.println("CodeBuster rollNo" +obj.geekName);
    }
}
