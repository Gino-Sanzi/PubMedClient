package pubmed.main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import pubmed.controller.SearchController;

public class Main {

	public Main() {
		new SearchController();
	}
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(-1);
		} catch (InstantiationException e) {
			e.printStackTrace();
			System.exit(-1);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			System.exit(-1);
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		
		new Main();
	}

}
