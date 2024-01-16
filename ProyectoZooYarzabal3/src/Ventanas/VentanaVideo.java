package Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

public class VentanaVideo extends JFrame{
	protected JFrame vActual, vAnterior;
	protected JButton btnVolver;
	protected JPanel pSur;
	private EmbeddedMediaPlayerComponent component = new EmbeddedMediaPlayerComponent();
	
	public VentanaVideo(JFrame va) {
		super();
		vActual = this;
		vAnterior = va;
		setResizable(false);
		setTitle("Vídeo de bienvenida");
		setSize(600,500);
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel pnlVideo = new JPanel(new BorderLayout());
        JLabel lblVideo = new JLabel("BIENVENIDO");
        lblVideo.setFont(new Font("Times New Roman", Font.BOLD, 17));
        lblVideo.setForeground(new Color(70, 130, 180));
        lblVideo.setHorizontalAlignment(JLabel.CENTER); 
        pnlVideo.add(lblVideo, BorderLayout.CENTER);
        add(pnlVideo, BorderLayout.NORTH); 
        
        JPanel panelCentro = new JPanel();
        JPanel panelCentroNorte = new JPanel();
//        panelCentroNorte.add(component);
        panelCentro.add(panelCentroNorte, BorderLayout.NORTH);
        JPanel panelCentroSur = new JPanel();
        JButton btn1 = new JButton("Botón 1");
        JButton btn2 = new JButton("Botón 2");
        panelCentroSur.add(btn1);
        panelCentroSur.add(btn2);
        panelCentro.add(panelCentroSur, BorderLayout.SOUTH);
        add(panelCentro, BorderLayout.CENTER);
        
        btnVolver = new JButton("VOLVER");
        btnVolver.addActionListener((e)->{
        	vAnterior.setVisible(true);
        	vActual.dispose();
        });
        pSur = new JPanel();
        getContentPane().add(pSur, BorderLayout.SOUTH);
        pSur.add(btnVolver);
		
//		component.mediaPlayer().media().play("C:\\Users\\unaio\\Downloads/DjMaRiiO _ Strip Fifa #2 _ Xf.3gp");

        setVisible(true);
		
	}
}
