public class MyMath {
   public int calculator(int[] Numbers){
       int sum = 0;
       for(int number: Numbers){
           sum += number;
       }
       return sum;
    }
}