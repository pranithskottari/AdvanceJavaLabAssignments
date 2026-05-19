package Swings;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
public class TabbedPaneColors extends JFrame {
	JTabbedPane tabbedPane;

    public TabbedPaneColors() {

        // Frame Title
        setTitle("Tabbed Pane Colors");

        // Create TabbedPane
        tabbedPane = new JTabbedPane();

        // Create Panels
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add Tabs
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add Change Listener
        tabbedPane.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

                int index = tabbedPane.getSelectedIndex();
                String tabName = tabbedPane.getTitleAt(index);

                // Display selected tab color
                System.out.println("Selected Color: " + tabName);
            }
        });

        // Add TabbedPane to Frame
        add(tabbedPane);

        // Frame Settings
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Main Method
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  new TabbedPaneColors();
    }


}
