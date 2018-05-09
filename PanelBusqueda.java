<<<<<<< HEAD

package bolasdb;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;


public class PanelBusqueda extends JPanel{
    private JScrollPane sPanelArea;
    private JPanel panA, panAa, panAb, panB, panBa, panBb;
    private JButton btnBuscar, btnCotizar;
    private JTextField txtBuscar;
    private JTextArea areaSeleccion;
    private JLabel labelImagen, precioMayoreo, precioMenudeo,piezasMinMayoreo, pMa, pMe, pMm;
    private JList lista;
    private DefaultListModel lista1;
    private ArrayList<Producto> listaMostrarBuscar;
    private int idx;
    
    public PanelBusqueda(){
        super();
        
        
        btnCotizar= new JButton("Cotizar");
        labelImagen= new JLabel("labelImagen"/*Aun de prueba*/);
        
        listaMostrarBuscar= new ArrayList();
        lista1= new DefaultListModel();
        sPanelArea= new JScrollPane();
        lista= new JList(lista1);
        sPanelArea.setViewportView(lista);
        
        this.setLayout(new GridLayout(1,2));
        
        btnBuscar= new JButton("Buscar");
        txtBuscar= new JTextField(25);
               
        
        
        lista.addListSelectionListener((ListSelectionEvent e) -> {
            idx = lista.getSelectedIndex();
            
            if (idx != -1){
                /*********Esto son las acciones al precionar en la lista  (Codigo exportado de el proyecto anterior)*********/
                /*
                
                
                descProducto.setText("");
                descProducto.append(listaMostrarBuscar.get(idx).getDescripcion());
                descProducto.append("\nUnidad: $"+listaMostrarBuscar.get(idx).getPrecio1());
                descProducto.append("\n100 to: $"+listaMostrarBuscar.get(idx).getPrecio1()*100);
                descProducto.append("\n1,000:   $"+listaMostrarBuscar.get(idx).getPrecio1()*1000);
                descProducto.append("\nMillar: $"+listaMostrarBuscar.get(idx).getPrecio1()*10000);
                
                if (!listaMostrarBuscar.get(idx).getDirFoto().equals("SinImagen")) {
                    ImageIcon imag= new ImageIcon(listaMostrarBuscar.get(idx).getDirFoto());
                    Icon icono;
                    icono = new ImageIcon(imag.getImage().getScaledInstance(btnImagen.getWidth(), btnImagen.getHeight(), Image.SCALE_DEFAULT));
                    btnImagen.setIcon(icono);
                    btnImagen.setText("");                    
                }else{
                    btnImagen.setText("SinImagen");
                    btnImagen.setIcon(null);
                }
                
                
                */
                
                
            }
            
        });
        
        
        
        
        
        
        
        
        
        
        
        
        /*******Construccion del Panel A  (Izquierda)******/
        panA= new JPanel();
        panA.setLayout(new BorderLayout());
        
        
        //Panel Superior del panel A
        panAa= new JPanel();
        panAa.setBackground(Color.gray);
        panAa.setLayout(new FlowLayout());
        panAa.add(txtBuscar);
        panAa.add(btnBuscar);
        
        
        
        
        //Panel Inferior del Panel A
        panAb= new JPanel();
        panAb.setBackground(Color.gray);
        panAb.setLayout(null);
        panAb.add(sPanelArea);
        sPanelArea.setBounds(10,10, 570, 600);
        
        //Union de los Paneles Aa y Ab
        panA.add(panAa, BorderLayout.NORTH);
        panA.add(panAb, BorderLayout.CENTER);
        
        /********Construccion del Panel B (Derecha)*********/
        panB= new JPanel();
        panB.setLayout(new GridLayout(2,1));

        
        
        //Panel Superior del PanaelB
        panBa= new JPanel();
        panBa.setBackground(Color.WHITE);
        panBa.setLayout(new GridLayout());
        panBa.add(labelImagen);
        
        
        //Panel Inferior del PanelB
        panBb= new JPanel();
        panBb.setLayout(new BorderLayout());
        JPanel aux1,aux2;
        aux1= new JPanel(null);
        aux2= new JPanel(new FlowLayout());
        aux2.add(btnCotizar);
        
        
        
        
        precioMayoreo=new JLabel("Precio Mayoreo ");
        precioMayoreo.setBounds(90, 60, 150, 20);
        precioMenudeo= new JLabel("Precio Menudeo");
        precioMenudeo.setBounds(90, 120, 150, 20);
        piezasMinMayoreo = new JLabel("Piezas Minimo Mayoreo");
        piezasMinMayoreo.setBounds(90, 180, 150, 20);
        pMa= new JLabel("$$$");
        pMa.setBounds(320, 60, 150,20);
        pMe= new JLabel("$$$");
        pMe.setBounds(320, 120, 150, 20);
        pMm= new JLabel("##");
        pMm.setBounds(320, 180, 150, 20);
        
        aux1.add(precioMayoreo);
        aux1.add(precioMenudeo);
        aux1.add(piezasMinMayoreo);
        aux1.add(pMa);
        aux1.add(pMe);
        aux1.add(pMm);
        
        
        panBb.add(aux1, BorderLayout.CENTER);
        panBb.add(aux2, BorderLayout.SOUTH);
        
        
        //Union de los paneles Ba y Bb
        panB.add(panBa);
        panB.add(panBb);
        
        
        /*************Construccion del panel Principal (PanelBusqueda)*********************/
    
        this.add(panA);
        this.add( panB);
        
        
    }
    
    
    
    
}
=======

package bolasdb;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;


public class PanelBusqueda extends JPanel{
    private JScrollPane sPanelArea;
    private JPanel panA, panAa, panAb, panB, panBa, panBb;
    private JButton btnBuscar, btnCotizar;
    private JTextField txtBuscar;
    private JTextArea areaSeleccion;
    private JLabel labelImagen;
    private JList lista;
    private DefaultListModel lista1;
    private ArrayList<Producto> listaMostrarBuscar;
    private int idx;
    
    public PanelBusqueda(){
        super();
        
        
        btnCotizar= new JButton("Cotizar");
        labelImagen= new JLabel("labelImagen"/*Aun de prueba*/);
        
        listaMostrarBuscar= new ArrayList();
        lista1= new DefaultListModel();
        sPanelArea= new JScrollPane();
        lista= new JList(lista1);
        sPanelArea.setViewportView(lista);
        
        this.setLayout(new GridLayout(1,2));
        
        btnBuscar= new JButton("Buscar");
        txtBuscar= new JTextField(25);
               
        
        
        lista.addListSelectionListener((ListSelectionEvent e) -> {
            idx = lista.getSelectedIndex();
            
            if (idx != -1){
                /*********Esto son las acciones al precionar en la lista  (Codigo exportado de el proyecto anterior)*********/
                /*
                
                
                descProducto.setText("");
                descProducto.append(listaMostrarBuscar.get(idx).getDescripcion());
                descProducto.append("\nUnidad: $"+listaMostrarBuscar.get(idx).getPrecio1());
                descProducto.append("\n100 to: $"+listaMostrarBuscar.get(idx).getPrecio1()*100);
                descProducto.append("\n1,000:   $"+listaMostrarBuscar.get(idx).getPrecio1()*1000);
                descProducto.append("\nMillar: $"+listaMostrarBuscar.get(idx).getPrecio1()*10000);
                
                if (!listaMostrarBuscar.get(idx).getDirFoto().equals("SinImagen")) {
                    ImageIcon imag= new ImageIcon(listaMostrarBuscar.get(idx).getDirFoto());
                    Icon icono;
                    icono = new ImageIcon(imag.getImage().getScaledInstance(btnImagen.getWidth(), btnImagen.getHeight(), Image.SCALE_DEFAULT));
                    btnImagen.setIcon(icono);
                    btnImagen.setText("");                    
                }else{
                    btnImagen.setText("SinImagen");
                    btnImagen.setIcon(null);
                }
                
                
                */
                
                
            }
            
        });
        
        
        
        
        
        
        
        
        
        
        
        
        /*******Construccion del Panel A  (Izquierda)******/
        panA= new JPanel();
        panA.setLayout(new BorderLayout());
        
        
        //Panel Superior del panel A
        panAa= new JPanel();
        panAa.setBackground(Color.gray);
        panAa.setLayout(new FlowLayout());
        panAa.add(txtBuscar);
        panAa.add(btnBuscar);
        
        
        
        
        //Panel Inferior del Panel A
        panAb= new JPanel();
        panAb.setBackground(Color.gray);
        panAb.setLayout(null);
        panAb.add(sPanelArea);
        sPanelArea.setBounds(10,10, 570, 600);
        
        //Union de los Paneles Aa y Ab
        panA.add(panAa, BorderLayout.NORTH);
        panA.add(panAb, BorderLayout.CENTER);
        
        /********Construccion del Panel B (Derecha)*********/
        panB= new JPanel();
        panB.setLayout(new GridLayout(2,1));
        
        //Panel Superior del PanaelB
        panBa= new JPanel();
        panBa.setBackground(Color.WHITE);
        panBa.setLayout(new GridLayout());
        panBa.add(labelImagen);
        
        //Panel Inferior del PanelB
        panBb= new JPanel();
        panBb.setLayout(new BorderLayout());
        /*paneles auxiliares para un mejor acomodamiento del panel*/
        JPanel aux1,aux2;
        aux1= new JPanel(null);
        aux2= new JPanel(new FlowLayout());
        aux2.add(btnCotizar);
        
        
        
        
        //Union de los paneles Bay Bb
        panB.add(panBa);
        panB.add(panBb);
        
        
        /*************Construccion del panel Principal (PanelBusqueda)*********************/
    
        this.add(panA);
        this.add( panB);
        
        
    }
    
    
    
}
>>>>>>> 2a661319dafc4877089c721d87f1af5f5523e2c9
