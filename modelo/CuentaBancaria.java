package modelo;

import java.util.ArrayList;

public class CuentaBancaria
{
    protected int saldo;
    protected int interés;

    private ArrayList Cuentas;

    public CuentaBancaria(int Saldo)
    {
        this.saldo = Saldo;
        this.interés = 0;
        Cuentas = new ArrayList();
    }

    public void agregarCuenta1(CuentaCorriente cuentaCorr)
    {
        Cuentas.add(cuentaCorr);
    }

    public void agregarCuenta2(CuentaAhorros cuentaAhorr)
    {
        Cuentas.add(cuentaAhorr);
    }

    public void agregarCuenta3(Libreta2022 libreta)
    {
        Cuentas.add(libreta);
    }

    public int getSaldo()
    {
        return saldo;
    }

    public int getInterés()
    {
        return interés;
    }

    public CuentaBancaria getCuenta(int i)
    {
        return (CuentaBancaria) Cuentas.get(i);
    }

    public void setSaldo(int saldo) 
    {
        this.saldo = saldo;
    }

    public void setInterés(int Interés) 
    {
        this.interés = getSaldo() * (Interés/100);
    }

    public String toString() 
    {
        return "No se tiene informacion actualmente de cuentas bancarias";
    }
}