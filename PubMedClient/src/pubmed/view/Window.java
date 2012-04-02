package pubmed.view;

import javax.swing.JFrame;

public class Window extends JFrame {
	
	private Panel panel;
	
	private static final long serialVersionUID = 1L;

	public Window() {
		super();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(640, 480);
		this.setResizable(true);
		this.setLocationByPlatform(true);
		this.setTitle("PubMed Retrieval Client");
		
		panel = new Panel();
		
		this.add(panel);
		this.pack();
		
		this.setVisible(true);
	}
}
