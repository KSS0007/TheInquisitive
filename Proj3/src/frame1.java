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
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;

public class frame1 {

	private JFrame frmSearchEngineMaintenance;
	private JPanel panel_2;
	private JPanel panel;
	private JLabel lblSearchEngine;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JPanel panel_3;
	private JLabel lblSearchEngineVersion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 window = new frame1();
					window.frmSearchEngineMaintenance.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSearchEngineMaintenance = new JFrame();
		frmSearchEngineMaintenance.setType(Type.POPUP);
		frmSearchEngineMaintenance.setTitle("Search Engine Maintenance");
		frmSearchEngineMaintenance.getContentPane().setBackground(Color.WHITE);
		frmSearchEngineMaintenance.setBounds(100, 100, 667, 541);
		frmSearchEngineMaintenance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSearchEngineMaintenance.getContentPane().setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBounds(317, 64, 332, 39);
		frmSearchEngineMaintenance.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(0, 0, 331, 39);
		panel_2.add(lblStatus);
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		panel = new JPanel();
		panel.setBounds(0, 64, 318, 39);
		frmSearchEngineMaintenance.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblFileName = new JLabel("File Name");
		lblFileName.setBounds(0, 0, 318, 39);
		panel.add(lblFileName);
		lblFileName.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblFileName.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaptionBorder);
		panel_1.setBounds(0, 0, 649, 64);
		frmSearchEngineMaintenance.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblSearchEngine = new JLabel("Search Engine - Index Maintence");
		lblSearchEngine.setBounds(0, 0, 649, 64);
		panel_1.add(lblSearchEngine);
		lblSearchEngine.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblSearchEngine.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.scrollbar);
		panel_3.setBounds(0, 413, 649, 81);
		frmSearchEngineMaintenance.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		lblSearchEngineVersion = new JLabel("Search Engine Version 1.0");
		lblSearchEngineVersion.setBounds(503, 65, 146, 16);
		panel_3.add(lblSearchEngineVersion);
		lblSearchEngineVersion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSearchEngineVersion.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 413, 649, 81);
		frmSearchEngineMaintenance.getContentPane().add(lblNewLabel);
	}
}
