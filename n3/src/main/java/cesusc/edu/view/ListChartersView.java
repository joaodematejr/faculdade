package cesusc.edu.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import cesusc.edu.controller.ChartersController;
import cesusc.edu.models.Charters;

public class ListChartersView extends JDialog {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JPanel painelFundo;
	JTable tabela;
	JScrollPane barraRolagem;
	
	ChartersController chartersController = new ChartersController();
	List<Charters> rows;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListChartersView frame = new ListChartersView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListChartersView() {
		
		rows = chartersController.queryCharters();
		String[] colunas = { "Mercadoria", "Descrição" };
		Object[][] listCharters =  new Object[chartersController.queryCharters().size()][2];
		
		int i=0;
		
		for (Charters charters : chartersController.queryCharters()) {	
			listCharters[i][0] = charters.getMerchandise();
			listCharters[i][1] = charters.getDescription();
			i++;
		}
			
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		painelFundo = new JPanel();
		painelFundo.setLayout(new GridLayout(1, 1));
		tabela = new JTable(listCharters, colunas);
		barraRolagem = new JScrollPane(tabela);
		painelFundo.add(barraRolagem);
		getContentPane().add(painelFundo);

	}

}
