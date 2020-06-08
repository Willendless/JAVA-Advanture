/**
 * @Author: Willendless
 * @Date: 2020-06-07 17:11:49
 * @Description: 通过按钮捕获事件
 * @FilePath: \thinking\code\gui\Button2.java
 */
package thinking.code.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import static thinking.code.gui.SwingConsole.run;

public class Button2 extends JFrame{

    private JButton
            b1 = new JButton("Button 1"),
            b2 = new JButton("Button 2");

    private JTextField txt = new JTextField(10);

    public Button2() {
        b1.addActionListener((e) -> {
            String name = ((JButton)e.getSource()).getText();
            txt.setText(name);
        });
        b2.addActionListener((e) -> {
            String name = ((JButton)e.getSource()).getText();
            txt.setText(name);
        });
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(txt);
    }

    public static void main(String[] args) {
        run(new Button2(), 300, 300);
    }

    
}