package Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import javazoom.jl.player.Player;

public class VentanaSeguridad extends JFrame {
	protected JFrame vActual, vAnterior;
	protected JButton btnVolver;
	protected JPanel pSur;
	protected ArrayList<String> titulosAudios;
	protected Thread hilo;
	protected Player player;
	protected boolean seguir = false;
	
	/*
	 * En esta ventana que se ejecutará tanto al registrar un nuevo trabajador con función de guardia de seguridad, o al 
	 * iniciar sesión como uno ya registrado, tiene el objetivo de simular un "walkee talkee" que dispone un guardia de seguridad
	 * en este tipo de empresas y establecimientos. El guardia recibirá aleatoriamente una serie de alertas ya sea que un animal se haya
	 * escapado, que alguien haya entrado sin entrada, ... etc mediante una serie de audios customizados para simular lo más fielmente
	 * posible las órdenes y mensajes que recibe uno en la vida real.
	 */
	
	public VentanaSeguridad(JFrame va) { // Luego aquí insertar JFrame va
		super();
		vActual = this;
		vAnterior = va;
		setTitle("Ventana de Seguridad");
		setResizable(false);
		setLocationRelativeTo(null);
		setBounds(500, 300, 700, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        /*
    	 * Para ello, los titulos de los archivos mp3 (los audios) serán almacenados en un array para luego ser seleccionados aleatoriamente.
    	 * Al ser escocigo será excluido del array para que no se vuelva a repetir.
    	 */
    	
    	titulosAudios = new ArrayList<>();
    	// Primero rellenemos el array de títulos
    	titulosAudios.add("TheoryOfEverything.mp3");
    	titulosAudios.add("The7Seas.mp3");
    	titulosAudios.add("TimeMachine.mp3");
    	titulosAudios.add("VikingArena.mp3");
    	// El Array ya está lleno, luego cambiaremos los archivos mp3
    	
    	// Panel donde irán las explicaciones de como llevar a cabo el trabajo como guarda de seguridad del ZOO
    	JPanel panelNorte = new JPanel(new GridLayout(4,1));
    	
    	JPanel panelExplicacion0 = new JPanel();
	    panelExplicacion0.setBackground(new Color(70, 130, 180));
	    JLabel labelExplicacion0 = new JLabel( "RECORDATORIO");
	    labelExplicacion0.setFont(new Font("Times New Roman", Font.BOLD, 18));
	    labelExplicacion0.setForeground(Color.WHITE);
	    panelExplicacion0.add(labelExplicacion0);
    	
    	JPanel panelExplicacion1 = new JPanel();
	    panelExplicacion1.setBackground(new Color(70, 130, 180));
	    JLabel labelExplicacion1 = new JLabel( "Bienvenido al panel de control de la seguridad del ZOO");
	    labelExplicacion1.setFont(new Font("Times New Roman", Font.BOLD, 14));
	    labelExplicacion1.setForeground(Color.WHITE);
	    panelExplicacion1.add(labelExplicacion1);
	    
	    JPanel panelExplicacion2 = new JPanel();
	    panelExplicacion2.setBackground(new Color(70, 130, 180));
	    JLabel labelExplicacion2 = new JLabel( "Se le notificarán todo tipo de problemas dentro de ZOOyarzabal" );
	    labelExplicacion2.setFont(new Font("Times New Roman", Font.BOLD, 14));
	    labelExplicacion2.setForeground(Color.WHITE);
	    panelExplicacion2.add(labelExplicacion2);
	    
	    JPanel panelExplicacion3 = new JPanel();
	    panelExplicacion3.setBackground(new Color(70, 130, 180));
	    JLabel labelExplicacion3 = new JLabel( "Intente responder y actuar de la mejor manera posible, la seguridad del recinto depende de usted");
	    labelExplicacion3.setFont(new Font("Times New Roman", Font.BOLD, 14));
	    labelExplicacion3.setForeground(Color.WHITE);
	    panelExplicacion3.add(labelExplicacion3);
	    
	    panelNorte.add(panelExplicacion0);
	    panelNorte.add(panelExplicacion1);
	    panelNorte.add(panelExplicacion2);
	    panelNorte.add(panelExplicacion3);
	    
	    getContentPane().add(panelNorte, BorderLayout.NORTH);
    	
    	
    	// Panel donde irá el botón para comenzar jornada
    	JPanel panelCentro = new JPanel(new BorderLayout());
    	
    	JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.setBackground(new Color(70, 130, 180));
    	JButton botonEmpezarJornada = new JButton( "COMENZAR JORNADA" );
    	botonEmpezarJornada.setForeground(new Color(70, 130, 180));
    	botonEmpezarJornada.setFont(new Font("Times New Roman", Font.BOLD, 14));
    	panelBotones.add(botonEmpezarJornada);
    	
    	JButton botonAcabarJornada = new JButton( "ACABAR JORNADA" );
    	botonAcabarJornada.setForeground(new Color(70, 130, 180));
    	botonAcabarJornada.setFont(new Font("Times New Roman", Font.BOLD, 14));
    	panelBotones.add(botonAcabarJornada);
    	
    	panelCentro.add(panelBotones, BorderLayout.NORTH);
    	
    	JPanel panelIntermedio = new JPanel();
    	panelIntermedio.setLayout(new BoxLayout(panelIntermedio, BoxLayout.Y_AXIS));
    	JTextArea area = new JTextArea( 10, 40 );
    	area.setForeground(new Color(70, 130, 180));
    	area.setText("");
    	area.setFont(new Font("Times New Roman", Font.BOLD, 14));
    	panelIntermedio.add(area);
    	panelCentro.add(panelIntermedio, BorderLayout.CENTER);
    	
    	getContentPane().add(panelCentro, BorderLayout.CENTER);
    	
    	// actionlistener de los botones
    	botonEmpezarJornada.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String tituloSeleccionado = ElegirArchivoAleatorio(titulosAudios);
				area.append(tituloSeleccionado + "\n" );
				
				hilo = new Thread(() -> {
		          try {
					FileInputStream fileInputStream = new FileInputStream(tituloSeleccionado);
					player = new Player(fileInputStream);
					seguir = true;
					player.play();
					
					while( seguir && !Thread.currentThread().isInterrupted() ) {
						Thread.sleep(100);
					}
					player.close();
				} catch (Exception e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
		        });
		        
		        hilo.start(); // Iniciar el hilo
				
				
			
			}});
    	
    	botonAcabarJornada.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				seguir = false;
				if(player != null) {
					player.close();
					hilo.interrupt();
				}
			}
		});
        
        // Panel donde irá el botón
        btnVolver = new JButton("VOLVER");
        btnVolver.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnVolver.setForeground(new Color(70, 130, 180));
        
        btnVolver.addActionListener((e)->{
        	vAnterior.setVisible(true);
        	vActual.dispose();
        });
        pSur = new JPanel();
        pSur.setBackground(new Color(70, 130, 180));
        getContentPane().add(pSur, BorderLayout.SOUTH);
        pSur.add(btnVolver);
        
        setVisible(true);
		
	}
	
	/*
	 * A continuación vamos a programar el método que se encargará de reproducir los audios
	 * Seguramente sea implentado en algún tipo de hilo.
	 */
	
	public String ElegirArchivoAleatorio(ArrayList<String> arrayTitulos) {
		Random random = new Random();
		int indiceAleatorio = random.nextInt(arrayTitulos.size());
		String tituloAleatorio = arrayTitulos.get(indiceAleatorio);
//		System.out.println(tituloAleatorio);
		return tituloAleatorio;
		
	}
	
	public void ReproducirAudioMp3(String nombreArchivo) {
		try {
			FileInputStream fileInputStream = new FileInputStream(nombreArchivo);
			Player player = new Player(fileInputStream);
			player.play();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		new VentanaSeguridad();
//	}

}
