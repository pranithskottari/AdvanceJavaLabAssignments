package Swings;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class JListExample extends JFrame{
	private JList&lt;String&gt; countryList;
	public JListExample() {
	//create the model and add elements
	DefaultListModel&lt;String&gt; listModel = new DefaultListModel&lt;&gt;();
	listModel.addElement(&quot;USA&quot;);
	listModel.addElement(&quot;India&quot;);
	listModel.addElement(&quot;Vietnam&quot;);
	listModel.addElement(&quot;Canada&quot;);
	listModel.addElement(&quot;Denmark&quot;);
	listModel.addElement(&quot;France&quot;);
	listModel.addElement(&quot;Great Britain&quot;);
	listModel.addElement(&quot;Japan&quot;);
	listModel.addElement(&quot;Africa&quot;);
	listModel.addElement(&quot;Greenland&quot;);
	listModel.addElement(&quot;Singapore&quot;);
	listModel.addElement(&quot;&quot;);
	//create the list
	countryList = new JList&lt;&gt;(listModel);
	countryList.addListSelectionListener(new ListSelectionListener() {
	@Override
	public void valueChanged(ListSelectionEvent e) {
	if (!e.getValueIsAdjusting()) {
	final List&lt;String&gt; selectedValuesList = countryList.getSelectedValuesList();
	System.out.println(selectedValuesList);
	}
	}
	});
	add(new JScrollPane(countryList));
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle(&quot;JList Example&quot;);
	this.setSize(200, 200);
	this.setLocationRelativeTo(null);
	this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JListExample();
	
	}

}
