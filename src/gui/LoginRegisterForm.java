package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginRegisterForm extends JPanel implements ActionListener{
    private JLabel userNameLabel;
    private JTextField userNameField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton;
    private FormListener listener;

    public LoginRegisterForm(){
        userNameLabel = new JLabel("Username: ");
        userNameField = new JTextField(10);
        passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField(10);
        loginButton = new JButton("Login");
        registerButton = new JButton("Register");

        setLayout(new GridBagLayout());

        layoutSettings();

        loginButton.addActionListener(this);
        registerButton.addActionListener(this);
    }

    public void setFormListener(FormListener listener){
        this.listener = listener;
    }

    public void actionPerformed(ActionEvent e){
        JButton clicked = (JButton)e.getSource();

        if(clicked == loginButton || clicked == registerButton){
            String userName = userNameField.getText();
            char[] password = passwordField.getPassword();

            FormEvent ev = new FormEvent(this, userName, password);

            if(clicked == registerButton){
                if(listener != null){
                    // Pass the information so that a new user can be created
                    listener.formEventOccurred(ev);
                }
            } else if(clicked == loginButton){
                if(listener != null){
                    // Do something else when the user logs in
                    System.out.println("Login");
                }
            }
        }
    }

    public void layoutSettings(){
        GridBagConstraints gc = new GridBagConstraints();

        // Row 1 ----------------------------------------------------------------------------
        gc.weightx = 0;
        gc.weighty = 0;
        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.CENTER;

        add(userNameLabel, gc);

        gc.weightx = 0;
        gc.weighty = 0;
        gc.gridx = 1;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.CENTER;

        add(userNameField, gc);

        // Row 2 ----------------------------------------------------------------------------
        gc.weightx = 0;
        gc.weighty = 0;
        gc.gridx = 0;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.CENTER;

        add(passwordLabel, gc);

        gc.weightx = 0;
        gc.weighty = 0;
        gc.gridx = 1;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.CENTER;

        add(passwordField, gc);

        // Row 3 ----------------------------------------------------------------------------
        gc.weightx = 0;
        gc.weighty = 0;
        gc.gridx = 0;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.CENTER;

        add(loginButton, gc);

        gc.weightx = 0;
        gc.weighty = 0;
        gc.gridx = 1;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.CENTER;

        add(registerButton, gc);

    }
}
