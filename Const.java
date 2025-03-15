class A{
A() {
    Integer a = 13;
        System.out.print(a+"-"); }}
class B extends A{
    B() {
        System.out.println("B constructor");}}
class Const{
    public static void main(String[] args){
        A a = new B(); }}