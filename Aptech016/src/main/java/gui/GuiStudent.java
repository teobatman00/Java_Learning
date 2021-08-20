package gui;

import bal.BalStudent;

public class GuiStudent {
    public static void main(String[] args) {
        BalStudent bal = new BalStudent();
        bal.getStu().forEach(System.out::println);

    }

}
