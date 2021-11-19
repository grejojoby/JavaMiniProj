import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PuzzleGame extends Frame implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;// bcheat,bcheat2;

    PuzzleGame() {
        frame = new JFrame("Puzzle Game");
        frame.setSize(255, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setBackground(Color.black);
        String[] buttons = { "1", "2", "3", "4", "5", "6", "7", "8", "" };
        
        b1 = new Button(buttons[0]);
        b1.setBounds(50, 100, 40, 40);
        b2 = new Button(buttons[1]);
        b2.setBounds(100, 100, 40, 40);
        b3 = new Button(buttons[2]);
        b3.setBounds(150, 100, 40, 40);
        b4 = new Button(buttons[3]);
        b4.setBounds(50, 150, 40, 40);
        b5 = new Button(buttons[4]);
        b5.setBounds(100, 150, 40, 40);
        b6 = new Button(buttons[5]);
        b6.setBounds(150, 150, 40, 40);
        b7 = new Button(buttons[6]);
        b7.setBounds(50, 200, 40, 40);
        b8 = new Button(buttons[7]);
        b8.setBounds(100, 200, 40, 40);
        b9 = new Button(buttons[8]);
        b9.setBounds(150, 200, 40, 40);
        // bcheat=new Button("");
        // bcheat.setBounds(150,200,40,40);
        JButton bstr = new JButton("Start");
        bstr.setBounds(40, 280, 70, 25);
        bstr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shuffleArray(buttons);
                b1.setLabel(buttons[0]);
                b2.setLabel(buttons[1]);
                b3.setLabel(buttons[2]);
                b4.setLabel(buttons[3]);
                b5.setLabel(buttons[4]);
                b6.setLabel(buttons[5]);
                b7.setLabel(buttons[6]);
                b8.setLabel(buttons[7]);
                b9.setLabel(buttons[8]);
                // Collections.shuffle();
            }
        });

        JButton brul = new JButton("Rules");
        brul.setBounds(130, 280, 70, 25);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.getContentPane().add(brul);
        brul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                // new rulespage();
            }
        });

        // bcheat2=new Button("");
        // bcheat2.setBounds(150,200,40,40);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        // frame.add(bcheat);
        frame.add(bstr);
        frame.add(brul);
        // frame.add(bcheat2);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        // bcheat.setVisible(false);
        // bcheat.setEnabled(false);
        // bcheat2.setVisible(false);
        // bcheat2.setEnabled(false);

        frame.setVisible(true);
    }

    static void shuffleArray(String[] ar) {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            String label = b1.getLabel();
            if (b2.getLabel().equals("")) {
                b2.setLabel(label);
                b1.setLabel("");
            }
            if (b4.getLabel().equals("")) {
                b4.setLabel(label);
                b1.setLabel("");
            }
        }
        if (e.getSource() == b2) {
            String label = b2.getLabel();
            if (b1.getLabel().equals("")) {
                b1.setLabel(label);
                b2.setLabel("");
            }
            if (b3.getLabel().equals("")) {
                b3.setLabel(label);
                b2.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b2.setLabel("");
            }
        }
        if (e.getSource() == b3) {
            String label = b3.getLabel();
            if (b2.getLabel().equals("")) {
                b2.setLabel(label);
                b3.setLabel("");
            }
            if (b6.getLabel().equals("")) {
                b6.setLabel(label);
                b3.setLabel("");
            }
        }
        if (e.getSource() == b4) {
            String label = b4.getLabel();
            if (b1.getLabel().equals("")) {
                b1.setLabel(label);
                b4.setLabel("");
            }
            if (b7.getLabel().equals("")) {
                b7.setLabel(label);
                b4.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b4.setLabel("");
            }
        }
        if (e.getSource() == b5) {
            String label = b5.getLabel();
            if (b2.getLabel().equals("")) {
                b2.setLabel(label);
                b5.setLabel("");
            }
            if (b6.getLabel().equals("")) {
                b6.setLabel(label);
                b5.setLabel("");
            }
            if (b4.getLabel().equals("")) {
                b4.setLabel(label);
                b5.setLabel("");
            }
            if (b8.getLabel().equals("")) {
                b8.setLabel(label);
                b5.setLabel("");
            }
        }
        if (e.getSource() == b6) {
            String label = b6.getLabel();
            if (b9.getLabel().equals("")) {
                b9.setLabel(label);
                b6.setLabel("");
            }
            if (b3.getLabel().equals("")) {
                b3.setLabel(label);
                b6.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b6.setLabel("");
            }
        }
        if (e.getSource() == b7) {
            String label = b7.getLabel();
            if (b4.getLabel().equals("")) {
                b4.setLabel(label);
                b7.setLabel("");
            }
            if (b8.getLabel().equals("")) {
                b8.setLabel(label);
                b7.setLabel("");
            }
        }
        if (e.getSource() == b8) {
            String label = b8.getLabel();
            if (b9.getLabel().equals("")) {
                b9.setLabel(label);
                b8.setLabel("");
            }
            if (b7.getLabel().equals("")) {
                b7.setLabel(label);
                b8.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b8.setLabel("");
            }
        }
        if (e.getSource() == b9) {
            String label = b9.getLabel();
            if (b6.getLabel().equals("")) {
                b6.setLabel(label);
                b9.setLabel("");
            }
            if (b8.getLabel().equals("")) {
                b8.setLabel(label);
                b9.setLabel("");
            }
        }

        // congrats code
        if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3")
                && b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6")
                && b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("")) {
            JOptionPane.showMessageDialog(this, "Congratulations! You won.");
        }
    }

    public static void main(String args[]) {
        new PuzzleGame();
    }
}
