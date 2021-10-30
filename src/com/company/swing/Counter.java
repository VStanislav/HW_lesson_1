 package com.company.swing;

 import javax.swing.*;
 import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {

    private static int numberOfChangeCounter = 1;
    private static int counter = 0 ;
    private static JLabel labelViewCounter;


    public static void main(String[] args) {
        JFrame frame = createMainFrame();

        Font font = new Font("Algerian",Font.BOLD,40);

        createTextField(frame);
        createBottons(frame, font);
        createCounterView(frame, font);

    }

    private static void createTextField(JFrame frame) {
        JTextField field = new JTextField();
        field.setFont(new Font("Arial", Font.BOLD,32));
        field.setHorizontalAlignment(JTextField.CENTER);
        frame.add(field,BorderLayout.NORTH);

        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    numberOfChangeCounter = Integer.parseInt(field.getText());
                    System.out.println(numberOfChangeCounter);
                    field.setText("");
                }catch (NumberFormatException x) {
                    field.setText("Error");
                }
            }
        });
    }

    private static JFrame createMainFrame() {
        JFrame frame = new JFrame();
        frame.setTitle("Easy counter");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(300,300,500,300);
        frame.setVisible(true);
        return frame;
    }

    private static void createCounterView(JFrame frame, Font font) {
        labelViewCounter = new JLabel(String.valueOf(counter));
        labelViewCounter.setHorizontalAlignment(SwingConstants.CENTER);
        labelViewCounter.setFont(font);
        frame.add(labelViewCounter,BorderLayout.CENTER);
    }

    private static void createBottons(JFrame frame, Font font) {
        JButton decButton = new JButton("<");
        frame.add(decButton,BorderLayout.LINE_START);
        decButton.setFont(font);

        JButton incButton = new JButton(">");
        frame.add(incButton, BorderLayout.LINE_END);
        incButton.setFont(font);

        JButton resetButton = new JButton("Reset counter");
        frame.add(resetButton, BorderLayout.PAGE_END);
        resetButton.setFont(font);

        decButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelViewCounter.setText(String.valueOf(counter-=numberOfChangeCounter));
            }
        });

        incButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                labelViewCounter.setText(String.valueOf(counter+=numberOfChangeCounter));
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelViewCounter.setText(String.valueOf(counter=0));
                numberOfChangeCounter=1;
            }
        });


    }


}
