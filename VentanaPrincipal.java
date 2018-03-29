
package bolasdb;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class VentanaPrincipal extends JFrame{
    private JPanel panelPrincipal, panelMenu;
    private JButton inicio, buscar, productos, clientes, cotizaciones, recordatorios, ayuda;
    
    
    public VentanaPrincipal(){
        super("Creativos");
        this.setSize(1300, 700);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelMenu= new JPanel();
        panelMenu.setBackground(Color.black);
        panelPrincipal=new JPanel();
        panelPrincipal.setBackground(Color.white);
        
        this.setLayout(new BorderLayout());
        this.add(panelMenu, BorderLayout.WEST);
        this.add(panelPrincipal, BorderLayout.CENTER);
        inicio= new JButton("Inicio");
        buscar= new JButton("Buscar");
        productos= new JButton("Productos");
        clientes= new JButton("Clientes");
        cotizaciones= new JButton("Cotizaciones");
        recordatorios= new JButton("Recordatorios");
        ayuda= new JButton("Ayuda");
        
        
        
        
        
        
        
    
    
    }
    
    
    
    
    
    
    
    
}
