package Aptech002.src.minhduong;

import java.util.Scanner;

public class InputOutput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ten;
    int tuoi = 10;
    
    // sc.nextLine();
    System.out.println("Vui long nhap ten: ");
    ten = sc.nextLine();

    try {
      System.out.println("Vui long nhap tuoi");
      tuoi = sc.nextInt();
    } catch (Exception e) {
      // System.out.println(e.getMessage());
      e.printStackTrace();
    }
    
    System.out.println("Ten ban la: "+ ten);
    System.out.println("Tuoi cua ban la: "+ tuoi);
  }
}
