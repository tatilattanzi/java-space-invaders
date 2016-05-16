import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * @author
 */
public class PushPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8387668405974705371L;
	
	private JButton push;

	/*
	 * Constructor
	 */
	public PushPanel() {
		push = new JButton("start");
		push.addActionListener(new ButtonListener());
		push.setBounds(800, 800, 200, 100);

		add(push);

	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			new SpaceInvaders();

		}
	}
}
