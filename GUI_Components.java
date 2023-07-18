import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Components
{
    private JFrame mainWindow;
    private JFormattedTextField display;
    private JPanel numbersPanel;
    private JPanel mathPanel;
    private Calculator calculator;

    public GUI_Components() {
        calculator = new Calculator();
        //setting up the main application window
        mainWindow = new JFrame();
        mainWindow.setLayout(new GridBagLayout());
        mainWindow.setSize(1020, 720);
        mainWindow.setName("MainWindow");
        mainWindow.setTitle("Calculator App");
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Setting up the display
        display = new JFormattedTextField();
        display.setName("Display");
        display.setValue(0);
        display.setPreferredSize(new Dimension(800, 100));
        display.setFont(new Font("Display Font", Font.PLAIN, 16));

        //Setting up numbers panel
        numbersPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints;
        String numbers = "987654321)0(";
        int row = 0;
        for(int i = 0; i < numbers.length(); i++)
        {
            String value = numbers.substring(i,i+1);
            MyButton temp = new MyButton(value, display);
            constraints = new GridBagConstraints();
            constraints.gridy = row;
            constraints.gridx = i%3;
            if(i%3 == 0 && i != 0)
            {
                row++;
            }
            numbersPanel.add(temp,constraints);
        }

        //Setting up math Panel
        mathPanel = new JPanel(new GridBagLayout());
        String math = "/*-+";
        for(int i = 0; i < math.length(); i++)
        {
            String value = math.substring(i,i+1);
            MyButton temp = new MyButton(value, display);
            constraints = new GridBagConstraints();
            constraints.gridy = i;
            constraints.gridx = 0;
            mathPanel.add(temp,constraints);
        }

        constraints = new GridBagConstraints();
        constraints.gridy = 1;
        constraints.gridx = 0;
        constraints.weightx = .5;
        mainWindow.add(numbersPanel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridy = 1;
        constraints.gridx = 1;
        constraints.weightx = .5;
        mainWindow.add(mathPanel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        mainWindow.add(display, constraints);
    }

    public void setVisible()
    {
        mainWindow.validate();
        mainWindow.setVisible(true);
    }
}
