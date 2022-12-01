package modelo;

public class CuentaAhorros extends CuentaBancaria
{
    public CuentaAhorros(int Saldo)
    {
        super (Saldo);
    }


    public String toString() 
    {
        setInterés(4);
        return "la informacion de la cuenta es" + "\nTipo de cuenta: Ahorros" + "\nSaldo: " + getSaldo() + "\nInterés actual: " + getInterés();
    }
}
