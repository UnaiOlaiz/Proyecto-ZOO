package Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class VentanaMantenimiento extends JFrame {
	protected JFrame vActual, vAnterior;
	protected JButton btnVolver;
	protected JPanel pSur;
	private JButton botonRealizarMantenimiento;
	private JTextArea areaTexto;
	private Connection connection;
	public VentanaMantenimiento(JFrame va) {
		super();
		vActual = this;
		vAnterior = va;
		setTitle("Ventana de Mantenimineto");
		setBounds(500, 300, 700, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        botonRealizarMantenimiento = new JButton("Realizar Mantenimiento");
        botonRealizarMantenimiento.setForeground(new Color(70, 130, 180));
        botonRealizarMantenimiento.setFont(new Font("Times New Roman", Font.BOLD, 14));
        botonRealizarMantenimiento.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				realizarMantenimiento();
			}
		});
        areaTexto = new JTextArea(10, 30);
        areaTexto.setEditable(false);
        
        JPanel panelCentro = new JPanel();
        panelCentro.setBackground(Color.WHITE);
        panelCentro.add(botonRealizarMantenimiento, BorderLayout.NORTH);
        panelCentro.add(new JScrollPane(areaTexto), BorderLayout.SOUTH);
        
        getContentPane().add(panelCentro, BorderLayout.CENTER);
        
        
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
	protected void realizarMantenimiento() {
		try {
			ArrayList<String> animalesMantenimiento = obtenerAnimalesParaMantenimiento();
			animalesMantenimiento.forEach(animal -> {
				actualizarEstadoMantenimiento(animal);
				areaTexto.append("Mantenimiento realizado para: " + animal + "\n");
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void actualizarEstadoMantenimiento(String animal) {
		// TODO Auto-generated method stub
		
	}
	private ArrayList<String> obtenerAnimalesParaMantenimiento() {
		ArrayList<String> animalesMant = new ArrayList<>();
		String sentenciaSQL = "S";
		return animalesMant;
		
	}
	private void conectarBD() {
		try {
			String url = "jdbc:sqlite:ZOOYARZABALBD.db";
			connection = DriverManager.getConnection(url);
		} catch (SQLException e) {e.printStackTrace();}
	}


}
