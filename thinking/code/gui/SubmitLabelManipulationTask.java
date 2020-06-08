/**
 * @Author: Willendless
 * @Date: 2020-06-07 12:27:22
 * @Description: 提交任务到事件队列
 * @FilePath: \thinking\code\gui\SubmitLabelManipulationTask.java
 */
package thinking.code.gui;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SubmitLabelManipulationTask {

    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Hello Frame");
        final JLabel label = new JLabel();
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);

        TimeUnit.SECONDS.sleep(1);
        // awt 事件队列包装函数
        SwingUtilities.invokeLater(new Runnable(){
        
            @Override
            public void run() {
                label.setText("A Label");
            }
        });

    }
    
}
