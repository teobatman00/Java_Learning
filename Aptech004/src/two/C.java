package two;

import one.A;

public class C extends A {
  public static void main(String[] args) {
    C c = new C();
    System.out.println(c.protectedA);
    System.out.println(c.publicA);
    // System.out.println(c.noModifier);

    A a = new A();
    System.out.println(a.publicA);
    // System.out.println(a.protectedA);
    // System.out.println(a.noModifier);
    // System.out.println(a.privateA);
  }
}
