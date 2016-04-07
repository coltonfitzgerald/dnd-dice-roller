import javax.swing.*;
import java.awt.*;
public class inputWindowGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    JFrame myFrame = new JFrame(); // Creates the JFrame window
	    FlowLayout myLayout = new FlowLayout(); // Creates the layout manager
	    myFrame.setLayout(myLayout); // Attaches the layout manager to the JFrame
	    
	    //Layouts
	    myFrame.setTitle("DnD Dice Roller");
	    myFrame.setSize(600, 400);
	    myFrame.setLocation(100, 300);
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    // Description Section
	    JLabel diceLabel = new JLabel("Description");
	    myFrame.add(diceLabel);
	    JTextField descriptionField = new JTextField(20);
	    descriptionField = new JTextField(20);
	    myFrame.add(descriptionField);
	    
	    //Description Variable Input
	    String descInput = descriptionField.getText();
	    
	    //Spinners
	    JLabel numDiceLabel = new JLabel("Number Of Dice");
	    myFrame.add(numDiceLabel);
	    JSpinner numDice = new JSpinner();
	    myFrame.add(numDice);
	    
	    JLabel numSidesLabel = new JLabel("Number Of Sides");
	    myFrame.add(numSidesLabel);
	    JSpinner numSides = new JSpinner();
	    myFrame.add(numSides);
	    
	    //Counter Variable Input
	    int diceNumber = (Integer)numDice.getValue();
	    int diceSides = (Integer)numSides.getValue();
	    
	    //Not finished
	    Component mySpinnerEditor = numSides.getEditor();
	    JTextField jtf = ((JSpinner.DefaultEditor) mySpinnerEditor).getTextField();
	    jtf.setColumns(2);
	    
	    myFrame.setVisible(true);
	}

}
