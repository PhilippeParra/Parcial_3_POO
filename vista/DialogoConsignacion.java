package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class DialogoConsignacion extends JDialog
{
    private JLabel lbValoraConsignar;
    private JLabel lbnumerodeCuenta;
    private JTextField tfValoraConsignar;
    private JButton btConsignar;


    public DialogoConsignacion(String numero)
    {
        this.setLayout(null);

        lbnumerodeCuenta = new JLabel("Numero de la cuenta: " + numero , JLabel.CENTER);
        lbnumerodeCuenta.setBounds(10,20,140,20);
        this.add(lbnumerodeCuenta);

        lbValoraConsignar = new JLabel("Valor a Consignar: ");
        lbValoraConsignar.setBounds(10,50,140,25);
        this.add(lbValoraConsignar);

        tfValoraConsignar = new JTextField();
        tfValoraConsignar.setBounds(150,50,100, 25);
        this.add(tfValoraConsignar);

        btConsignar = new JButton("Consignar");
        btConsignar.setBounds(20,140,260,25);
        btConsignar.setActionCommand("Consignar1");
        this.add(btConsignar);

        //Caracteristicas de la ventana
        this.setTitle("Consignaciones");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    public String getValoraConsignar()
    {
        return tfValoraConsignar.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btConsignar.addActionListener(pAL);
    }

    public void cerrarDialogoConsignacion()
    {
        this.dispose();
    }

}
