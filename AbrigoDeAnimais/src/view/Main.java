package view;

import control.Controller;

public class Main {
    public static void main(String[] args) {
        View view = new View(new Controller());

        view.iniciarSistema();
    }
}