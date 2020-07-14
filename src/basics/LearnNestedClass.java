package basics;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class LearnNestedClass {

    //Parent Class
    public static void main(String[] args) {

        //Car myCar=new Car();
        Car.CarPrice=60000;  //re-Assign
        System.out.println("My Car Price is "+Car.CarPrice);

        Car.CarColor="Red";
        System.out.println("My car color is "+Car.CarColor);



    }

    public static class Car{
        //NestedClass: Child Class
        static int CarPrice=5000;
        static String CarColor="Blue";


    }

}
