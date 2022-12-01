package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbCuentas;
    private JComboBox JCCuentas;

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        lbCuentas = new JLabel("Cuentas: ", JLabel.RIGHT);
        lbCuentas.setBounds(0,90,100,20);
        this.add(lbCuentas);

        JCCuentas = new JComboBox();
        JCCuentas.setBounds(100,90,260,20);
        this.add(JCCuentas);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Cuentas Bancarias");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    //Metodos de acceso
    public String getCuenta()
    {
        return (String) JCCuentas.getSelectedItem();
    }

    public int getIndexCuenta()
    {
        return JCCuentas.getSelectedIndex();
    }

    public void setCuenta(String cuenta)
    {
        JCCuentas.addItem(cuenta);
    }
}
