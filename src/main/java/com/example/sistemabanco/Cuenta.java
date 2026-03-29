package com.example.sistemabanco;

public class Cuenta {
    private String usuario;
    private String contrasena;
    private double saldo;

    public Cuenta(String usuario, String contrasena, double saldo) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.saldo = saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto > saldo) return false;
        this.saldo -= monto;
        return true;
    }
}
