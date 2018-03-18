import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JTextPane;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class MainPage 
{
	private JFrame frmSearchEngine;
	private JPanel panel4;
	private JPanel panel5;
	public static void main(String[] args) {
 		EventQueue.invokeLater(new Runnable() {
 			public void run() {
 				try {
 					MainPage window = new MainPage();
 					window.frmSearchEngine.setVisible(true);
 				} catch (Exception e) {
 					e.printStackTrace();
 				}
 			}
 		});
	}

public MainPage() {
		initialize();
	}

private void initialize() 
{
	
		frmSearchEngine = new JFrame();
		frmSearchEngine.setType(Type.POPUP);
		frmSearchEngine.setTitle(" Search Engine ");
		frmSearchEngine.getContentPane().setBackground(Color.WHITE);
		frmSearchEngine.setBounds(300, 300, 667, 541);
		frmSearchEngine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSearchEngine.getContentPane().setLayout(null);
		
		panel4 = new JPanel();
 		panel4.setBounds(0, 0, 668, 100);
 		frmSearchEngine.getContentPane().add(panel4);
 		panel4.setLayout(null);
 		
 		panel5 = new JPanel();
 		panel5.setBounds(0, 450, 668, 100);
 		frmSearchEngine.getContentPane().add(panel5);
 		panel5.setLayout(null);
 		
		JLabel lblSearchEngine = new JLabel("Search Engine");
		lblSearchEngine.setBounds(250, 0, 140, 30);
		lblSearchEngine.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchEngine.setFont(new Font("SansSerif", Font.BOLD, 20));
		panel4.add(lblSearchEngine);
		
		JLabel lblSearchTerms = new JLabel("Search Terms:  ");
		lblSearchTerms.setBounds(0, 34, 100, 25);
		lblSearchTerms.setHorizontalAlignment(SwingConstants.LEFT);
		lblSearchTerms.setFont(new Font("SansSerif", Font.PLAIN, 13));
		panel4.add(lblSearchTerms);
		
		JTextField txtSearchHere = new JTextField("Type Here...");
		txtSearchHere.setBounds(100, 37, 300, 16);
		txtSearchHere.setHorizontalAlignment(SwingConstants.LEFT);
		txtSearchHere.setFont(new Font("SansSerif", Font.PLAIN, 11));
		panel4.add(txtSearchHere);	
		
        // Grouping the RadioButtons together.
		ButtonGroup bgroup = new ButtonGroup();
		
		JRadioButton jRadioButton1 = new JRadioButton("All of these Search Terms");
		jRadioButton1.setBounds(40, 70, 180, 27);
		jRadioButton1.setFont(new Font("SansSerif", Font.PLAIN, 13));
		panel4.add(jRadioButton1);
		bgroup.add(jRadioButton1);
		
		JRadioButton jRadioButton2 = new JRadioButton("Any of these Search Terms");
		jRadioButton2.setBounds(250, 70, 200, 27);
		jRadioButton2.setFont(new Font("SansSerif", Font.PLAIN, 13));
		panel4.add(jRadioButton2);
		bgroup.add(jRadioButton2);
		
		JRadioButton jRadioButton3 = new JRadioButton("Exact Phrase");
		jRadioButton3.setBounds(450, 70, 180, 27);
		jRadioButton3.setFont(new Font("SansSerif", Font.PLAIN, 13));
		panel4.add(jRadioButton3);
		bgroup.add(jRadioButton3);

		JButton btnsearch = new JButton("Search");
		btnsearch.setBounds(500, 35, 90, 20);
		btnsearch.setFont(new Font("SansSerif", Font.PLAIN, 15));
		panel4.add(btnsearch);		
		
		if (jRadioButton1.isSelected()) {
			//When RadioButtion is selected, the searching happens here.
			//To search all search terms.
			String word = "";
			String fileNames = "";
			String files;
			String inputWord = null;
			File folder = new File("Test.txt");
			File[] listOfFiles = folder.listFiles();
			File file = new File("Test.txt");
			
			try {
				//Searches the file for all words within the search text.
				Scanner input = new Scanner(file);
				while (input.hasNext()) {
					word = input.next();
					if (inputWord.equals(word)) {
						//Adds the file names into a list.
						for (int i= 0; i < listOfFiles.length; i++) {
						if (listOfFiles[i].isFile()) {
							files = listOfFiles[i].getName();
							fileNames += "\n" + file;
						}

						//lblSearchTerms.setText(fileNames);
						}
					}
				}
			}catch (Exception error) {
				
			}
			//Scanner s1 = new Scanner(System.in);
			//String folderPath = s1.next();
			//File folder = new File(folderPath);
			//File[] listOfFiles = folder.listFiles();
			
			//if (folder.isDirectory()) {

				//if (listOfFiles.length > 1) {
					//lblSearchTerms.setText("No matching files found.");
				//}else {
					
				//}
			//}
			//To search any search terms.
			} else if (jRadioButton2.isSelected()) {
			
        } else if (jRadioButton3.isSelected()) {
        	
        }
	    
		JLabel lblNumberIndex = new JLabel("Number of files indexed:  0");
		lblNumberIndex.setBounds(245, 0, 200,60);
		lblNumberIndex.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumberIndex.setFont(new Font("SansSerif", Font.PLAIN, 15));
		panel5.add(lblNumberIndex);
		
		JButton btnmaintenance = new JButton("Maintenance");
		btnmaintenance.setBounds(20, 20, 119, 20);
		btnmaintenance.setFont(new Font("SansSerif", Font.PLAIN, 15));
		panel5.add(btnmaintenance);
		frmSearchEngine.getContentPane().add(panel5);
		
		btnmaintenance.addActionListener(new ActionListener() { 
		public void actionPerformed (ActionEvent e){
		//frame1.setVisible(true);
		}
		});
		
		JButton btnabout = new JButton("About");
		btnabout.setBounds(530, 20, 90, 20);
		panel5.add(btnabout);
		btnabout.setFont(new Font("SansSerif", Font.PLAIN, 15));
		frmSearchEngine.getContentPane().add(panel5);

		
}
}