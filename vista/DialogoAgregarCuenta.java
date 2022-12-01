package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;


public class DialogoAgregarCuenta extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbNumerodeCuenta;
    private JTextField tfNumerodeCuenta;
    private JLabel lbSaldodelaCuenta;
    private JTextField tfSaldodelaCuenta;
    private JButton btAgregarCuenta;
    private JLabel lbTipodeCuenta;
    private JComboBox JCTipodeCuenta;

    //----------------------
    // Metodos
    //----------------------
    public DialogoAgregarCuenta()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar elementos
        lbNumerodeCuenta = new JLabel("Numero de su Cuenta: ");
        lbNumerodeCuenta.setBounds(10,50,140,20);
        this.add(lbNumerodeCuenta);

        tfNumerodeCuenta = new JTextField();
        tfNumerodeCuenta.setBounds(150,50,100, 25);
        this.add(tfNumerodeCuenta);

        lbTipodeCuenta = new JLabel("Tipo de Cuenta: ", JLabel.RIGHT);
        lbTipodeCuenta.setBounds(10,90,100,30);
        this.add(lbTipodeCuenta);

        String[] tipodeCuentas = {"Cuenta Corriente", "Cuenta Ahorros", "Libreta 2022"};
        JCTipodeCuenta = new JComboBox(tipodeCuentas);
        JCTipodeCuenta.setBounds(150,90,260,20);
        this.add(JCTipodeCuenta);

        lbSaldodelaCuenta = new JLabel("Saldo inicial: ", JLabel.RIGHT);
        lbSaldodelaCuenta.setBounds(10,130,100,30);
        this.add(lbSaldodelaCuenta);

        tfSaldodelaCuenta = new JTextField();
        tfSaldodelaCuenta.setBounds(150,130,100, 25);
        this.add(tfSaldodelaCuenta);

        btAgregarCuenta = new JButton("Agregar");
        btAgregarCuenta.setBounds(20,140,260,25);
        btAgregarCuenta.setActionCommand("agregar");
        this.add(btAgregarCuenta);

        //Caracteristicas de la ventana
        this.setTitle("Agregar Cuenta");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    public String getNumerodeCuenta()
    {
        return tfNumerodeCuenta.getText();
    }

    public String getSaldodelaCuenta()
    {
        return tfSaldodelaCuenta.getText();
    }

    public int getIndexCuenta()
    {
        return JCTipodeCuenta.getSelectedIndex();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btAgregarCuenta.addActionListener(pAL);
    }

    public void cerrarDialogoAgregarCuenta()
    {
        this.dispose();
    }
}
