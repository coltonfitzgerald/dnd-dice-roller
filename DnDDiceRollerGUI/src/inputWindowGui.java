import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
public class inputWindowGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    JFrame myFrame = new JFrame(); // Creates the JFrame window
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exits on close
	    JPanel myPanel = (JPanel)myFrame.getContentPane();
	    JPanel leftPanel = (JPanel)myFrame.getContentPane();
	    JPanel rightPanel = (JPanel)myFrame.getContentPane();
	    leftPanel.setLayout(new BoxLayout(leftPanel,BoxLayout.X_AXIS));
	    rightPanel.setLayout(new BoxLayout(rightPanel,BoxLayout.X_AXIS));
	    
	    
	    myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.X_AXIS)); // Attaches the layout manager to the JFrame
	    
	    //Layouts
	    myFrame.setTitle("DnD Dice Roller");
	    myFrame.setSize(600, 600);
	    myFrame.setLocation(100, 300);
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    //Left Column or Frame
	    leftPanel.setSize(250,250);
	    
	    JPanel topLeftPanel = new JPanel();
	    FlowLayout leftFlow = new FlowLayout();
	    topLeftPanel.setLayout(leftFlow);
	    topLeftPanel.setSize(250,100);
	    
	    //Grid Layout for Top-Right Section
	    rightPanel.setSize(250,250);
	    
	    JPanel topRightPanel = new JPanel();
	    FlowLayout rightTopFlow = new FlowLayout();
	    topRightPanel.setLayout(rightTopFlow);
	    topRightPanel.setSize(100,100);
	    topRightPanel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
	    
	       
	    // Description Section
	    JLabel diceLabel = new JLabel("Description");
	    topLeftPanel.add(diceLabel);
	    JTextField descriptionField = new JTextField(20);
	    descriptionField = new JTextField(20);
	    topLeftPanel.add(descriptionField);
	    
	    //Description Variable Input
	    String descInput = descriptionField.getText();
	    
	    //Spinners
	    JLabel numDiceLabel = new JLabel("Number Of Dice");
	    topLeftPanel.add(numDiceLabel);
	    JSpinner numDice = new JSpinner();
	    topLeftPanel.add(numDice);
	    
	    JLabel numSidesLabel = new JLabel("Number Of Sides");
	    topLeftPanel.add(numSidesLabel);
	    JSpinner numSides = new JSpinner();
	    topLeftPanel.add(numSides);
	    
	    //Counter Variable Input
	    int diceNumber = (Integer)numDice.getValue();
	    int diceSides = (Integer)numSides.getValue();
	    
	    //Spinner Spacing
	    Component mySpinnerEditor1 = numSides.getEditor();
	    JTextField jtf1 = ((JSpinner.DefaultEditor) mySpinnerEditor1).getTextField();
	    jtf1.setColumns(2);
	    
	    Component mySpinnerEditor2 = numDice.getEditor();
	    JTextField jtf2 = ((JSpinner.DefaultEditor) mySpinnerEditor2).getTextField();
	    jtf2.setColumns(2);
	    
	    //leftPanel.add(topLeftPanel);
	    //rightPanel.add(topRightPanel);
	    Border myBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
	    topLeftPanel.setBorder(myBorder);
	    topRightPanel.setBorder(myBorder);
	    myFrame.setVisible(true);
	}

}
/*
 * 	    // Right Column or Frame
	    JPanel rightPanel = new JPanel();
	    FlowLayout rightFlow = new FlowLayout();
	    rightPanel.setLayout(rightFlow);
	    rightPanel.setSize(250,100);
	    */
