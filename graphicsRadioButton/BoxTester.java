package graphicsRadioButton;

import java.awt.Container;

import javax.swing.BoxLayout;

public class BoxTester {
	
	public static void main(String args[])
	{
		Container panel = new Container();//new container 
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));//new panel needed for methods
		BoxTest tester = new BoxTest("test");//new BoxTester object
		tester.addComponent(panel);//runs method with panel variable
		tester.addButton(panel);//runs method with panel variable 
		tester.makeVisible();//runs method and makes tester visible
	}
	

}
