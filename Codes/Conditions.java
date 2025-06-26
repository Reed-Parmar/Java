package Codes;
public class Conditions {
    public static void main(String[] args) {
        /*
         Syntax of if statemants
         if(boolean expression){
         //body
         }
         else{
         //body
         }
         */
    int salary = 25000;
    if (salary>10000){
        salary+=2000;
    }
    else if (salary>20000){
        salary+=1000;
    }
    System.out.println(salary);
    }


}
