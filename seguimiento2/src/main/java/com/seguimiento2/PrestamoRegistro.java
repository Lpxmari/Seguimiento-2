package com.seguimiento2;

public class PrestamoRegistro {
    private Libro libro;
    private Cliente cliente;

    public PrestamoRegistro(Libro libro, Cliente cliente) {
        this.libro = libro;
        this.cliente = cliente;
    }

    public Libro getLibro() {
        return libro;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
