import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.DropMode;

public class HolaMundoEnGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HolaMundoEnGUI window = new HolaMundoEnGUI();
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
	public HolaMundoEnGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextPane txtpnBienvenidoAProes = new JTextPane();
		txtpnBienvenidoAProes.setDropMode(DropMode.INSERT);
		txtpnBienvenidoAProes.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnBienvenidoAProes.setText("                                  Bienvenido a PROES\r\n\r\nEste es un espacio para que los profesores puedan venderse y los estudiantes puedan encontrar al profesor que buscan");
		txtpnBienvenidoAProes.setBounds(21, 76, 391, 89);
		txtpnBienvenidoAProes.setOpaque(false);
		txtpnBienvenidoAProes.setEditable(false);
		panel.add(txtpnBienvenidoAProes);
	}
}
