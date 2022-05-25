package br.com.mariojp.cinema.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.com.mariojp.cinema.model.Assento;
import br.com.mariojp.cinema.model.Fila;
import br.com.mariojp.cinema.regras.SalaRegras;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel salaPanel = new JPanel();
	private JPanel estatisticasPanel = new JPanel();

	private JLabel assentosVendidos = new JLabel("0");
	private JLabel percentualVendido = new JLabel("0,00%");
	private JLabel valorVendido = new JLabel("R$ 0,00");


	private SalaRegras regras = new SalaRegras(); 
	
	public Janela() {
		super("PDV CINEMA");
		int filas = Integer.parseInt( JOptionPane.showInputDialog("NUMERO DE FILAS"));
		int assentos = Integer.parseInt( JOptionPane.showInputDialog("NUMERO ASSENTOS POR FILA"));
		regras.criaSala(filas, assentos);
		setSize(400, 400);
		initPainel();
		initEstatististicas();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void initPainel() {
		salaPanel.setLayout(new GridLayout(regras.getSala().getFilas().size(), regras.getSala().getFilas().get(0).getAssentos().size()));

		for (Fila fila : regras.getSala().getFilas()) {
			for (Assento assento : fila.getAssentos()) {
				JButton b =  new JButton(fila.getNumero()+"-"+assento.getNumero());
				b.setOpaque(true);
				b.setForeground(Color.GREEN);

				b.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						regras.vendaAssento(fila.getNumero(), assento.getNumero());
						b.setForeground(Color.RED);
						assentosVendidos.setText(""+ regras.ingressosVendidos());
						percentualVendido.setText(String.format("%.2f %%", regras.percentualIngressosVendidos()));
						valorVendido.setText(String.format("R$ %.2f", regras.valorIngressosVendidos()));

					}
				});
				salaPanel.add(b);
			}
		}
		this.add(salaPanel,BorderLayout.CENTER);
	}
	

	public void initEstatististicas() {
		
		estatisticasPanel.setLayout(new GridLayout(8,1));
		estatisticasPanel.add(new JLabel("ASSENTOS VENDIDOS"));
		estatisticasPanel.add(assentosVendidos);
		estatisticasPanel.add(new JLabel("PERCENTUAL VENDIDO"));
		estatisticasPanel.add(percentualVendido);
		estatisticasPanel.add(new JLabel("VALOR VENDIDO"));
		estatisticasPanel.add(valorVendido);
		estatisticasPanel.add(new JLabel("VALOR TOTAL"));
		estatisticasPanel.add(new JLabel(String.format("R$ %.2f", regras.valorTotalIngressos())));
		
		this.add(estatisticasPanel, BorderLayout.LINE_END);
	}
	
	
}
