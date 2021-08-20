package minhduong;

/** {@code Pupil}
 * học sinh (Pupil) kế thừa sinh viên (Student) 
 * pupil => subclass (class con) child 
 * student => superClass (class cha) parent
 * con kế thừa cha, cha có gì thì con có đó.
 * @method main
 * 
 */
public class Pupil extends Student {

  public static void main(String[] args){
    Pupil pu1 = new Pupil();
    System.out.println(pu1.id);
    System.out.println(pu1.fullName);
    System.out.println(pu1.gender);
    pu1.hello();
  }
}
