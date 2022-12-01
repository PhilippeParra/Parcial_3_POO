package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btAgregarCuenta;
    private JButton btConsignar;
    private JButton btRetirar;
    private JButton btInformacion;
    private JButton btSalir;

    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        btAgregarCuenta = new JButton("Agregar Cuenta");
        btAgregarCuenta.setBounds(10,20,170,20);
        btAgregarCuenta.setActionCommand("agregarCuenta");
        this.add(btAgregarCuenta);

        btConsignar = new JButton("Consignar");
        btConsignar.setBounds(10,50,170,20); 
        btConsignar.setActionCommand("Consignar");
        this.add(btConsignar);

        btRetirar = new JButton("Retirar");
        btRetirar.setBounds(10,80,170,20);
        btRetirar.setActionCommand("Retirar");
        this.add(btRetirar);

        btInformacion = new JButton("Informacion");
        btInformacion.setBounds(190,20,170,20); 
        btInformacion.setActionCommand("Informacion");
        this.add(btInformacion);

        //Crear y agregar boton Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(190,50,170,20); 
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAgregarCuenta.addActionListener(pAL);
        btConsignar.addActionListener(pAL);
        btRetirar.addActionListener(pAL);
        btInformacion.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }


}
