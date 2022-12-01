package modelo;

public class Libreta2022 extends CuentaBancaria
{
    public Libreta2022(int Saldo, int Interés)
    {
        super (Saldo);
    }


    public String toString() 
    {
        setInterés(8);
        return "la informacion de la cuenta es" + "\nTipo de cuenta: Libreta 2022" + "\nSaldo: " + getSaldo() + "\nInterés actual: " + getInterés();
    }
}
