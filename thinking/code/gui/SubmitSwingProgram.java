/**
 * @Author: Willendless
 * @Date: 2020-06-07 12:46:02
 * @Description: 
 * @FilePath: \thinking\code\gui\SubmitSwingProgram.java
 */
package thinking.code.gui;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SubmitSwingProgram extends JFrame {
    JLabel label;
    static SubmitSwingProgram ssp;

    public SubmitSwingProgram() throws Exception {
        super("Hello Swing");
        label = new JLabel("a Label");
        add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        setVisible(true);
        TimeUnit.SECONDS.sleep(1);
    }

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable(){
        
            @Override
            public void run() {
                try {
                    ssp = new SubmitSwingProgram();
                } catch (Exception e) {

                }
            }
        });
        SwingUtilities.invokeLater(new Runnable(){
        
            @Override
            public void run() {
                ssp.label.setText("Hey! This is " + new Random(31).nextInt() + "!");
            }
        });


    }
    
}