/**
 * @Author: Willendless
 * @Date: 2020-06-07 17:00:01
 * @Description: Template code for frame generation
 * @FilePath: \thinking\code\gui\SwingConsole.java
 */
package thinking.code.gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SwingConsole {

    public static void
    run(final JFrame f, final int width, final int height) {
        SwingUtilities.invokeLater(new Runnable(){
        
            @Override
            public void run() {
                f.setTitle(f.getClass().getSimpleName());
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(width, height);
                f.setVisible(true);
            }
        });
    }
    
}