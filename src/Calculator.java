public class Calculator extends MyPhone {
   public static double add(double x, double y){
       return x+y;
   }
   public static double subtract(double x, double y){
       return x-y;
   }
   public static double multiply(double x, double y){
       return  x*y;
   }
   public static double divide(double x, double y){
       if(y!=0){
       return x/y;
   }else{
           System.out.println("Error: division by zero: ");
           return Double.NaN;
    }

}
    }