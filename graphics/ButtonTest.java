package graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonTest extends JFrame implements ActionListener {//extends JFrame so we dont need to make a new JFrame object
        JButton blue;//creates all of the JButtons we need
        JButton red;
        JButton green;
        JPanel panel;
        ImageIcon blueTest = new ImageIcon("C:/temp_YaHeng/blueButton.jpg");//imports the images and makes an icon out of them
        ImageIcon redTest = new ImageIcon("C:/temp_YaHeng/redButton.jpg");
        ImageIcon greenTest = new ImageIcon("C:/temp_YaHeng/greenButton.jpg");
        Image imgBlue = blueTest.getImage();
        Image blueResized = imgBlue.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);//	cleaning up and preparing images for icon, resizing
        ImageIcon blueResizedIcon = new ImageIcon (blueResized);
        Image imgRed = redTest.getImage();
        Image RedResized = imgRed.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        ImageIcon redResizedIcon = new ImageIcon(RedResized);
        Image imgGreen = greenTest.getImage();
        Image GreenResized = imgGreen.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        ImageIcon greenResizedIcon = new ImageIcon(GreenResized);
        
        public ButtonTest(String title) {
        		
        		
            	
                super(title);//constructor 
                setLayout(new BorderLayout());//makes a borderlayout, allows us to place the panel for changing background in the center
                blue = new JButton("Blue",blueResizedIcon);//makes buttons with an icon
                add(blue,BorderLayout.NORTH);//adds buttons to the BorderLayout in specific positions
                red = new JButton("Red",redResizedIcon);
                add(red,BorderLayout.EAST);
                green = new JButton("Green",greenResizedIcon);
                add(green,BorderLayout.WEST);
                blue.addActionListener(this);//new actionlisteners to listen for mouse click
                red.addActionListener(this);
                green.addActionListener(this);
                panel = new JPanel();//new panel which will change color
                panel.setBackground(Color.WHITE);
                add(panel,BorderLayout.CENTER);//places panel in the center
                panel.setVisible(true);//makes the panel visible
        }
        


        public void actionPerformed(ActionEvent e) {//runs when action is performed
                if(e.getSource()==blue)//if the blue button is clicked
                {
                	
                	System.out.println("Blue pressed");//print out button was pressed
                	panel.setBackground(Color.BLUE);//change the background color of the panel to blue
                }
                else if(e.getSource()==red)//if red button is pressed
                {
                	System.out.println("Red pressed");
                	panel.setBackground(Color.RED);//change the background color of the panel to red
                }
                else if(e.getSource()==green)//if green button is pressed
                {
                	System.out.println("Green pressed");
                	panel.setBackground(Color.GREEN);//change the background color of the panel to green
                }
        }

}
