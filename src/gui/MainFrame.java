package gui;

import controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class MainFrame extends JFrame {
    private LoginRegisterForm loginRegisterForm;
    private Controller controller;
    private TablePanel tablePanel;

    public MainFrame(){
        super("Book Notes App");

        loginRegisterForm = new LoginRegisterForm();
        controller = new Controller();
        tablePanel = new TablePanel();

        setLayout(new BorderLayout());

        add(loginRegisterForm, BorderLayout.WEST);
        add(tablePanel, BorderLayout.CENTER);

        tablePanel.setData(controller.getCommunity());

        loginRegisterForm.setFormListener(new FormListener() {
            @Override
            public void formEventOccurred(FormEvent e) {
                controller.createUser(e);
                tablePanel.refresh();
            }
        });

        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
