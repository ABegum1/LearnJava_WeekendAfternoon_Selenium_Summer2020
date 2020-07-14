package basics;

public class LearnStatic {

    //Static:
    // if variable and method is static then you can call those variable and method by it's class name.
    //If variable and method is non-static then you can call those variable and method by its object name.
    //global variable
    //static type Global variable


    //object
    /* AN object is nothing but a self contained componant which consists of methods and
       properties to make a particuler type of data useful.
       Object determines the behevior of the class.  When you send a message to an object,
       you are asking the object to invoke or execute one of its methods.  From a
       programming point of view, an object can be a data structure, a variable or a function.
       It has a memory location allocated.  The object is designed as class hierchies.
     */

    // className of objectName=newContractorOfClass()

    //Static type Global variable
    static int age =24;
            //Non-static Global Variable
    String name ="James";

    public static void main(String[] args) {
        LearnStatic.age =25; // Reinitiallize value / Re-Assign value
        System.out.println("My age is  "+LearnStatic.age);

    }










}
