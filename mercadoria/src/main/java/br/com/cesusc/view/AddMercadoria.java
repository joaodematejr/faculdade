package br.com.cesusc.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import n2.sc.cesusc.edu.entidade.Mercadoria;
import n2.sc.cesusc.edu.mb.MercadoriaMB;

public class AddMercadoria extends JFrame {

	Mercadoria mercadoria = new Mercadoria();
	MercadoriaMB mercadoriaMB = new MercadoriaMB();
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMercadoria frame = new AddMercadoria();
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
	public AddMercadoria() {
		getContentPane().setLayout(null);
	
		JLabel lblAdicionarTipoDe = new JLabel("Adicionar Tipo de Mercadoria");
		lblAdicionarTipoDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdicionarTipoDe.setFont(new Font("Apple Chancery", Font.PLAIN, 32));
		lblAdicionarTipoDe.setForeground(Color.DARK_GRAY);
		lblAdicionarTipoDe.setBounds(6, 6, 880, 51);
		getContentPane().add(lblAdicionarTipoDe);
		
		JLabel lblNewLabel = new JLabel("Mercadoria");
		lblNewLabel.setFont(new Font("Apple Chancery", Font.PLAIN, 16));
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBounds(6, 69, 880, 16);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(6, 97, 786, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setForeground(Color.DARK_GRAY);
		lblDescrio.setFont(new Font("Apple Chancery", Font.PLAIN, 16));
		lblDescrio.setBounds(6, 135, 880, 16);
		getContentPane().add(lblDescrio);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 164, 786, 97);
		getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Apple Chancery", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textField.getText();
				String descricao = textArea.getText();
				if (nome.isEmpty() && descricao.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Não seja um usuário burro preencha todos os campos, animal.","Aviso !!!",JOptionPane.PLAIN_MESSAGE);
				}else {
					try {
						mercadoriaMB.salvarMercadoria(nome, descricao);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null,"Ocorreu um erro por favor entre em contato com desenvolvedor","Aviso !!!",JOptionPane.PLAIN_MESSAGE);
						e1.printStackTrace();
					}
				}	
			}
		});
		btnNewButton.setBounds(6, 273, 213, 66);
		getContentPane().add(btnNewButton);
		
	}
}