package one;

public class ASub extends A {
  public static void main(String[] args) {
    ASub sub = new ASub();
    System.out.println(sub.publicA);
    System.out.println(sub.protectedA);
    System.out.println(sub.noModifier);
    // System.out.println(sub.privateA);

    /**
     * Trong access modifier
     * Khá»Ÿi táº¡o Ä‘á»‘i tÆ°á»£ng nÃ o khÃ´ng quan trá»�ng báº±ng
     * khá»Ÿi táº¡o Ä‘á»‘i tÆ°á»£ng Ä‘á»©ng á»Ÿ class nÃ o
     */
    A a = new A();
    System.out.println(a.publicA);
    System.out.println(a.protectedA);
    System.out.println(a.noModifier);
    // System.out.println(a.privateA);
  }
}
