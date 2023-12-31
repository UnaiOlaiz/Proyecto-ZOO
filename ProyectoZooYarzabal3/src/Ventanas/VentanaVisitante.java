package Ventanas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Zoo.BordeadoTexto;
import Zoo.ImagePanel;
// import uk.co.caprica.vlcj.factory.discovery.NativeDiscovery;
// import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

public class VentanaVisitante extends JFrame{
	private static JFrame vActual;
	private JFrame vAnterior;
	private JButton btnEventos, btnMapa, btnInfoAnimales, btnVolver;
	private JPanel pnlNorte, pnlBotones;
	private JLabel lblTitulo;
//	private EmbeddedMediaPlayerComponent component;

	
/*	public static void main(String[] args) {
		System.out.println("a");
		System.setProperty("jna.library.path", "C:/Program Files/VideoLAN/VLC");
		miVentana = new VentanaVisitante(vActual);
		System.out.println("b");
		miVentana.lanzarVideo("Go!azen 10_ _Zoriontasuna_.mp4");
		System.out.println((new NativeDiscovery()).discoveredPath());

	} */
	
	private static VentanaVisitante miVentana; 
	
	public VentanaVisitante(JFrame va) {
		super();
		setTitle( "INFORMACIÓN PARA LOS VISITANTES" );
		vActual = this;
		vAnterior = va;
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setBounds(250, 100, 1000, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/*
		 * Para añadir el JScrollPane a toda la ventana vamos a crear un panel principal
		 */
		
		JPanel panelContenidoPrincipal = new JPanel( new BorderLayout());
		
		JPanel pnlTitulo = new JPanel();
		pnlTitulo.setBackground(new Color(70, 130, 180));
//		pnlTitulo.setBackground(new Color(173, 217, 230));
		pnlTitulo.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblTitulo = new JLabel( "BIENVENIDO A ZOOYARZABAL" );
        lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 40));
        lblTitulo.setForeground(Color.white);
        pnlTitulo.add(lblTitulo);
        pnlTitulo.setPreferredSize(new Dimension(pnlTitulo.getPreferredSize().width, 50));
        panelContenidoPrincipal.add(pnlTitulo, BorderLayout.NORTH);
        
        /*
         * Vamos a meter el video dentro de un panel y toda la ventana será controlada
         * por un JScrollPane, el video será sacado de Youtube, ya que no contamos con
         * los recursos para hacer uno nosotros mismos.
         */
        JPanel pnlSur = new JPanel();
        JPanel panelPrincipal = new JPanel(new BorderLayout());
//      panelPrincipal.setBackground(new Color(173, 217, 230));
        
        JPanel panelVideoyBotones = new JPanel(new BorderLayout());
        panelVideoyBotones.setBackground(new Color(70, 130, 180));
        
        
//      component = new EmbeddedMediaPlayerComponent(); 
        JPanel componenteVacio = new JPanel();
        componenteVacio.setBackground(Color.BLACK);
        panelVideoyBotones.add(componenteVacio, BorderLayout.CENTER);
        panelPrincipal.add(panelVideoyBotones, BorderLayout.CENTER);
        
        JPanel panelBotonesVideo = new JPanel(new FlowLayout());
        panelBotonesVideo.setBackground(new Color(173, 217, 230));
        JButton botonPausa = new JButton( "Pausar" );
//      botonPausa.setBackground(new Color(0, 128, 128));
        botonPausa.setFont(new Font("Times New Roman", Font.BOLD, 14));
        botonPausa.setForeground(new Color(70, 130, 180));
        panelBotonesVideo.add(botonPausa);
        JButton botonReiniciar = new JButton( "Reiniciar" );
//      botonReiniciar.setBackground(new Color(0, 128, 128));
        botonReiniciar.setFont(new Font("Times New Roman", Font.BOLD, 14));
        botonReiniciar.setForeground(new Color(70, 130, 180));
        panelBotonesVideo.add(botonReiniciar);
        panelBotonesVideo.setBackground(new Color(70, 130, 180));
        
/*        botonPausa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (component.mediaPlayer().status().isPlaying()) {
					component.mediaPlayer().controls().pause();
				}else {
					component.mediaPlayer().controls().play();
				}
			}
		});			
		
		
        
        botonReiniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				component.mediaPlayer().controls().pause();
				component.mediaPlayer().controls().setTime(0);
				component.mediaPlayer().controls().play();
			}
		});
		
		*/
        
        panelVideoyBotones.add(panelBotonesVideo, BorderLayout.SOUTH);
        
        //
		
        JPanel pnlTexto = new JPanel(new GridBagLayout());
        // Agregaremos algunas condiciones para que luego el JTextArea se vea mejor
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; 
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = 1; 
        gbc.weightx = 1.0; 
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        
        
        JTextArea areaTexto = new JTextArea();
        areaTexto.setOpaque(false);
        // areaTexto.setBackground(new Color(173, 217, 230));
        areaTexto.setRows(10);
        areaTexto.setColumns(30);
        areaTexto.setText(
                "¡Bienvenidos al Zoológico Zooyarzabal!\n\n" +
                "Estamos emocionados de presentarles nuestro zoológico, donde podrán experimentar " +
                "la diversidad y belleza de la vida animal. Algunas de las atracciones destacadas incluyen:\n\n" +
                "- Safari Africano: Observa a majestuosos leones, elefantes, jirafas y rinocerontes en su hábitat natural.\n" +
                "- Acuario Marino : Sumérgete en las profundidades del océano y descubre una variedad de peces tropicales, tiburones y corales vibrantes.\n" +
                "- Selva Amazónica : Explora la rica biodiversidad de la selva amazónica, desde coloridos loros hasta intrigantes jaguares y perezosos.\n" +
                "- Habitat Polar : Experimenta el frío ártico mientras observas a osos polares, pingüinos y otras criaturas adaptadas a las condiciones extremas.\n\n" +
                "Además de nuestras atracciones principales, ofrecemos espectáculos diarios, charlas educativas y actividades interactivas para toda la familia. " +
                "Esperamos que disfruten de esta aventura única y se lleven recuerdos inolvidables de su visita a Zooyarzabal."
        );
        areaTexto.setEditable(false);
        areaTexto.setWrapStyleWord(true);
        areaTexto.setLineWrap(true);
        Font fuenteLetra = new Font("Times New Roman", Font.BOLD, 14);
        areaTexto.setFont(fuenteLetra);
        areaTexto.setForeground(new Color(70, 130, 180));
        
        JPanel imagePanel = new JPanel();
        imagePanel.setLayout(new BorderLayout());
        imagePanel.setBackground(Color.WHITE);
        imagePanel.add(areaTexto, BorderLayout.CENTER);
        
        
        panelPrincipal.add(imagePanel, BorderLayout.SOUTH);
        panelPrincipal.setBackground(new Color(173, 217, 230));
        panelContenidoPrincipal.add(panelPrincipal, BorderLayout.CENTER);
        
        //
//        JPanel pnlTitulo = new JPanel();
//		pnlTitulo.setBackground(new Color(70, 130, 180));
////		pnlTitulo.setBackground(new Color(173, 217, 230));
//		pnlTitulo.setLayout(new FlowLayout(FlowLayout.CENTER));
//        JLabel lblTitulo = new JLabel( "BIENVENIDO A ZOOYARZABAL" );
//        lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 40));
//        lblTitulo.setForeground(Color.white);
//        pnlTitulo.add(lblTitulo);
//        pnlTitulo.setPreferredSize(new Dimension(pnlTitulo.getPreferredSize().width, 50));
//        panelContenidoPrincipal.add(pnlTitulo, BorderLayout.NORTH);
//        JPanel panelDecoracion = new JPanel();
//        panelDecoracion.setLayout(new FlowLayout(FlowLayout.CENTER));
//        JLabel LABEL = new JLabel( "MÁS INFORMACIÓN" );
//        LABEL.setFont(new Font("Times New Roman", Font.BOLD, 18));
//        LABEL.setForeground(Color.white);
//        panelDecoracion.add(LABEL);
//        panelDecoracion.setBackground(new Color(70, 130, 180));
//        pnlSur.add(panelDecoracion, BorderLayout.NORTH);
        
        JPanel panelSurNorte = new JPanel(new GridLayout(5, 2));
        panelSurNorte.setBackground(Color.white);
        
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel( "" );
        panel1.add(label1);
        panel1.setBackground(new Color(70, 130, 180));
        panelSurNorte.add(panel1);
        
        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel( "" );
        panel2.add(label2);
        panel2.setBackground(new Color(70, 130, 180));
        panelSurNorte.add(panel2);
        
        JLabel labelEventos = new JLabel( "Consulta los eventos disponibles en nuestro ZOO" );
        labelEventos.setFont(new Font("Times New Roman", Font.BOLD, 14));
        labelEventos.setForeground(new Color(70, 130, 180));
        panelSurNorte.add(labelEventos);
        
        btnEventos = new JButton( "EVENTOS" );
        btnEventos.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnEventos.setForeground(new Color(70, 130, 180));
        panelSurNorte.add(btnEventos);
        
        JLabel labelMapa = new JLabel( "Aquí puedes conseguir el mapa de nuestro ZOO" );
        labelMapa.setFont(new Font("Times New Roman", Font.BOLD, 14));
        labelMapa.setForeground(new Color(70, 130, 180));
        panelSurNorte.add(labelMapa);
        
        JButton botonMapa = new JButton( "MAPA" );
        botonMapa.addActionListener((e)->{
			JOptionPane.showMessageDialog(null, "Has seleccionado la opción de Mapa", "MAPA", JOptionPane.INFORMATION_MESSAGE);
			new VentanaMapa(vActual);
			vActual.dispose();
		});
        botonMapa.setFont(new Font("Times New Roman", Font.BOLD, 14));
        botonMapa.setForeground(new Color(70, 130, 180));
        panelSurNorte.add(botonMapa);
        
        JLabel labelInfoAnimales = new JLabel( "Toda la información sobre nuestros animales" );
        labelInfoAnimales.setFont(new Font("Times New Roman", Font.BOLD, 14));
        labelInfoAnimales.setForeground(new Color(70, 130, 180));
        panelSurNorte.add(labelInfoAnimales);
        
        btnInfoAnimales = new JButton("INFORMACIÓN DE ANIMALES");
        btnInfoAnimales.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnInfoAnimales.setForeground(new Color(70, 130, 180));
		panelSurNorte.add(btnInfoAnimales);
		
		JLabel labelBillete = new JLabel( "Compra las entradas online" );
        labelBillete.setFont(new Font("Times New Roman", Font.BOLD, 14));
        labelBillete.setForeground(new Color(70, 130, 180));
        panelSurNorte.add(labelBillete);
        
        JButton botonImprimirBillete = new JButton( "COMPRAR BILLETE" );
		botonImprimirBillete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		botonImprimirBillete.setForeground(new Color(70, 130, 180));
		panelSurNorte.add(botonImprimirBillete);
        
		pnlSur.setLayout(new BorderLayout());
        pnlSur.add(panelSurNorte, BorderLayout.NORTH);
        
        
        JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlBotones.setBackground(new Color(70, 130, 180));
//        btnEventos = new JButton("EVENTOS");
////        btnEventos.setBackground(new Color(0, 128, 128));
//        btnEventos.setFont(new Font("Times New Roman", Font.BOLD, 14));
//        btnEventos.setForeground(new Color(70, 130, 180));
//        btnMapa = new JButton("MAPA");
////        btnMapa.setBackground(new Color(0, 128, 128));
//        btnMapa.setFont(new Font("Times New Roman", Font.BOLD, 14));
//        btnMapa.setForeground(new Color(70, 130, 180));
//		btnInfoAnimales = new JButton("INFORMACIÓN DE ANIMALES");
////		btnInfoAnimales.setBackground(new Color(0, 128, 128));
//		btnInfoAnimales.setFont(new Font("Times New Roman", Font.BOLD, 14));
//		btnInfoAnimales.setForeground(new Color(70, 130, 180));
		btnVolver = new JButton("VOLVER");
//		btnVolver.setBackground(new Color(0, 128, 128));
		btnVolver.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnVolver.setForeground(new Color(70, 130, 180));
		
//		pnlBotones.add(btnEventos);
//		pnlBotones.add(btnMapa);
//		pnlBotones.add(btnInfoAnimales);
//		pnlBotones.add(botonImprimirBillete);
		pnlBotones.add(btnVolver, BorderLayout.CENTER);
		pnlSur.add(pnlBotones, BorderLayout.SOUTH);
		panelContenidoPrincipal.add(pnlSur, BorderLayout.SOUTH);
		
		btnEventos.addActionListener((e)->{
			JOptionPane.showMessageDialog(null, "Has seleccionado la opción de Eventos", "EVENTOS", JOptionPane.INFORMATION_MESSAGE);
			new VentanaEventos(vActual);
			vActual.dispose();
		});
		
		
		
		btnInfoAnimales.addActionListener((e)->{
			JOptionPane.showMessageDialog(null, "Has seleccionado la opción de informacion sobre Animales", "ANIMALES", JOptionPane.INFORMATION_MESSAGE);
			new VentanaAnimales(vActual);
			vActual.dispose();
		});
		
		btnVolver.addActionListener((e)->{
	        vAnterior.setVisible(true);
			vActual.dispose();
	    });
		
		botonImprimirBillete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Has seleccionado la opción de comprar billete", "COMPRAR BILLETE", JOptionPane.INFORMATION_MESSAGE);
				new VentanaComprarBillete(vActual);
				vActual.dispose();
			}
		});

		JScrollPane scrollPane = new JScrollPane(panelContenidoPrincipal);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		add(scrollPane);
		setVisible(true);
		
		

	
}
	/* private void lanzarVideo(String urlVideo) {
		component.mediaPlayer().audio().setVolume(75); // para que no salga a tope el volúmen
		component.mediaPlayer().media().play(urlVideo);
	} */
}
	
	