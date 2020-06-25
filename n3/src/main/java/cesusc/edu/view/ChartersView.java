package cesusc.edu.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import cesusc.edu.controller.MerchandiseController;
import cesusc.edu.models.Merchandise;

public class ChartersView extends JDialog {
	private static final long serialVersionUID = 1L;
	private JPanel buttonPane;

	MerchandiseController merchandiseController = new MerchandiseController();

	List<Merchandise> rows;

	public static void main(String[] args) {
		try {
			ChartersView dialog = new ChartersView();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			dialog.setSize(800, 600);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ChartersView() {
	
		
		Vector<String> names = new Vector<String>();
		rows = merchandiseController.queryMerchandise();
		Iterator<Merchandise> it = rows.iterator();
		
		while (it.hasNext()) {
			Merchandise e = it.next();
			String getNames = e.getName();
			names.addElement(getNames);
		}

		final JComboBox<String> comboBox = new JComboBox<String>(names);
		
		final String value = comboBox.getSelectedItem().toString();
		

		
		setBounds(100, 100, 450, 300);
		{
			buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				
				okButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println(value);
					}
				});
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				cancelButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});

			}
		}
		
		
		JLabel lblNewLabel = new JLabel("Mercadoria");
		JEditorPane editorPane = new JEditorPane();
		JLabel lblDescrio = new JLabel("Descrição");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout
				.setHorizontalGroup(
						groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(buttonPane, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout
										.createSequentialGroup().addGap(14)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 420,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(16, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout
										.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup().addGap(6).addComponent(lblDescrio,
												GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE))
										.addGroup(Alignment.TRAILING,
												groupLayout.createSequentialGroup().addGap(6).addComponent(editorPane,
														GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
										.addComponent(comboBox, 0, 438, Short.MAX_VALUE)).addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(13).addComponent(lblNewLabel)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(4).addComponent(lblDescrio).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(editorPane, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addGap(34).addComponent(buttonPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)));
		getContentPane().setLayout(groupLayout);
	}
}
