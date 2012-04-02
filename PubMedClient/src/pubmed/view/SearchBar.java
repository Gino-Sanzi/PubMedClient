package pubmed.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SearchBar extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField author, title;
	private JLabel authorLabel, titleLabel;
	private JButton submit;
	
	public SearchBar() {
		super();
		
		authorLabel = new JLabel("Author:");
		author = new JTextField();
		titleLabel = new JLabel("Title:");
		title = new JTextField();
		submit = new JButton("Submit");
		
		author.setColumns(40);
		title.setColumns(40);
		
		
		this.add(authorLabel);
		this.add(author);
		this.add(titleLabel);
		this.add(title);
		this.add(submit);
		
	}
	
	public String getAuthorText() {
		return author.getText();
	}
	
	public String getTitleText() {
		return title.getText();
	}

}
