package constructor;

import basics.LearnCasting;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class LearnConstructor {
//Constructor Name will be same as Clas Name
    //Constructor has no Return Type
    //Constructor are used to inilialize the object.
    //Before creating parameterize constructor we muust have to create defalut
    //Constructor
    // Default non Parametarized constructor
    //Parametarized

    //AccessModifier className(){} Default constructor
    String name;
    String address;
    int age;
    double courseFee;


     public LearnConstructor(){
         //Default Constructor
     System.out.println("this is a default constuctor");
     }


    //Single Parameterized
    public LearnConstructor(String name) {
    this.name=name;
        System.out.println(this.name);
    }

    //Multiple Parameterized Constructor
    public LearnConstructor(String name, String address) {
        this.name=name;
        this.address=address;
        this.age=age;

        System.out.println(this.name+" lives in "+ this.address);
    }



    public LearnConstructor(String name, String address, int age){
        this.name=name;
        this.address=address;
        this.age=age;



        System.out.println(this.name+" lives in "+ this.address + this.age);

    }

    public static void main(String[] args) {
        //Constructors are used to initialize the object
        LearnConstructor learn=new LearnConstructor("James William"); //Argument passing
        learn.age=21;
        System.out.println("James age is "+learn.age);
        LearnConstructor Arib=new LearnConstructor("Ehachen Arib", "Brooklyn,NY");
        Arib.courseFee=5000;
        System.out.println("Arib course fee is "+Arib.courseFee);

        LearnConstructor dc=new LearnConstructor();
        dc.address="Queens,NY";
        System.out.println(dc.address);
        LearnConstructor raza=new LearnConstructor("Syed Raza", "Canada, his age is ",35
        );
        raza.name="Syed";
        raza.address="Australia";
        raza.courseFee=5000.500;
        raza.age=50;
        System.out.println("Student Name is "+raza.name+", "+"Address is "+raza.address+", course fee is "+raza.courseFee);




    }






}
