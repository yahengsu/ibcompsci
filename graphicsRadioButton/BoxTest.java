	package graphicsRadioButton;
	
	import java.awt.Color;
	import java.awt.Container;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	
	import javax.swing.BoxLayout;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JRadioButton;
	
	public class BoxTest implements ActionListener {//implements ActionListener so we can have the actionPerformed method in this class
		
		JRadioButton blueRadio;//radioButtons that will be used throughout the class
		JRadioButton redRadio;
		JRadioButton greenRadio;
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		
		public BoxTest(String name)//constructor
		{
			super();
		}
		
		
		public void addComponent(Container panel)//method that sets the container layout and adds the buttons to the container aka panel
		{
			panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
			addButton(panel);
			
			
		}
		public void addButton(Container container)//adds the buttons to the container 
		{
			blueRadio  = new JRadioButton("Blue");//creates the new RadioButtons
			redRadio = new JRadioButton("Red");
			greenRadio = new JRadioButton("Green");
			blueRadio.addActionListener(this);//adds ActionListeners to all of the buttons
			redRadio.addActionListener(this);
			greenRadio.addActionListener(this);
			
			
			container.add(blueRadio);//adds the buttons to the container aka panel
			container.add(greenRadio);
			container.add(redRadio);
		}
		
		public void makeVisible()//method that makes everything visible
		{
			JFrame frame = new JFrame("Test");//new JFrame
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//default operation on close
			addComponent(frame.getContentPane());//adds the panel with the buttons to the frame
			frame.add(panel);//adds the panel with the color-changeable background to the frame
			frame.setSize(600, 600);//sets the size of the frame
			frame.setVisible(true);//makes frame visible
			
		}
		
		public void actionPerformed(ActionEvent e) {
			 if(e.getSource()==blueRadio)//if blueRadio is clicked
	        {
				 if(blueRadio.isSelected())//if blueRadio is selected/enabled (should happen when clicked)
				 {
					 redRadio.setSelected(false);//disable the other buttons
					 greenRadio.setSelected(false);
					 System.out.println("Blue pressed");//prints out button was pressed
			         panel.setBackground(Color.BLUE);//turns the background color blue
				 }
				 else//if not enabled, dont do anything
				 {
					 
				 }
	        	
	        }
	        else if(e.getSource()==redRadio)//if redRadio is clicked
	        {
	       	 if(redRadio.isSelected())//if redRadio is selected/enabled (should happen when clicked)
	       	 {
	       		 blueRadio.setSelected(false);//disable the other buttons
	       		 greenRadio.setSelected(false);
	       		 System.out.println("Red pressed");//prints out button was pressed
	              	panel.setBackground(Color.RED);//turns the background color of the panel red
	       	 }
	       	 else//if not enabled, dont do anything
	       	 {
	       		
	       	 }
	        	
	        }
	        else if(e.getSource()==greenRadio)//if greenRadio is clicked
	        {
	       	if(greenRadio.isSelected())//if greenRadio is selected/enabled (should happen when clicked)
	       	{
	       		blueRadio.setSelected(false);//disable the other buttons
	       		redRadio.setSelected(false);
	       		System.out.println("Green pressed");//prints out button was pressed
	            	panel.setBackground(Color.GREEN);//turns the background color of the panel green
	       	}
	       	else//if not enabled, dont do anything
	       	{
	       		
	       	}
	        	
	        }
			
		}
		
	}
