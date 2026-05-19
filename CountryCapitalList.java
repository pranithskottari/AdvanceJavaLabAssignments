package Swings;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;
public class CountryCapitalList extends JFrame  {

    JList<String> countryList;

    public CountryCapitalList() {

        // Frame Title
        setTitle("Country and Capital List");

        // Countries Array
        String countries[] = {
                "USA",
                "India",
                "Vietnam",
                "Canada",
                "Denmark",
                "France",
                "Great Britain",
                "Japan",
                "Africa",
                "Greenland",
                "Singapore"
        };

        // Capitals using HashMap
        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Addis Ababa");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // Create JList
        countryList = new JList<>(countries);

        // Selection Mode
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add ScrollPane
        JScrollPane sp = new JScrollPane(countryList);

        // Add Listener
        countryList.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {

                // Avoid duplicate events
                if (!e.getValueIsAdjusting()) {

                    // Get selected countries
                    java.util.List<String> selectedCountries =
                            countryList.getSelectedValuesList();

                    // Display capitals in console
                    for (String country : selectedCountries) {
                        System.out.println("Capital of " + country +
                                " is: " + capitals.get(country));
                    }

                    System.out.println();
                }
            }
        });

        // Add to Frame
        add(sp, BorderLayout.CENTER);

        // Frame Settings
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Main Method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new CountryCapitalList();

	}

}
  