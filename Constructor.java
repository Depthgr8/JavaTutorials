class A{
String x = "A";
    A(){
        // String x = x.toString();
        System.out.println("A constructor called, and value of x is = " + x);
    }
}
class B extends A{
    String x = "B";
    B(){
        // super();
        // this.x = super.x;
        int y = x.length();
        System.out.println("B constructor called, and value of x is = " + y);
    }
    void show(){
        System.out.println("It's a method, not a constructor");
    }
}
public class Constructor {
    public static void main(String [] args){
        B b = new B();
        b.show();
    }    
}
