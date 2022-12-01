package modelo;

import java.util.ArrayList;

public class CuentaBancaria
{
    protected String NumerodeCuenta;
    protected double saldo;
    protected double interés;

    private ArrayList Cuentas;

    public CuentaBancaria(String pNumerodeCuenta, double Saldo)
    {
        this.NumerodeCuenta = pNumerodeCuenta;
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

    public double getSaldo()
    {
        return saldo;
    }

    public double getInterés()
    {
        return interés;
    }

    public String getNumerodeCuenta()
    {
        return NumerodeCuenta;
    }

    public CuentaBancaria getCuenta(int i)
    {
        return (CuentaBancaria) Cuentas.get(i);
    }

    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }

    public void setInterés(double Interés) 
    {
        this.interés = getSaldo() * (Interés/100);
    }

    public String toString() 
    {
        return "No se tiene informacion actualmente de cuentas bancarias";
    }
}