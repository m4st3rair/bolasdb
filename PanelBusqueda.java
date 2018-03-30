
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
    private JButton btnBuscar;
    private JTextField txtBuscar;
    private JTextArea areaSeleccion;
    private JLabel labelImagen;
    private JList lista;
    private DefaultListModel lista1;
    private ArrayList<Producto> listaMostrarBuscar;
    private int idx;
    
    public PanelBusqueda(){
        super();
        
        
        listaMostrarBuscar= new ArrayList();
        lista1= new DefaultListModel();
        sPanelArea= new JScrollPane();
        lista= new JList(lista1);
        sPanelArea.setViewportView(lista);
        
        this.setLayout(new GridLayout(1,2));
        
        btnBuscar= new JButton("Buscar");
        txtBuscar= new JTextField(20);
        
        
        
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
        panBa= new JPanel();
        panBb= new JPanel();
        
        /*************Construccion del panel Principal (PanelBusqueda)*********************/
    
        this.add(panA);
        this.add( panB);
        
        
    }
    
    
    
}
