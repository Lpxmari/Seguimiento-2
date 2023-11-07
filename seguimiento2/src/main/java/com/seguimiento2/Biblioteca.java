package com.seguimiento2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca implements Prestamo {
    private List<Libro> libros;
    private List<Cliente> clientes;
    private List<PrestamoRegistro> registros;

    public Biblioteca() {
        libros = new ArrayList<>();
        clientes = new ArrayList<>();
        registros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    
    public List<Libro> buscarLibrosPorTitulo(String titulo) {
        return libros.stream()
                .filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo))
                .collect(Collectors.<Libro>toList());
    }
    

    public List<Libro> buscarLibrosPorAutor(String autor) {
        return libros.stream()
                .filter(libro -> libro.getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toList());
    }

    public List<PrestamoRegistro> obtenerPrestamosPorLibro(Libro libro) {
        return registros.stream()
                .filter(prestamo -> prestamo.getLibro() == libro)
                .collect(Collectors.toList());
    }
}
