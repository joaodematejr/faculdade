package n2.sc.cesusc.edu.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;

public class View extends JFrame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					// RESOLUÇÃO DE TELA
					frame.setSize(1280, 300);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public View() {
		getContentPane().setEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Adicionar Tipo de Mercadoria");
		btnNewButton.setIcon(new ImageIcon("/Users/joaodematejr/eclipse-workspace/n2/src/icons/add_circle-black-18dp/2x/baseline_add_circle_black_18dp.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_1 = new JButton("Listar Tipos de Mercadorias");
		btnNewButton_1.setIcon(new ImageIcon("/Users/joaodematejr/eclipse-workspace/n2/src/icons/list-black-18dp/2x/baseline_list_black_18dp.png"));
		
		JButton btnAdicionarFretamento = new JButton("Adicionar Fretamento");
		btnAdicionarFretamento.setIcon(new ImageIcon("/Users/joaodematejr/eclipse-workspace/n2/src/icons/add_shopping_cart-black-18dp/2x/baseline_add_shopping_cart_black_18dp.png"));
		
		JButton btnListarFretamentos = new JButton("Listar Fretamentos");
		btnListarFretamentos.setIcon(new ImageIcon("/Users/joaodematejr/eclipse-workspace/n2/src/icons/assignment-black-18dp/2x/baseline_assignment_black_18dp.png"));
		
		JButton btnRegistrarInspeoDe = new JButton("Registrar Inspeção de Mercadoria de um fretamento");
		btnRegistrarInspeoDe.setIcon(new ImageIcon("/Users/joaodematejr/eclipse-workspace/n2/src/icons/departure_board-black-18dp/2x/baseline_departure_board_black_18dp.png"));
		btnRegistrarInspeoDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 207, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnAdicionarFretamento, GroupLayout.PREFERRED_SIZE, 157, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnListarFretamentos, GroupLayout.PREFERRED_SIZE, 114, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnRegistrarInspeoDe, GroupLayout.PREFERRED_SIZE, 155, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAdicionarFretamento, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
						.addComponent(btnRegistrarInspeoDe, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
						.addComponent(btnListarFretamentos, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
					.addGap(4))
		);
		getContentPane().setLayout(groupLayout);
	}
}
