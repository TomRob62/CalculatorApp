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


    }

    public void setVisible()
    {
        mainWindow.validate();
        mainWindow.setVisible(true);
    }
}
