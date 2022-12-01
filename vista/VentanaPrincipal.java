package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    // Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    public DialogoAgregarCuenta miDialogoAgregarCuenta = null;
    public DialogoConsignacion miDialogoConsignacion = null;
    public DialogoRetirar miDialogoRetirar = null;
    
    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public VentanaPrincipal()
    {
        //Definición del layout de la ventana
        this.setLayout(null);

        
        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,380,190);
        this.add(miPanelEntradaDatos);
        
        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,220,380,120);
        this.add(miPanelOperaciones);
        
        //Creación y adición del PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,350,380,190);
        this.add(miPanelResultados);
        
        

        //Caracteristicas de la ventana
        this.setTitle("Banco");
        this.setSize(400,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    public void crearDialogoAgregarCuenta()
    {
        miDialogoAgregarCuenta = new DialogoAgregarCuenta();
    }

    public void crearDialogoConsignacion()
    {
        miDialogoConsignacion = new DialogoConsignacion(miPanelEntradaDatos.getCuenta());
    }

    public void crearDialogoRetirar()
    {
        miDialogoRetirar = new DialogoRetirar(miPanelEntradaDatos.getCuenta());
    }
}
