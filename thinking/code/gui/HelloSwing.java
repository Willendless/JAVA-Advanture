/**
 * @Author: Willendless
 * @Date: 2020-06-07 11:55:13
 * @Description: 利用JFrame创建视窗应用
 * @FilePath: \thinking\code\gui\HelloSwing.java
 */

package thinking.code.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

import java.util.Random;


public class HelloSwing {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Hello Swing");
        frame.setLayout(new FlowLayout());
        int bound = new Random().nextInt(100) + 2;
        for (int i = 0; i < bound; i++) {
            JLabel label = new JLabel("Hello I am num + " + i, JLabel.CENTER);
            label.setBounds(i, 0, 1, 1);
            frame.add(label);
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
