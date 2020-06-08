/**
 * @Author: Willendless
 * @Date: 2020-06-07 18:48:32
 * @Description: learn JTextArea
 * @FilePath: \thinking\code\gui\TextArea.java
 */
package thinking.code.gui;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.FlowLayout;

public class TextArea extends JFrame {
    private JButton b1 = new JButton("Add Data");
    private JButton b2 = new JButton("Clear Data");

    private JTextArea t = new JTextArea(20, 50);

    private Map<String, String> m = new HashMap<>();

    public TextArea() {
        setLayout(new FlowLayout());
        m.put("China", "Beijing");
        m.put("the U.S.", "Washinton");
        m.put("the U.K.", "London");
        m.put("Japan", "Tokyo");

        b1.addActionListener((e) -> {
            for (Map.Entry en : m.entrySet())
                t.append(en.getKey() + ": " + en.getValue() + "\n");
        });

        b2.addActionListener((e) -> {
            t.setText("");
        });

        add(b1);
        add(b2);
        add(new JScrollPane(t));
    }

    public static void main(String[] args) {
        SwingConsole.run(new TextArea(), 500, 500);
    }
    
}