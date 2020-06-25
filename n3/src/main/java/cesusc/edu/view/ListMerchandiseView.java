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

import cesusc.edu.controller.MerchandiseController;
import cesusc.edu.models.Merchandise;

public class ListMerchandiseView extends JDialog {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JPanel painelFundo;
	JTable tabela;
	JScrollPane barraRolagem;
	
	MerchandiseController merchandiseController = new MerchandiseController();
	List<Merchandise> rows;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListMerchandiseView frame = new ListMerchandiseView();
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
	public ListMerchandiseView() {
		
		rows = merchandiseController.queryMerchandise();
		String[] colunas = { "Nome", "Descrição" };
		Object[][] listadeclientes =  new Object[merchandiseController.queryMerchandise().size()][2];
		
		int i=0;
		
		for (Merchandise merchandise : merchandiseController.queryMerchandise()) {	
			listadeclientes[i][0] = merchandise.getName();
			listadeclientes[i][1] = merchandise.getDescription();
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
		tabela = new JTable(listadeclientes, colunas);
		barraRolagem = new JScrollPane(tabela);
		painelFundo.add(barraRolagem);
		getContentPane().add(painelFundo);

	}

}
