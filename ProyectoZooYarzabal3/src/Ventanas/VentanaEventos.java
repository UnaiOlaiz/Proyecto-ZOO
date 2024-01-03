package Ventanas;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

// import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

public class VentanaEventos extends JFrame{
	private JFrame vActual, vAnterior;
	private JButton btnVolver;
	private JPanel pSur;
	// private EmbeddedMediaPlayerComponent component;
	
	public VentanaEventos (JFrame va) { //JFrame va
		super();
		vActual = this;
		vAnterior = va;
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
		
		
		JTextArea area = new JTextArea();
		area.setEditable(false);
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setText("¡Maravillas Acuáticas en Vivo!\n\n" +
                "Sumérgete en la fascinante maravilla del mundo marino con nuestra actuación exclusiva en el Zoológico Oceanográfico. Prepárate para una experiencia única, donde la gracia y la destreza de nuestras criaturas acuáticas te cautivarán.\n\n" +
                "Detalles del Show:\n" +
                "🐬 Actuaciones Asombrosas: Observa a nuestras estrellas marinas en su esplendor mientras realizan impresionantes acrobacias y demostraciones de agilidad. Desde saltos elegantes hasta juegos interactivos, te sorprenderás con su inteligencia.\n\n" +
                "🌊 Educación y Conservación: Descubre más sobre la vida marina mientras nuestros expertos comparten información valiosa sobre la conservación de estas especies asombrosas. Tu participación contribuye a la preservación de los océanos y sus habitantes.\n\n" +
                "📅 Fechas y Horarios (Enero) \n" +
                "Sesión 1: 02-01.2024 - 13:30\n" +
                "Sesión 2: 17-01-2024 - 10:00 \n\n" +
                "Entradas:\n" +
                "Adquiere tus entradas ahora y asegura tu lugar para este espectáculo único. ¡No te pierdas la oportunidad de sumergirte en la magia del océano en vivo!");
		
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
		
		
		JTextArea area2 = new JTextArea();
		area2.setEditable(false);
		area2.setLineWrap(true);
		area2.setWrapStyleWord(true);
		area2.setText("¡Majestuosos Leones en Acción!\n\n" +
                "Adéntrate en el emocionante mundo de la realeza animal con nuestro espectáculo exclusivo de leones. Prepárate para una experiencia única, donde la majestuosidad y el poder de estos felinos te dejarán sin aliento.\n\n" +
                "Detalles del Show:\n" +
                "🦁 Actuaciones Impresionantes: Observa a nuestros leones en su máximo esplendor mientras realizan increíbles acrobacias y demostraciones de fuerza. Desde saltos elegantes hasta demostraciones de destreza, te asombrarás con su agilidad.\n\n" +
                "🌍 Educación y Conservación: Descubre más sobre la vida y el comportamiento de los leones mientras nuestros expertos comparten información valiosa sobre la conservación de esta especie majestuosa. Tu participación contribuye a la preservación de estos magníficos animales.\n\n" +
                "📅 Fechas y Horarios (Enero) :\n" +
                "12-01-2024 - 13-01-2024 - 20-01-2024\n" +
                "12:30\n\n" +
                "Entradas:\n" +
                "Adquiere tus entradas ahora y asegura tu lugar para este espectáculo único. ¡No te pierdas la oportunidad de presenciar la grandeza de los leones en vivo!\n\n" +
                "Información de Contacto:\n" +
                "¡Únete a nosotros para un día inolvidable lleno de gracia, poder y asombro en el increíble espectáculo de leones!");
		
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
		
		JTextArea area3 = new JTextArea();
		area3.setEditable(false);
		area3.setLineWrap(true);
		area3.setWrapStyleWord(true);
		area3.setText("¡Aventura Ártica en Directo!\n\n" +
                "Embárcate en una emocionante travesía polar con nuestro espectáculo exclusivo en el Zoológico Frígido. Prepárate para una experiencia única, donde la majestuosidad y la gracia de nuestras criaturas polares te dejarán maravillado.\n\n" +
                "Detalles del Show:\n" +
                "❄️ Actuaciones Impresionantes: Observa a nuestros habitantes del frío en su máximo esplendor mientras realizan increíbles acrobacias y demostraciones de agilidad. Desde giros elegantes hasta demostraciones de fuerza, te sorprenderás con su resistencia al clima extremo.\n\n" +
                "🌐 Educación y Conservación: Descubre más sobre la vida en el Ártico mientras nuestros expertos comparten información valiosa sobre la conservación de estas especies fascinantes. Tu participación contribuye a la preservación de estos increíbles animales y sus hábitats únicos.\n\n" +
                "📅 Fechas y Horarios:\n" +
                "Dias: Todos los viernes y sabados\n" +
                "Función 2: 15:00\n\n" +
                "Entradas:\n" +
                "Adquiere tus entradas ahora y asegura tu lugar para este espectáculo polar único. ¡No te pierdas la oportunidad de sumergirte en la maravilla del Ártico en vivo!\n\n" +
                "¡Únete a nosotros para un día inolvidable lleno de aventura polar, conocimiento y asombro en el espectáculo del Zoológico Frígido!");
			
			
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
		
		JTextArea area4 = new JTextArea();
		area4.setEditable(false);
		area4.setLineWrap(true);
		area4.setWrapStyleWord(true);
		area4.setText("¡El Hábitat del Tigre en Vivo!\n\n" +
                "Adéntrate en el misterioso mundo del hábitat del tigre con nuestro espectáculo exclusivo en el Zoológico Salvaje. Prepárate para una experiencia única, donde la elegancia y el poder de estos felinos te transportarán a su hábitat natural.\n\n" +
                "Detalles del Show:\n" +
                "🐅 Actuaciones Impactantes: Observa a nuestros tigres en su máximo esplendor mientras realizan impresionantes acrobacias y demostraciones de agilidad. Desde saltos majestuosos hasta demostraciones de destreza, te asombrarás con su fuerza y gracia.\n\n" +
                "🌳 Educación y Conservación: Descubre más sobre la vida de los tigres y la importancia de preservar su hábitat mientras nuestros expertos comparten información valiosa. Tu participación contribuye a la conservación de estas magníficas criaturas y sus hogares naturales.\n\n" +
                "📅 Fechas y Horarios:\n" +
                "Presentación 1: 10-01-2024 13:00\n" +
                "Presentación 2: 12-01-2024 13:00 \n" +
                "Presentación 3: 16-01-2024 13:00 \n" +
                "Presentación 4: 23-01-2024 14:00 \n\n" +
                "Entradas:\n" +
                "Adquiere tus entradas ahora y asegura tu lugar para este espectáculo único en el Zoológico Salvaje. ¡No te pierdas la oportunidad de sumergirte en la majestuosidad del hábitat del tigre en vivo!\n\n" +
                "¡Únete a nosotros para un día inolvidable lleno de maravilla, conocimiento y asombro en el espectáculo \"El Hábitat del Tigre\" del Zoológico Salvaje!");
			
			
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
		
		JTextArea area5 = new JTextArea();
		area5.setEditable(false);
		area5.setLineWrap(true);
		area5.setWrapStyleWord(true);
		area5.setText("¡Tortugas en Acción: Un Viaje Maravilloso!\n\n" +
                "Embárcate en un fascinante viaje marino con nuestro espectáculo exclusivo \"Tortugas en Acción\" en el Zoológico Oceanográfico. Prepárate para una experiencia única, donde la gracia y la vitalidad de estas criaturas marinas te sumergirán en un mundo lleno de asombro.\n\n" +
                "Detalles del Show:\n" +
                "🐢 Actuaciones Encantadoras: Observa a nuestras tortugas en su máximo esplendor mientras realizan impresionantes acrobacias y demostraciones de agilidad en el agua. Desde elegantes movimientos hasta juegos interactivos, te sorprenderás con su destreza.\n\n" +
                "🌊 Educación y Conservación: Descubre más sobre la vida de las tortugas marinas y la importancia de su conservación mientras nuestros expertos comparten información valiosa. Tu participación contribuye a la preservación de estas especies y la protección de los océanos.\n\n" +
                "📅 Fechas y Horarios:\n" +
                "Dias: Todos los Lunes y Viernes\n" +
                "Horario: 14:00 \n\n" +
                "Entradas:\n" +
                "Adquiere tus entradas ahora y asegura tu lugar para este espectáculo único en el Zoológico Oceanográfico. ¡No te pierdas la oportunidad de ser testigo de las \"Tortugas en Acción\" en vivo!\n\n" +
                "¡Únete a nosotros para un día inolvidable lleno de maravillas acuáticas, aprendizaje y asombro en el espectáculo de \"Tortugas en Acción\" del Zoológico Oceanográfico!");
			
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
		// component.mediaPlayer().audio().setVolume(75);
		// component.mediaPlayer().media().play(urlVideo);
	}
//	public static void main(String[] args) {
//		new VentanaEventos();
//	}
	
	
} 

