package avengers;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;


public class Menu extends JPanel {
	
	public boolean started = false;

	
	public Menu(){
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		add(Box.createVerticalStrut(280));
		
		Custombutton button = new Custombutton("START");
		
		
		button.setAlignmentX(CENTER_ALIGNMENT);
		button.addActionListener(new AbstractAction(){
				public void actionPerformed(ActionEvent e){
					start();
				}
				
		});
		
		
		add(button);
		
		add(Box.createVerticalGlue());
		
		
	}
	
	public void start() {
		started = true;
	}
	
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(!started)
			g.drawImage(new ImageIcon(Menu.class.getResource("background2.jpg")).getImage(), 0,0,640,480,this);
		else
			setBackground(Color.BLUE);
	}
	
	
	
}
