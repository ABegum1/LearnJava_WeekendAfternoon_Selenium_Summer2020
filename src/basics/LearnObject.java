package basics;


import Pizza.Demo;
import Pizza.Pizza;

public class LearnObject {

    // A class is a blueprint or prototype that defines the variables and the methods common to all  objects of a certain kind.
    //An object is a specimen of a class
    //Software objects are often used to model real-world objects you find in everyday life.

    String phoneBrand ="Apple"; //non static global variable
    int phonePrice=1200;

    public void phoneDisplay() {
        System.out.println("Phone Display size is 6 inch");
    }

    public void phoneInfo() {
        System.out.println("PhoneBrand :"+phoneBrand+" "+"price "+phonePrice);
    }



    //Properties or componant

    public static void main(String[] args) {

        //create object
        //Object Syntex: className objectName = new constructorofClass();
        //We can call variable and method by objectName

        LearnObject obj=new LearnObject();
        obj.phoneInfo();
        obj.phoneDisplay();
        obj.phoneBrand="Samsung";
        System.out.println("Phone brand is "+obj.phoneBrand);

        // Can we create multiple object of same class??? Yes

        LearnObject myObj=new LearnObject();
        myObj.phoneBrand="LG";
        System.out.println("Phone Brand is "+myObj.phoneBrand);
        LearnObject myObj1=new LearnObject();
        LearnObject myObj2=new LearnObject();

        LearnObject nokia=new LearnObject();
        nokia.phoneBrand="Nokia";
        System.out.println(nokia.phoneBrand="Nokia");
        System.out.println("Phone Brand is "+nokia.phoneBrand);




        //Can we create object of another class in this main method?

Pizza myPizza=new Pizza();
Demo demo=new Demo();

LearnDataType ldt=new LearnDataType();
 ldt.name="Raza";
        System.out.println(ldt.name);


    }

}
