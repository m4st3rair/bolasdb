
package bolasdb;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class VentanaPrincipal extends JFrame implements ActionListener{
    private JPanel panelPrincipal, panelMenu;
    private JButton[] botoneraMenu;
    private PanelBusqueda panelbusqueda;
    
    
      
    public VentanaPrincipal(){
        super("Creativos");
        //[ancho][largo]
        //700*60 panel menu
        //700* 640 panel Principal
        
        
        
        this.setSize(1300, 700);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelMenu= new JPanel();
        
        panelMenu.setBackground(Color.black);
        panelPrincipal=new JPanel();
        panelPrincipal.setBackground(Color.white);
        panelPrincipal.setLayout(new GridLayout());
        
        panelbusqueda= new PanelBusqueda();
        
        
        
        
        botoneraMenu= new JButton[7];
        
        
        for (int i = 0; i < 7; i++) {
            botoneraMenu[i]= new JButton();
            botoneraMenu[i].addActionListener(this);
            botoneraMenu[i].setActionCommand(""+i);
            
            botoneraMenu[i].setBackground(Color.white);
            ImageIcon imag= new ImageIcon("D:\\iconosDB\\"+(i+1)+".png");
            Icon icono = new ImageIcon(imag.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
            botoneraMenu[i].setIcon(icono);
            panelMenu.add(botoneraMenu[i]);
            //botoneraMenu[i].setBounds(50, 50, 5, 5+(50*i));
            
        }
        
        
        
        
        

        
        
        
        
        
        this.setLayout(null);
        panelMenu.setBounds(0, 0, 90, 700);
        panelPrincipal.setBounds(90, 0, 1200, 660);
        this.add(panelMenu);
        this.add(panelPrincipal);
        
        
        panelMenu.setLayout(new FlowLayout());
        
        //panelMenu.repaint();
        
        
        this.setVisible(true);
        
        
        
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       switch(ae.getActionCommand()){
            case "0": //INICO 
                System.out.println("Regresar a La vista Principal");
                panelPrincipal.remove(panelbusqueda);
                panelPrincipal.updateUI();//Se utiliza para refrezcar el contenido del panel y asi muetre el panel recien agregado
            
            break;
           case "1"://BUSCAR
                panelPrincipal.add(panelbusqueda);// se añade el panel de la busqueda (aun sin terminar)
                panelPrincipal.updateUI();//Se utiliza para refrezcar el contenido del panel y asi muetre el panel recien agregado
            
            break;
           case "2"://ALMACEN(PRODUCTOS)
            
            break;
           case "3"://PERSONAS
            
            break;
           case "4"://COTIZACION
            
            break;
           case "5"://RECORDATORIOS
            
            break;
           case "6"://AYUDA
            
            break;
           
       } 
        
        
    }
    
    
    
    
    
    
    
    
}
