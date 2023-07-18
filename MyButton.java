import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton
{
    public MyButton(String v, JFormattedTextField display)
    {
        Font buttonFont = new Font("Sans Serif", Font.PLAIN, 20);
        this.setFont(buttonFont);
        this.setName(v);
        this.setText(v);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String m1 = display.getText();
                m1 += v;
                display.setText(m1);
                display.validate();
                display.repaint();
            }
        });
    }
}
