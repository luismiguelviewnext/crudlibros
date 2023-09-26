package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.model.Libro;

@Service
public class LibrosServiceImpl implements LibrosService{

    List <Libro> libros;

    public LibrosServiceImpl() {
        libros = new ArrayList<>();
        libros.add(new Libro(111, "Java 17", "programación"));
        libros.add(new Libro(022, "Java 18", "programación"));
        libros.add(new Libro(023, "Windows", "sistemas"));
        libros.add(new Libro(025, "Java 19", "programación"));
        libros.add(new Libro(020, "Linux", "sistemas"));

    }

    @Override
    public List<Libro> libros() {
        return libros;
    }

    @Override
    public Libro buscarLibro(int isbn) {
        return libros.stream()
        .filter(libro -> libro.getIsbn() == isbn)
        .findFirst()
        .orElse(null); // Retorna null si no encuentra el libro con el ISBN dado.
    }

    @Override
    public void altaLibro(Libro libro) {
      // Elimina un libro existente con el mismo ISBN antes de añadir el nuevo.
      libros.removeIf(l -> l.getIsbn() == libro.getIsbn());
      libros.add(libro);
    }

    @Override
    public void actualizarLibro(Libro libro) {
         // Primero, elimina el libro existente con el mismo ISBN, luego añade el libro actualizado.
         libros.removeIf(l -> l.getIsbn() == libro.getIsbn());
         libros.add(libro);
    }

    @Override
    public List<Libro> eliminarLibro(int isbn) {
        libros.removeIf(libro -> libro.getIsbn() == isbn); // Elimina todos los libros con el ISBN dado.
        return new ArrayList<>(libros); // Devuelve una copia de la lista actualizada.
    }
    
    
}
