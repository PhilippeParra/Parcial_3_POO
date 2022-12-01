package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class DialogoRetirar extends JDialog
{
    private JLabel lbValoraRetirar;
    private JLabel lbnumerodeCuenta;
    private JTextField tfValoraRetirar;
    private JButton btRetirar;


    public DialogoRetirar(String numero)
    {
        this.setLayout(null);

        lbnumerodeCuenta = new JLabel("Numero de la cuenta: " + numero , JLabel.CENTER);
        lbnumerodeCuenta.setBounds(10,20,140,20);
        this.add(lbnumerodeCuenta);

        lbValoraRetirar = new JLabel("Valor a Retirar: ");
        lbValoraRetirar.setBounds(10,50,140,25);
        this.add(lbValoraRetirar);

        tfValoraRetirar = new JTextField();
        tfValoraRetirar.setBounds(150,50,100, 25);
        this.add(tfValoraRetirar);

        btRetirar = new JButton("Retirar");
        btRetirar.setBounds(20,140,260,25);
        btRetirar.setActionCommand("Retirar");
        this.add(btRetirar);

        //Caracteristicas de la ventana
        this.setTitle("Retiros");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    public String getValoraRetirar()
    {
        return tfValoraRetirar.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btRetirar.addActionListener(pAL);
    }

    public void cerrarDialogoRetirar()
    {
        this.dispose();
    }

}