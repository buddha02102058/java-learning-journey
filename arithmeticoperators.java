public class arithmeticoperators {
    
    public static void main(String[]args){
     int x , y , answer , answer1 , answer2 , answer4;
      double answer3;
      x = 50;
      y = 30; 
      answer = x + y; //Here the + is used as arithmetic operator for addition of two integers
      answer1 = x - y; //Here the - is used as arithmetic operator for subtraction of two integers
      answer2 = x * y; //Here the * is used as arithmetic operator for multiplication of two integers
      answer3 = x / (double)y; //Here the / is used as arithmetic operator for division of two integers and to get precise answer we have type casted y to double
      answer4 = x % y; //Here the % is used as arithmetic operator for modulus of two integers
      System.out.println("The addition of the two number is " + answer); //Here the + is used as concatenation operator for joining string i.e "Asnwer is" and integer i.e answer
         System.out.println("The subtraction of the two number is " + answer1);
            System.out.println("The multiplication of the two number  is " + answer2);
                System.out.println("The division of the two number is " + answer3);
                    System.out.println("The modulus of the two number is " + answer4);


    }
}
