package controlador;

import modelo.CuentaBancaria;
import modelo.CuentaCorriente;
import modelo.CuentaAhorros;
import modelo.Libreta2022;
import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private CuentaBancaria Banco;

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, CuentaBancaria pBanco)
    {
        this.venPrin = pVenPrin;
        this.Banco = pBanco;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("App lista para usar...");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        if(comando.equals("agregarCuenta"))
        {
            venPrin.crearDialogoAgregarCuenta();
            this.venPrin.miDialogoAgregarCuenta.agregarOyenteBoton(this);
        }

        if(comando.equals("agregar"))
        {
            String numero = venPrin.miDialogoAgregarCuenta.getNumerodeCuenta();
            double saldo = Double.parseDouble(venPrin.miDialogoAgregarCuenta.getSaldodelaCuenta());
            if (venPrin.miDialogoAgregarCuenta.getIndexCuenta() == 1)
            {
                Banco.agregarCuenta1(new CuentaCorriente(numero , saldo));
            }
            else if (venPrin.miDialogoAgregarCuenta.getIndexCuenta() == 2)
            {
                Banco.agregarCuenta2(new CuentaAhorros(numero , saldo));
            }
            else if (venPrin.miDialogoAgregarCuenta.getIndexCuenta() == 3)
            {
                Banco.agregarCuenta3(new Libreta2022(numero , saldo));
            }
            
            venPrin.miPanelEntradaDatos.setCuenta(numero);
            venPrin.miPanelResultados.mostrarResultado("Se ha agreado una nueva cuenta. \nNumero: " + numero);
            venPrin.miDialogoAgregarCuenta.cerrarDialogoAgregarCuenta();
        }

        if(comando.equals("Consignar"))
        {
            venPrin.crearDialogoConsignacion();
            this.venPrin.miDialogoConsignacion.agregarOyenteBoton(this);
        }

        if(comando.equals("consignar1"))
        {
            int indexCuenta = venPrin.miPanelEntradaDatos.getIndexCuenta();

            double consignacion = Double.parseDouble(venPrin.miDialogoConsignacion.getValoraConsignar());

            CuentaBancaria cuenta = Banco.getCuenta(indexCuenta);
            cuenta.setSaldo(cuenta.getSaldo() + consignacion);

            venPrin.miPanelResultados.mostrarResultado("La cuenta: " + cuenta.getNumerodeCuenta() + " ha consignado\nValor: " + consignacion);
            venPrin.miDialogoConsignacion.cerrarDialogoConsignacion();
        }

        if(comando.equals("Retirar"))
        {
            int indexCuenta = venPrin.miPanelEntradaDatos.getIndexCuenta();

            double Retiro = Double.parseDouble(venPrin.miDialogoRetirar.getValoraRetirar());

            CuentaBancaria cuenta = Banco.getCuenta(indexCuenta);
            cuenta.setSaldo(cuenta.getSaldo() - Retiro);

            int tipodecuenta = Banco.cuenta.getTipo();

            if (tipodecuenta == 3)
            {
                double Retiro1 = Retiro - (Retiro * (2/100));
            }

            venPrin.miPanelResultados.mostrarResultado("La cuenta: " + cuenta.getNumerodeCuenta() + " ha Retirado\nValor: " + Retiro);
            venPrin.miDialogoConsignacion.cerrarDialogoConsignacion();        }

        


        //Salir
        if(comando.equals("salir"))
        {
            System.exit(0);
        }  
    }
}
