/**
 * @Author: Willendless
 * @Date: 2020-06-07 17:11:49
 * @Description: Button1
 * @FilePath: \thinking\code\gui\Button1.java
 */
package thinking.code.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import static thinking.code.gui.SwingConsole.run;

public class Button1 extends JFrame{

    private JButton
            b1 = new JButton("Button 1"),
            b2 = new JButton("Button 2");

    public Button1() {
        // 默认使用BorderLayout，下一个控件会覆盖前一个控件。
        setLayout(new FlowLayout());
        // 构造器内部加入窗台
        add(b1);
        add(b2);
    }

    public static void main(String[] args) {
        run(new Button1(), 300, 300);
    }

    
}