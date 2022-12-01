package modelo;

public class Libreta2022 extends CuentaBancaria
{
    private int TipodeCuenta = 3;
    public Libreta2022(String NumerodeCuenta, double Saldo)
    {
        super(NumerodeCuenta, Saldo);
    }

    public int getTipo()
    {
        return TipodeCuenta;
    }


    public String toString() 
    {
        setInterés(8);
        return "la informacion de la cuenta es" + "\nTipo de cuenta: Libreta 2022" + "\nNumero de la cuenta: " + NumerodeCuenta +  "\nSaldo: " + getSaldo() + "\nInterés actual: " + getInterés();
    }
}
