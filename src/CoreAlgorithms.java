

public class CoreAlgorithms {
  public static void main(String args[]) {
    // Divisibility
    int num = (int)(Math.random() * 10);
    
    if(num % 2 == 0){
        System.out.println(num + " is even");
    }
    else{
         System.out.println(num + " is odd");
    }
    
    
    // Digit Extraction (2 digits)
    int num2 = (int)(Math.random() * 90) + 10;
    int onesDigit = num2 % 10;
    int tensDigit = num2 / 10;
    System.out.println("Ones digit of " + num2 + ": " + onesDigit);
    System.out.println("Tens digit of " + num2 + ": " + tensDigit);
    
    
    // Digit Extraction (any integer)
    int num3 =  (int)(Math.random() * 10000);
    System.out.println("Digits of " + num3 + ":");
    while(num3 != 0){
       //Collect and print ones digit
       int digit = num3 % 10;
       System.out.println(digit);
       //Remove ones digit
       num3 /= 10;
    }
    
    
    // Counting
    int count = 0;

    for(int i = 0; i < 100; i++){
       int d1 = (int)(Math.random() * 6) + 1;
       int d2 = (int)(Math.random() * 6) + 1;
    
       if(d1 == d2){
          count++;
       }
    }
    System.out.println("Rolled a pair " + count + " times");


    // Computing a sum (running total)
    int sum = 0;

    for(int i = 0; i < 100; i++){
       int num4 = (int)(Math.random() * 10);
       sum = sum + num4; //or sum += num4;
    }
    System.out.println("Total " + sum);
    
    
    
    // Minimum Value
    int minValue = Integer.MAX_VALUE;

    for(int i = 0; i < 25; i++){
       // random in range [-500, 500]
       int num5 = (int)(Math.random() * 1001) - 500;
    
    	 if(num5 < minValue){
          minValue = num5;
       }
    }
    System.out.println("Minimum Value: " + minValue);
    
  }
}
