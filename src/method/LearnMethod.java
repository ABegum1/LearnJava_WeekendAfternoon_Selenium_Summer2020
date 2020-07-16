package method;

import javax.swing.*;

public class LearnMethod {
//Method: block of code which runs when it is called.  Method is uded to perform certain actions and they are known as function
//Method Type:
    //Return Method
    //NonRetun Method
//Return Method without Parameter:
//Non Return Method without Parameter:
//Method Syntex: AccessModifier ReturnType/MethodType MethodName() { Method Body}
//ReturnType/MethodType : Data Type / Class Type/ Object
// MethodName: verb+Noun

    //Return type Method with out parameter
    public int doSummation(){
        int number1=20;
        int number2=30;
        int sum=number1+number2;
        System.out.println("Summation value is "+sum);
        return sum;
        //Returnhas to be the last line because code execute from top to bottom
    }

    //Return type Method with parameter
    public int doSubtraction(int num1, int num2){
        int number1=num1;
        int number2=num2;
        int sub=number2-number1;
        System.out.println("Subtraction Valie is "+sub);
        return sub;
    }

    public String stInfo(String fName, String lName, int age){
       String fullName=fName+" "+lName;
        System.out.println("Full Name : "+fullName+age);
        return fullName;
    }

    //Non Return type Method with parameter

    public void doMultiply(){

        int number1=20;
        int number2=30;
        int multiply=number1*number2;
        System.out.println("Multiply value is "+multiply);

    }

    public void doDivision(double num1,double num2){
      double division=num2/num1;
        System.out.println("Division value is  "+division);

    }

    //Non Return type Method with parameter
    public void doMultiply(int number1, int number2){
        int multiply = number2 * number2;
        System.out.println("Multiply Value is "+multiply);
    }




    public static void stInfo(){
        System.out.println("Student information");

    }

    public static void main(String[] args) {
        //LearnMethod.stInfo();

        LearnMethod obj=new LearnMethod();
        obj.doSummation();
        obj.doSubtraction(30,200);
        obj.stInfo("James", "Willams", 24);
        obj.doMultiply();
        obj.doMultiply(10,10);
        obj.doDivision(5, 50);

        System.out.println("************************************");

        int subt=obj.doSubtraction(40, 50);
        int total=subt+50;
        System.out.println("Total value is "+total);
    }



}
