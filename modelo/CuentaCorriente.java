package modelo;

public class CuentaCorriente extends CuentaBancaria
{
    public CuentaCorriente(int Saldo)
    {
        super (Saldo);
    }


    public String toString() 
    {
        return "la informacion de la cuenta es" + "\nTipo de cuenta: Corriente" + "\nSaldo: " + getSaldo() + "\nEste tipo de cuenta no rinde intereses mensuales :(";
    }
}
