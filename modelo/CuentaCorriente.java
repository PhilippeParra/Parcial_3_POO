package modelo;

public class CuentaCorriente extends CuentaBancaria
{
    private int TipodeCuenta = 1;
    public CuentaCorriente(String NumerodeCuenta, double Saldo)
    {
        super(NumerodeCuenta, Saldo);
    }

    public int getTipo()
    {
        return TipodeCuenta;
    }


    public String toString() 
    {
        return "la informacion de la cuenta es" + "\nTipo de cuenta: Corriente" + "\nNumero de la cuenta: " + NumerodeCuenta +  "\nSaldo: " + getSaldo() + "\nEste tipo de cuenta no rinde intereses mensuales :(";
    }
}
