import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;



class CLPanel extends JPanel{
	
	public CLPanel() {
		this.setLayout(new GridLayout(0,4));
		
	}
	
}

class CLButton extends JButton{
	
	public CLButton(){
		this.setBackground(Color.WHITE);
		
	}
	

	
}



public class CalcGUI {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setBackground(Color.black);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(350,400);
		f.setLayout(new GridLayout(0,1));
		
		Font font = new Font("Verdana", Font.BOLD, 15);
		
		JPanel showPanel = new JPanel();
		CLPanel cl = new CLPanel();
		
		JTextArea ta = new JTextArea(5,20);
		ta.setFont(font);
		
		CLButton cb[][] = new CLButton[4][4];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++)
			cb[i][j] = new CLButton();
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				
				switch(i) {
				case 0:
					if(j<3)
						cb[i][j].setText(Integer.toString(j+7));
					else
						cb[i][j].setText("+");
					break;
				case 1:
					if(j<3)
						cb[i][j].setText(Integer.toString(j+4));
					else
						cb[i][j].setText("-");
					break;
				case 2:
					if(j<3)
						cb[i][j].setText(Integer.toString(j+1));
					else
						cb[i][j].setText("*");
					break;
				
			}
				
		}
		}
		cb[3][0].setText("C");
		cb[3][1].setText("0");
		cb[3][2].setText("=");
		cb[3][3].setText("/");
		
		for(int i=0; i<4;i++)
			for(int j=0;j<4;j++)
				cl.add(cb[i][j]);
		
		showPanel.setSize(300,100);
//		showPanel.setLocation(80,5);
		cl.setSize(300,400);
		
		
		
		showPanel.add(ta);
		
		f.add(showPanel);
		f.add(cl);		
		
		f.setVisible(true);
	}
	
}