/**
 * @Author: Willendless
 * @Date: 2020-06-07 17:40:56
 * @Description: exercise 22-5: 一个文本域与三个按钮
 * @FilePath: \thinking\code\gui\hw5.java
 */
package thinking.code.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.FlowLayout;

public class hw5 extends JFrame {

    private JButton b1 = new JButton("I am 1"),
                    b2 = new JButton("I am 2"),
                    b3 = new JButton("I am 3");
    
    private JTextField txt = new JTextField(20);

    private hw5() {
        setLayout(new FlowLayout());
        b1.addActionListener((e) -> {
            String name = ((JButton)e.getSource()).getText();
            txt.setText(name);
        });
        b2.addActionListener((e) -> {
            String name = ((JButton)e.getSource()).getText();
            txt.setText(name);
        });
        b3.addActionListener((e) -> {
            String name = ((JButton)e.getSource()).getText();
            txt.setText(name);
        });
        add(b1);
        add(b2);
        add(b3);
        add(txt);
    }

    public static void main(String[] args) {
        SwingConsole.run(new hw5(), 300, 200);
    }

}