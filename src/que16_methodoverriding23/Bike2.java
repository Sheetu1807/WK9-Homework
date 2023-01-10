package que16_methodoverriding23;

// 16. Creating a child class

class Bike2 extends Vehicle {

    // Defining the same method as in the parent class
    public void run(){
        System.out.println("Bike is running safely");
    }
    public static void main(String[] args){

        //creating object
        Bike2 obj = new Bike2();

        //calling method
        obj.run();
    }
}

