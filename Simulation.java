public class Simulation {
    static int simulacra(int a, int b){
        for (int i = a ; i < b; i++) {
            b = b + 10; i = i + 20; 
            System.out.print("a = " + a + "; b = "+ b);
            System.out.println("; i = " + i);
        }
        return(b);
    }
    public static void main(String[] args) {
        int l0 = 50; int o1 = 20; int b = simulacra(o1, l0);
    }  
 }	
    