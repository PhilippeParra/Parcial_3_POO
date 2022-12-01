package modelo;

public class CuentaAhorros extends CuentaBancaria
{
    private int TipodeCuenta = 2;
    public CuentaAhorros(String NumerodeCuenta, double Saldo)
    {
        super(NumerodeCuenta, Saldo);
    }

    public int getTipo()
    {
        return TipodeCuenta;
    }

    public String toString() 
    {
        setInterés(4);
        return "la informacion de la cuenta es" + "\nTipo de cuenta: Ahorros" + "\nNumero de la cuenta: " + NumerodeCuenta + "\nSaldo: " + getSaldo() + "\nInterés actual: " + getInterés();
    }
}
