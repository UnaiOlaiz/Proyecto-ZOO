package Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

public class VentanaEventos extends JFrame{
	private JFrame vActual, vAnterior;
	private JButton btnVolver;
	private JPanel pSur;
	private EmbeddedMediaPlayerComponent component;
	
	public VentanaEventos () { //JFrame va
		super();
		vActual = this;
//		vAnterior = va;
		setResizable(false);
		setBounds(500, 300, 800, 600);
		setTitle( "INFORMACIÓN SOBRE NUESTROS EVENTOS" );
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * Vamos a crear un JTabbedPane donde en cada pestaña información descriptiva
		 * de cada evento será almacenada. Cada evento (pestaña) dispondrá de una 
		 * descripción de texto + un vídeo donde se ilustrará para conseguir un efecto
		 * más visual
		 */
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		// Evento Mundo Marino
		JPanel panelEvento1 = new JPanel(new GridLayout(3,1));
		panelEvento1.setBackground(new Color(70, 130, 180));
		JLabel labelTitulo = new JLabel( "MUNDO MARINO" );
		labelTitulo.setHorizontalAlignment(JLabel.CENTER);
		JPanel panelTitulo = new JPanel();
		panelTitulo.add(labelTitulo);
		panelTitulo.setPreferredSize(new Dimension(getWidth(), 20));
		labelTitulo.setForeground(Color.white);
		labelTitulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panelEvento1.add(labelTitulo, BorderLayout.NORTH);
		JPanel panelVideo = new JPanel();
		panelVideo.setBackground(Color.black);
		panelEvento1.add(panelVideo, BorderLayout.CENTER);
		JTextArea area = new JTextArea("asdfasdf");
		panelEvento1.add(new JScrollPane(area));
		
		JPanel panelEvento2 = new JPanel(new GridLayout(3,1));
		panelEvento2.setBackground(new Color(70, 130, 180));
		JLabel labelTitulo2 = new JLabel( "SHOW DE LEONES" );
		labelTitulo2.setHorizontalAlignment(JLabel.CENTER);
		JPanel panelTitulo2 = new JPanel();
		panelTitulo2.add(labelTitulo2);
		panelTitulo2.setPreferredSize(new Dimension(getWidth(), 20));
		labelTitulo2.setForeground(Color.white);
		labelTitulo2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panelEvento2.add(labelTitulo2, BorderLayout.NORTH);
		JPanel panelVideo2 = new JPanel();
		panelVideo2.setBackground(Color.black);
		panelEvento2.add(panelVideo2, BorderLayout.CENTER);
		JTextArea area2 = new JTextArea("asdfasdf");
		panelEvento2.add(new JScrollPane(area2));
		
		JPanel panelEvento3 = new JPanel(new GridLayout(3,1));
		panelEvento3.setBackground(new Color(70, 130, 180));
		JLabel labelTitulo3 = new JLabel( "ENCUENTRO POLAR" );
		labelTitulo3.setHorizontalAlignment(JLabel.CENTER);
		JPanel panelTitulo3 = new JPanel();
		panelTitulo3.add(labelTitulo3);
		panelTitulo3.setPreferredSize(new Dimension(getWidth(), 20));
		labelTitulo3.setForeground(Color.white);
		labelTitulo3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panelEvento3.add(labelTitulo3, BorderLayout.NORTH);
		JPanel panelVideo3 = new JPanel();
		panelVideo3.setBackground(Color.black);
		panelEvento3.add(panelVideo3, BorderLayout.CENTER);
		JTextArea area3 = new JTextArea("asdfasdf");
		panelEvento3.add(new JScrollPane(area3));
		
		JPanel panelEvento4 = new JPanel(new GridLayout(3,1));
		panelEvento4.setBackground(new Color(70, 130, 180));
		JLabel labelTitulo4 = new JLabel( "HÁBITAT DEL TIGRE" );
		labelTitulo4.setHorizontalAlignment(JLabel.CENTER);
		JPanel panelTitulo4 = new JPanel();
		panelTitulo4.add(labelTitulo4);
		panelTitulo4.setPreferredSize(new Dimension(getWidth(), 20));
		labelTitulo4.setForeground(Color.white);
		labelTitulo4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panelEvento4.add(labelTitulo4, BorderLayout.NORTH);
		JPanel panelVideo4 = new JPanel();
		panelVideo4.setBackground(Color.black);
		panelEvento4.add(panelVideo4, BorderLayout.CENTER);
		JTextArea area4 = new JTextArea("asdfasdf");
		panelEvento4.add(new JScrollPane(area4));
		
		JPanel panelEvento5 = new JPanel(new GridLayout(3,1));
		panelEvento5.setBackground(new Color(70, 130, 180));
		JLabel labelTitulo5 = new JLabel( "TORTUGAS EN ACCIÓN" );
		labelTitulo5.setHorizontalAlignment(JLabel.CENTER);
		JPanel panelTitulo5 = new JPanel();
		panelTitulo5.add(labelTitulo5);
		panelTitulo5.setPreferredSize(new Dimension(getWidth(), 20));
		labelTitulo5.setForeground(Color.white);
		labelTitulo5.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panelEvento5.add(labelTitulo5, BorderLayout.NORTH);
		JPanel panelVideo5 = new JPanel();
		panelVideo5.setBackground(Color.black);
		panelEvento5.add(panelVideo5, BorderLayout.CENTER);
		JTextArea area5 = new JTextArea("asdfasdf");
		panelEvento5.add(new JScrollPane(area5));
		
		tabbedPane.addTab("Mundo Marino", panelEvento1);
		tabbedPane.addTab("Show de Leones", panelEvento2);
		tabbedPane.addTab("Encuentro Polar", panelEvento3);
		tabbedPane.addTab("Hábitat del tigre", panelEvento4);
		tabbedPane.addTab("Tortugas en acción", panelEvento5);
		
		
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
				
		btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(new Color(70, 130, 180));
		btnVolver.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pSur = new JPanel();
		pSur.setBackground(new Color(70, 130, 180));
		getContentPane().add(pSur, BorderLayout.SOUTH);
		pSur.add(btnVolver);
		btnVolver.addActionListener((e)->{
			vAnterior.setVisible(true);
			vActual.dispose();
		});
		
		setVisible(true);
	}
	//Informacion de todos los eventos del zoo 
	public void lanzarVideo (String urlVideo) {
		component.mediaPlayer().audio().setVolume(75);
		component.mediaPlayer().media().play(urlVideo);
	}
	public static void main(String[] args) {
		new VentanaEventos();
	}
	
	
} 

