package one;

public class B {
  public static void main(String[] args) {
    A a = new A();
    System.out.println(a.publicA);
    System.out.println(a.protectedA);
    System.out.println(a.noModifier);
    // System.out.println(a.privateA);
  }
}
