package Ventanas;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import BaseDeDatos.VisualizarBD;
import Zoo.Empleado;



public class VentanaAdministrador extends JFrame {
    protected JFrame vActual, vAnterior;
    protected JButton btnVolver, btnVerEmpleados;
    protected JPanel pSur;
    private JTable tablaEmpleados;
    private JScrollPane scrollPane;
    private JButton btnAgregarEmpleado, btnDespedirEmpleado;
    private JButton btnFinanzas, btnGestionAlimentos;
    
    
    
    public VentanaAdministrador(JFrame va) {
        super();
        vActual = this;
        vAnterior = va;
        setTitle("Ventana del Administrador");
        setBounds(500, 300, 700, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnVolver = new JButton("VOLVER");
        btnVolver.addActionListener((e) -> {
            vAnterior.setVisible(true);
            vActual.dispose();
        });

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("DNI");
        model.addColumn("Nombre");
        model.addColumn("Puesto");
        model.addColumn("Salario");
        model.addColumn("Fecha Contratación");
        
        ArrayList<Empleado> empleados = VisualizarBD.visualizarEmpleados();
 
        System.out.println(empleados); //Comprobacion

        for (Empleado empleado : empleados) {
            Object[] row = {
                    empleado.getDNI(),
                    empleado.getNombreEmpleado(),
                    empleado.getPuestoEmpleado(),
                    empleado.getSalarioEmpleado(),
                    empleado.getFechaContratacion()
            };
            model.addRow(row);
        }
        
        tablaEmpleados = new JTable(model);
        
        scrollPane = new JScrollPane(tablaEmpleados);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        
        
        btnAgregarEmpleado = new JButton("Agregar Empleado");
        btnAgregarEmpleado.addActionListener((e) -> {
            // Poder contratar empleados
        });
        
        btnDespedirEmpleado = new JButton("Despedir Empleado");
        btnDespedirEmpleado.addActionListener((e) -> {
            // Poder despedir empleados
        });
        
        btnFinanzas = new JButton("Finanzas");
        btnFinanzas.addActionListener((e) -> {
            mostrarFinanzas(); // Función para mostrar las finanzas del zoológico
        });
        
        
        btnGestionAlimentos = new JButton("Gestión de Alimentos");
        btnGestionAlimentos.addActionListener((e) -> {
            gestionarAlimentos(); // Función para llevar a cabo la gestión de alimentos
        });
        
        pSur = new JPanel();
        pSur.add(btnAgregarEmpleado);
        pSur.add(btnDespedirEmpleado);
        pSur.add(btnFinanzas);
        pSur.add(btnGestionAlimentos);
        pSur.add(btnVolver);
        
        

        getContentPane().add(pSur);

        setVisible(true);
    }
    
    private void mostrarFinanzas() {
    	
    	JOptionPane.showMessageDialog(this, "Gestión financiera aqui");
    }
    
    private void gestionarAlimentos() {
        
        JOptionPane.showMessageDialog(this, "Gestión de alimentos aquí");
    }

  
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaAdministrador(null));
    }
}

