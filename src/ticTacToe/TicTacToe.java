package ticTacToe;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
//import java.awt.GridLayout;

public class TicTacToe extends JFrame{
	public static int X = 0;
	public static int O = 0;
	public static int x = 1;
	public static boolean c1,c2,c3,c4,c5,c6,c7,c8,c9,a1,a2,a3,a4,a5,a6,a7,a8,a9;
	public static int a,b,c,d,E,f,g,h,i;

	private static final long serialVersionUID = 1L;


	JPanel tictactoe = new JPanel();
	
	public TicTacToe(){
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setSize(400,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton b1 = new JButton("1");
		b1.setBounds(4, 5, 117, 91);
		getContentPane().setLayout(null);
		getContentPane().add(b1);
		b1.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  if (x%2 ==1){
					  JLabel lblX = new JLabel("X");
						lblX.setFont(new Font("Lucida Grande", Font.BOLD, 100));
						lblX.setForeground(Color.RED);
						lblX.setBounds(6, 79, 200, 200);
						b1.setText("X");
						b1.setForeground(Color.RED);
						x++;
						a1 = true;
						a++;
				  }else{
					  JLabel lblX = new JLabel("O");
						lblX.setFont(new Font("Lucida Grande", Font.BOLD, 100));
						lblX.setForeground(Color.RED);
						lblX.setBounds(6, 79, 200, 200);
						b1.setText("O"
								+ "");
						b1.setForeground(Color.RED);  
						x++;
						c1 = true;
						a++;
				  }
			    
			  } 
			  
			  
			} );
		
		JButton b2 = new JButton("2");
		b2.setBounds(138, 5, 117, 91);
		getContentPane().add(b2);
		b2.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  if (x%2 ==1){
					  JLabel lblX = new JLabel("X");
						lblX.setFont(new Font("Lucida Grande", Font.BOLD, 100));
						lblX.setForeground(Color.RED);
						lblX.setBounds(6, 79, 200, 200);
						b2.setText("X");
						b2.setForeground(Color.RED);
						x++;
						a2 = true;
						b++;
						
				  }else{
					  JLabel lblX = new JLabel("O");
						lblX.setFont(new Font("Lucida Grande", Font.BOLD, 100));
						lblX.setForeground(Color.RED);
						lblX.setBounds(6, 79, 200, 200);
						b2.setText("O");
						b2.setForeground(Color.RED);  
						x++;
						c2 = true;
						b++;
				  }
			    
			  } 
			} );
		
		JButton b3 = new JButton("3");
		b3.setBounds(277, 5, 117, 91);
		getContentPane().add(b3);
		b3.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  if (x%2 ==1){
					  JLabel lblX = new JLabel("X");
						lblX.setFont(new Font("Lucida Grande", Font.BOLD, 100));
						lblX.setForeground(Color.RED);
						lblX.setBounds(6, 79, 200, 200);
						b3.setText("X");
						b3.setForeground(Color.RED);
						x++;
						a3 = true;
						c++;
				  }else{
					  JLabel lblX = new JLabel("O");
						lblX.setFont(new Font("Lucida Grande", Font.BOLD, 100));
						lblX.setForeground(Color.RED);
						lblX.setBounds(6, 79, 200, 200);
						b3.setText("O");
						b3.setForeground(Color.RED);  
						x++;
						c3 =true;
						c++;
				  }
			  } 
			} );
		
		JButton b4 = new JButton("4");
		b4.setBounds(4, 108, 117, 83);
		getContentPane().add(b4);
		b4.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  if (x%2 ==1){
					  JLabel lblX = new JLabel("X");
						lblX.setFont(new Font("Lucida Grande", Font.BOLD, 100));
						lblX.setForeground(Color.RED);
						lblX.setBounds(6, 79, 200, 200);
						b4.setText("X");
						b4.setForeground(Color.RED);
						x++;
						a4 = true;
						E++;
				  }else{
					  JLabel lblX = new JLabel("O");
						lblX.setFont(new Font("Lucida Grande", Font.BOLD, 100));
						lblX.setForeground(Color.RED);
						lblX.setBounds(6, 79, 200, 200);
						b4.setText("O");
						b4.setForeground(Color.RED);  
						x++;
						c4 = true;
						E++;
				  }
			  } 
			} );
		
		JButton b5 = new JButton("5");
		b5.setBounds(138, 108, 117, 83);
		getContentPane().add(b5);
		b5.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  f++;
				  if (x%2 ==1){
					  JLabel lblX = new JLabel("X");
						lblX.setFont(new Font("Lucida Grande", Font.BOLD, 100));
						lblX.setForeground(Color.RED);
						lblX.setBounds(6, 79, 200, 200);
						b5.setText("X");
						b5.setForeground(Color.RED);
						x++;
						a5 = true;
						f++;
				  }else{
					  JLabel lblX = new JLabel("O");
						lblX.setFont(new Font("Lucida Grande", Font.BOLD, 100));
						lblX.setForeground(Color.RED);
						lblX.setBounds(6, 79, 200, 200);
						b5.setText("O");
						b5.setForeground(Color.RED);  
						x++;
						c5 = true;
						f++;
				  }
			  } 
			} );
	
		JButton b6 = new JButton("6");
		b6.setBounds(277, 108, 117, 83);
		getContentPane().add(b6);
		b6.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  if (x%2 ==1){
					  JLabel lblX = new JLabel("X");
						lblX.setFont(new Font("Lucida Grande", Font.BOLD, 100));
						lblX.setForeground(Color.RED);
						lblX.setBounds(6, 79, 200, 200);
						b6.setText("X");
						b6.setForeground(Color.RED);
						x++;
						a6 = true;
						i++;
				  }else{
					  JLabel lblX = new JLabel("O");
			
					  lblX.setFont(new Font("Lucida Grande", Font.BOLD, 100));
						lblX.setForeground(Color.RED);
						lblX.setBounds(6, 79, 200, 200);
						b6.setText("O");
						b6.setForeground(Color.RED);  
						x++;
						c6 = true;
						i++;
				  }
			  } 
			} );
		
		JButton b7 = new JButton("7");
		b7.setBounds(4, 207, 117, 83);
		getContentPane().add(b7);
		b7.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  if (x%2 ==1){
					  JLabel lblX = new JLabel("X");
						lblX.setFont(new Font("Lucida Grande", Font.BOLD, 100));
						lblX.setForeground(Color.RED);
						lblX.setBounds(6, 79, 200, 200);
						b7.setText("X");
						b7.setForeground(Color.RED);
						x++;
						a7 = true;
						d++;
				  }else{
					  JLabel lblX = new JLabel("O");
						lblX.setFont(new Font("Lucida Grande", Font.BOLD, 100));
						lblX.setForeground(Color.RED);
						lblX.setBounds(6, 79, 200, 200);
						b7.setText("O");
						b7.setForeground(Color.RED);  
						x++;
						c7 = true;
						d++;
				  }
			  } 
			} );
		
		JButton b8 = new JButton("8");
		b8.setBounds(138, 207, 117, 83);
		getContentPane().add(b8);
		b8.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  if (x%2 ==1){
					  JLabel lblX = new JLabel("X");
						lblX.setFont(new Font("Lucida Grande", Font.BOLD, 100));
						lblX.setForeground(Color.RED);
						lblX.setBounds(6, 79, 200, 200);
						b8.setText("X");
						b8.setForeground(Color.RED);
						x++;
						a8 = true;
						h++;
				  }else{
					  JLabel lblX = new JLabel("O");
						lblX.setFont(new Font("Lucida Grande", Font.BOLD, 100));
						lblX.setForeground(Color.RED);
						lblX.setBounds(6, 79, 200, 200);
						b8.setText("O");
						b8.setForeground(Color.RED);  
						x++;
						c8 = true;
						h++;
				  }
			  } 
			} );
	
		
		JButton b9 = new JButton("9");
		b9.setBounds(277, 207, 117, 83);
		getContentPane().add(b9);
		b9.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  if (x%2 ==1){
					  JLabel lblX = new JLabel("X");
						lblX.setFont(new Font("Lucida Grande", Font.BOLD, 100));
						lblX.setForeground(Color.RED);
						lblX.setBounds(6, 79, 200, 200);
						b9.setText("X");
						b9.setForeground(Color.RED);
						x++;
						a9 = true;
						g++;
				  }else{
					  JLabel lblX = new JLabel("O");
						lblX.setFont(new Font("Lucida Grande", Font.BOLD, 100));
						lblX.setForeground(Color.RED);
						lblX.setBounds(6, 79, 200, 200);
						b9.setText("O");
						b9.setForeground(Color.RED);  
						x++;
						c9 = true;
						g++;
				  }
			  } 
			} );
		
/*
 * 		a1/c1	a2/c2	a3/c3
 * 
 * 		a4/c4	a5/c5	a6/c6
 * 
 * 		a7/c7	a8/c8	a9/c9
 * 
 */
		if ((a1&&a2&&a3) || (a4&&a5&&a6) || (a7&&a8&&a9) || (a1&&a4&&a7) || (a2&&a5&&a8) || (a3&&a6&&a9) || (a1&&a5&&a9)){
			X++;
		}
		
		JButton xWin = new JButton("");
		xWin.setBounds(4, 324, 184, 40);
		getContentPane().add(xWin);
		xWin.setText("X Win : " + X);
		
		JButton oWin = new JButton("O Win: " +O);
		oWin.setBounds(210, 324, 184, 40);
		getContentPane().add(oWin);
		oWin.setText("O Win : " + O);
		
		
		JButton Clear = new JButton("CLEAR"); // Clearing the board
		Clear.setBounds(138, 294, 117, 29);
		getContentPane().add(Clear);

		Clear.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  b1.setText("");
				  b2.setText("");
				  b3.setText("");
				  b4.setText("");
				  b5.setText("");
				  b6.setText("");
				  b7.setText("");
				  b8.setText("");
				  b9.setText("");
			  } 
			} );
		
		
		setVisible(true);
		
		
	}
	public static void main(String args[]){
		new TicTacToe();
	}
}