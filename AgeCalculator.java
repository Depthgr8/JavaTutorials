public class AgeCalculator{
    static int processor(int a, int b){
        int age = a - b;
        return(age);
    }
    static int blackBox(int age){
        int processed_age = age;
        /* You may write the code here to,  
        process raw data ‘age’ field */
        processed_age = Math.abs(age);
        return(processed_age);
     }
    public static void main(String[] args) {
        int yb = Integer.parseInt(args[0]);
        int cy = Integer.parseInt(args[1]);
        int age = processor(yb, cy);
        System.out.print("Value of calculated age is = ");
        System.out.print(blackBox(age));
     }  
 }