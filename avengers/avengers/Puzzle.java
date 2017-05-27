package avengers;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Puzzle extends JFrame implements MouseListener{

	private JPanel contentPane;
	private JButton btnNewButton_2 = new JButton("New button");
	private JButton btnNewButton_3 = new JButton("New button");
	private JButton btnNewButton_1 = new JButton("New button");
	private JPanel panel = new JPanel();
	private JButton tmp = new JButton();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Puzzle frame = new Puzzle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Puzzle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 652);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		
		
		btnNewButton_2.setIcon(new ImageIcon(Puzzle.class.getResource("/avengers/common.jpg")));
		panel.add(btnNewButton_2);
		
		
		btnNewButton_3.setIcon(new ImageIcon(Puzzle.class.getResource("/avengers/fillblank.png")));
		panel.add(btnNewButton_3);
		
		
		btnNewButton_1.setIcon(new ImageIcon(Puzzle.class.getResource("/avengers/fillblank1.png.jpg")));
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.equals(btnNewButton_1))
			tmp = btnNewButton_2;
			btnNewButton_2 = btnNewButton_1;
			btnNewButton_1=tmp;
			panel.add(btnNewButton_1);
			panel.add(btnNewButton_2);
			
		
	}

	@Override
	public void mousePressed(MouseEvent e) {

		
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		
	}

	@Override
	public void mouseEntered(MouseEvent e) {

		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}

	
		
}

	


