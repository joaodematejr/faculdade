package n2.sc.cesusc.edu.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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
	
	AddMercadoria addMercadoria = new AddMercadoria();
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					// RESOLUÇÃO DE TELA
					frame.setSize(1680, 720);
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
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Apple Chancery", Font.PLAIN, 24));
		btnNewButton.setIcon(new ImageIcon("resources/add_circle-black-18dp/2x/baseline_add_circle_black_18dp.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addMercadoria.setVisible(true);
				addMercadoria.setSize(800, 600);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Listar Tipos de Mercadorias");
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Apple Chancery", Font.PLAIN, 24));
		btnNewButton_1.setIcon(new ImageIcon("resources/list-black-18dp/2x/baseline_list_black_18dp.png"));
		
		JButton btnAdicionarFretamento = new JButton("Adicionar Fretamento");
		btnAdicionarFretamento.setForeground(Color.DARK_GRAY);
		btnAdicionarFretamento.setFont(new Font("Apple Chancery", Font.PLAIN, 24));
		btnAdicionarFretamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdicionarFretamento.setIcon(new ImageIcon("resources/add_shopping_cart-black-18dp/2x/baseline_add_shopping_cart_black_18dp.png"));
		
		JButton btnListarFretamentos = new JButton("Listar Fretamentos");
		btnListarFretamentos.setForeground(Color.DARK_GRAY);
		btnListarFretamentos.setFont(new Font("Apple Chancery", Font.PLAIN, 24));
		btnListarFretamentos.setBackground(Color.BLUE);
		btnListarFretamentos.setIcon(new ImageIcon("resources/assignment-black-18dp/2x/baseline_assignment_black_18dp.png"));
		
		JButton btnRegistrarInspeoDe = new JButton("Registrar Inspeção de Mercadoria de um fretamento");
		btnRegistrarInspeoDe.setForeground(Color.DARK_GRAY);
		btnRegistrarInspeoDe.setFont(new Font("Apple Chancery", Font.PLAIN, 24));
		btnRegistrarInspeoDe.setIcon(new ImageIcon("resources/departure_board-black-18dp/2x/baseline_departure_board_black_18dp.png"));
		btnRegistrarInspeoDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Apple Chancery", Font.PLAIN, 24));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBackground(Color.GREEN);
		btnSair.setForeground(Color.DARK_GRAY);
		btnSair.setIcon(new ImageIcon("resources/exit_to_app-black-18dp/2x/baseline_exit_to_app_black_18dp.png"));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnSair, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 275, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 232, Short.MAX_VALUE))
						.addComponent(btnListarFretamentos, GroupLayout.PREFERRED_SIZE, 513, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRegistrarInspeoDe, GroupLayout.PREFERRED_SIZE, 277, Short.MAX_VALUE)
						.addComponent(btnAdicionarFretamento, GroupLayout.PREFERRED_SIZE, 266, Short.MAX_VALUE))
					.addGap(9))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnAdicionarFretamento, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
							.addGap(7))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
								.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRegistrarInspeoDe, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
						.addComponent(btnListarFretamentos, GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 48, Short.MAX_VALUE)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
	}
}
