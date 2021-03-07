public class Main{
    public static void main(String[]args){
        Calculator calculator = new Calculator();
        System.out.println("The Additoin is " +calculator.addition(7,3));
        System.out.println("The Additoin is " +calculator.addition(7.0,3.0));
        System.out.println("The Additoin is " +calculator.addition(123L,123L));

        System.out.println("The Subtraction is " +calculator.subtraction(7,3));
        System.out.println("The Subtraction is " +calculator.subtraction(7.0,3.0));
        System.out.println("The Additoin is " +calculator.subtraction(321L,123L));

    }


}