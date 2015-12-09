import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class Game extends Main{

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
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
	public Game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 404, 344);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 button1 = new JButton();
         button2 = new JButton();
         button3 = new JButton();
         button4 = new JButton();
         button5 = new JButton();
         button6 = new JButton();
         button7 = new JButton();
         button8 = new JButton();
         button9 = new JButton();
		
		JButton button1 = new JButton("");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button1.setBounds(10, 11, 114, 86);
		frame.getContentPane().add(button1);
		
		JButton button4 = new JButton("");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button4.setBounds(10, 108, 114, 86);
		frame.getContentPane().add(button4);
		
		JButton button7 = new JButton("");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button7.setBounds(10, 205, 114, 86);
		frame.getContentPane().add(button7);
		
		JButton button2 = new JButton("");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button2.setBounds(134, 11, 114, 86);
		frame.getContentPane().add(button2);
		
		JButton button5 = new JButton("");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button5.setBounds(134, 108, 114, 86);
		frame.getContentPane().add(button5);
		
		JButton button8 = new JButton("");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button8.setBounds(134, 205, 114, 86);
		frame.getContentPane().add(button8);
		
		JButton button3 = new JButton("");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button3.setBounds(258, 11, 114, 86);
		frame.getContentPane().add(button3);
		
		JButton button6 = new JButton("");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button6.setBounds(258, 108, 114, 86);
		frame.getContentPane().add(button6);
		
		JButton button9 = new JButton("");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button9.setBounds(258, 205, 114, 86);
		frame.getContentPane().add(button9);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
