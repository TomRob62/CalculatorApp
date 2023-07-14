import javax.swing.*;
import java.awt.*;

public class GUI_Components
{
    private JFrame mainWindow;
    private JPanel numbersPanel;
    private JPanel mathPanel;

    public GUI_Components()
    {
        //setting up the main application window
        mainWindow = new JFrame();
        mainWindow.setSize(1020, 720);
        mainWindow.setName("MainWindow");
        mainWindow.setTitle("Calculator App");
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //setting up the numbersPanel
        numbersPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        Font buttonsFont = new Font("buttonsFont", Font.PLAIN, 20);


        //adding '(' '0' ')' to bottom of panel
        JButton b1, b2, b3;
        b1 = new JButton();
        b1.setName("LeftParenthesis");
        b1.setText("(");
        b1.setPreferredSize(new Dimension(50,50));
        b1.setFont(buttonsFont);
        constraints.gridy = 0;
        constraints.gridx = 0;
        numbersPanel.add(b1, constraints);

        b2 = new JButton();
        b2.setName("Button0");
        b2.setText("0");
        b2.setPreferredSize(new Dimension(50,50));
        b2.setFont(buttonsFont);
        constraints = new GridBagConstraints();
        constraints.gridy = 0;
        constraints.gridx = 1;
        numbersPanel.add(b2, constraints);

        b3 = new JButton();
        b3.setName("RightParenthesis");
        b3.setText(")");
        b3.setPreferredSize(new Dimension(50,50));
        b3.setFont(buttonsFont);
        constraints = new GridBagConstraints();
        constraints.gridy = 0;
        constraints.gridx = 2;
        numbersPanel.add(b3, constraints);

        //adding buttons 1-9
        int yConstraint = 1;
        for(int i = 0; i < 9; i++)
        {
            JButton temp = new JButton();
            temp.setFont(buttonsFont);
            temp.setName("Button" + String.valueOf(i+1));
            temp.setPreferredSize(new Dimension(50,50));
            temp.setText(String.valueOf(i+1));

            //places buttons in a 3 by 3 grid
            if(i%3 == 0)
            {
                yConstraint++;
            }
            constraints = new GridBagConstraints();
            constraints.gridx = i%3;
            constraints.gridy = yConstraint;
            numbersPanel.add(temp, constraints);
        }

        //setting up the mathPanel. aka all the functions like +*/-
        mathPanel = new JPanel(new GridBagLayout());

        //adding Panels to mainWindow
        mainWindow.add(mathPanel);
        mainWindow.add(numbersPanel);
    }

    public void setVisible()
    {
        mainWindow.validate();
        mainWindow.setVisible(true);
    }
}
