package cesusc.edu.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;

import cesusc.edu.controller.MerchandiseController;

public class View extends JFrame {
	private static final long serialVersionUID = 1L;
	
	MerchandiseView merchandiseView = new MerchandiseView();
	ChartersView chartersView = new ChartersView();
	ListMerchandiseView listMerchandiseView = new ListMerchandiseView();
	MerchandiseController merchandiseController = new MerchandiseController();
	ListChartersView listChartersView = new ListChartersView();
	Dashboard dashboard = new Dashboard(getTitle());
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					// RESOLUÇÃO DE TELA
					frame.setSize(800,600);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public View() {
		super("Menu Principal");
		getContentPane().setEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
		
		JDesktopPane desktopPane = new JDesktopPane();
		
		JButton btnCadastrarMercadorias = new JButton("Cadastrar Mercadorias");
		btnCadastrarMercadorias.setForeground(Color.DARK_GRAY);
		btnCadastrarMercadorias.setFont(new Font("Apple Chancery", Font.PLAIN, 24));
		btnCadastrarMercadorias.setBackground(Color.DARK_GRAY);
		
		btnCadastrarMercadorias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				merchandiseView.setVisible(true);
				merchandiseView.setSize(800, 600);
			}
		});
		
		JButton btnListarMercadorias = new JButton("Listar Mercadorias");
		btnListarMercadorias.setForeground(Color.DARK_GRAY);
		btnListarMercadorias.setFont(new Font("Apple Chancery", Font.PLAIN, 24));
		btnListarMercadorias.setBackground(Color.GREEN);
		
		btnListarMercadorias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listMerchandiseView.setVisible(true);
				listMerchandiseView.setSize(800, 600);
			}
		});
		
		JButton btnCadastrarFretamento = new JButton("Cadastrar Fretamento");
		btnCadastrarFretamento.setBackground(Color.RED);
		btnCadastrarFretamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chartersView.setVisible(true);
				chartersView.setSize(800, 600);
				merchandiseController.queryMerchandise();
			}
		});
		btnCadastrarFretamento.setForeground(Color.DARK_GRAY);
		btnCadastrarFretamento.setFont(new Font("Apple Chancery", Font.PLAIN, 24));
		btnCadastrarFretamento.setBackground(Color.DARK_GRAY);
		
		JButton btnListarFretamentos = new JButton("Listar Fretamentos");
		btnListarFretamentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listChartersView.setVisible(true);
				listChartersView.setSize(800, 600);
			}
		});
		btnListarFretamentos.setForeground(Color.DARK_GRAY);
		btnListarFretamentos.setFont(new Font("Apple Chancery", Font.PLAIN, 24));
		btnListarFretamentos.setBackground(Color.GREEN);
		
		JButton btnGraficos = new JButton("Graficos");
		btnGraficos.setForeground(Color.DARK_GRAY);
		btnGraficos.setFont(new Font("Apple Chancery", Font.PLAIN, 24));
		btnGraficos.setBackground(Color.GREEN);
		
		
		btnGraficos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dashboard.setVisible(true);
				dashboard.setSize(800, 600);
			}
		});
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnListarMercadorias, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
						.addComponent(btnCadastrarMercadorias, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnListarFretamentos, GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
						.addComponent(btnCadastrarFretamento, GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnGraficos, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
					.addGap(0))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnCadastrarFretamento, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnListarFretamentos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(btnCadastrarMercadorias, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(24)
							.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnSair, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
								.addComponent(btnListarMercadorias, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
								.addComponent(btnGraficos, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
	}
}
