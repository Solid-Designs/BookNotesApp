package gui;

import controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class MainFrame extends JFrame {
    private LoginRegisterForm loginRegisterForm;
    private Controller controller;

    public MainFrame(){
        super("Book Notes App");

        loginRegisterForm = new LoginRegisterForm();
        controller = new Controller();

        setLayout(new BorderLayout());

        add(loginRegisterForm, BorderLayout.CENTER);

        loginRegisterForm.setFormListener(new FormListener() {
            @Override
            public void formEventOccurred(FormEvent e) {
                controller.createUser(e);
                System.out.println(controller.getCommunity());
            }
        });

        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
