package cesusc.edu.n3;

import javax.swing.JDialog;

import cesusc.edu.view.View;

public class App {
	public static void main(String[] args) {
		try {
			View view = new View();
			view.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			view.setSize(800,600);
			view.setVisible(true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
