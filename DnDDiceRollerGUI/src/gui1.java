import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JSeparator;

public class gui1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui1 window = new gui1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Frame
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Left Side Panel
		JPanel leftPanel = new JPanel();
		leftPanel.setBounds(0, 0, 250, 578);
		frame.getContentPane().add(leftPanel);
		leftPanel.setLayout(null);
		
		//Left Side Contents
		JLabel descLabel = new JLabel("Description of Roll");
		descLabel.setBounds(76, 19, 73, 16);
		leftPanel.add(descLabel);
		
		textField = new JTextField();
		textField.setBounds(47, 47, 138, 26);
		leftPanel.add(textField);
		textField.setColumns(10);
		
		JLabel numDiceLabel = new JLabel("# of Dice");
		numDiceLabel.setBounds(37, 112, 57, 16);
		leftPanel.add(numDiceLabel);
		
		JSpinner numDice = new JSpinner();
		numDice.setBounds(47, 140, 33, 26);
		leftPanel.add(numDice);
		
		JLabel numSidesLabel = new JLabel("# of Sides");
		numSidesLabel.setBounds(142, 112, 62, 16);
		leftPanel.add(numSidesLabel);
		
		JSpinner numSides = new JSpinner();
		numSides.setBounds(152, 140, 33, 26);
		leftPanel.add(numSides);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(56, 217, 117, 29);
		leftPanel.add(btnSubmit);
		
		//Right Side Panel
		JPanel rightPanel = new JPanel();
		rightPanel.setBounds(250, 0, 250, 578);
		frame.getContentPane().add(rightPanel);
		rightPanel.setLayout(null);
		
		//Right Side Contents
		JLabel changedDesc = new JLabel("Description of Roll");
		changedDesc.setBounds(30, 25, 175, 16);
		rightPanel.add(changedDesc);
		
		JTextPane randomNum1 = new JTextPane();
		randomNum1.setBounds(30, 86, 40, 40);
		rightPanel.add(randomNum1);
		
		JTextPane randomNum2 = new JTextPane();
		randomNum2.setBounds(82, 86, 40, 40);
		rightPanel.add(randomNum2);
		
		JTextPane randomNum3 = new JTextPane();
		randomNum3.setBounds(136, 86, 40, 40);
		rightPanel.add(randomNum3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 150, 238, 12);
		rightPanel.add(separator);
		
		// Variables
	    int diceNumber = (Integer)numDice.getValue();
	    int diceSides = (Integer)numSides.getValue();
	}
}
