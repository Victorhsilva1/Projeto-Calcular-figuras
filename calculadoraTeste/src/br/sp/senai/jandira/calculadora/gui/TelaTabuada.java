package br.sp.senai.jandira.calculadora.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaTabuada {

	public void criarTela() {
		
		
		JFrame tela = new JFrame();
		tela.setSize(500, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Tabuada");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		
		
		//criar um label para inserir no Jframe//
		// Multiplicando //
		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando:");
		lblMultiplicando.setBounds(20, 10, 100, 30);
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(130, 10, 50, 30);
		
		// Mínimo multiplicador //
		JLabel lblMinimoMultiplicador = new JLabel();
		lblMinimoMultiplicador.setText("Minimo Multiplicando:");
		lblMinimoMultiplicador.setBounds(20, 50, 130, 30);
		
		JTextField txtMinimoMultiplicador = new JTextField();
		txtMinimoMultiplicador.setBounds(160, 50, 50, 30);
		
		// Maximo multiplicador //
		JLabel lblMaximoMultiplicador = new JLabel();
		lblMaximoMultiplicador.setText("Minimo Multiplicando:");
		lblMaximoMultiplicador.setBounds(20, 50, 160, 30);
		
		JTextField txtMaximoMultiplicador = new JTextField();
		txtMaximoMultiplicador.setBounds(160, 80, 50, 30);
		
		// Botões //
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		
		
		 
		
		
		
		tela.getContentPane().add(lblMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(lblMinimoMultiplicador);
		tela.getContentPane().add(txtMinimoMultiplicador);
		tela.getContentPane().add(lblMaximoMultiplicador);
		tela.getContentPane().add(txtMaximoMultiplicador);
		
		tela.getContentPane().add(buttonCalcular);
		
		
		
		tela.setVisible(true);
		
		
	}
	
}
