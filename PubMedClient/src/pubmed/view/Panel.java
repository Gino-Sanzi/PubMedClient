package pubmed.view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public Panel() {
		super();
		
		this.setLayout(new BorderLayout());
		
		this.add(BorderLayout.NORTH, new SearchBar());
	}
}
