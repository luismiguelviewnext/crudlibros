package com.curso.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Libro;
import com.curso.service.LibrosService;

@RestController
public class LibrosController {
    
    @Autowired
    LibrosService service;
    //localhost:8080/libros
    @GetMapping(value ="libros", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Libro> libros(){
        return service.libros();
    }
    //localhost:8080/libros/{isbn}
    @GetMapping(value ="libro/{isbn}", produces=MediaType.APPLICATION_JSON_VALUE)
    public Libro buscarLibro(@PathVariable("isbn")int isbn){
        return service.buscarLibro(isbn);
    }
    //localhost:8080/libro
    @PostMapping(value ="libro", consumes=MediaType.APPLICATION_JSON_VALUE)
    public void agregar(@RequestBody Libro libro){
        service.altaLibro(libro);   
    }
    //localhost:8080/libro
    @PutMapping(value="libro", consumes=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Libro> actualizar(@RequestBody Libro libro){
        service.actualizarLibro(libro);
        return new ResponseEntity<>(libro, HttpStatus.CREATED);
    }
    //localhost:8080/libro/{isbn}
    @DeleteMapping(value="libro/{isbn}", produces=MediaType.APPLICATION_JSON_VALUE)
    public List <Libro> eliminar(@PathVariable("isbn")int isbn){
        return service.eliminarLibro(isbn);
    }




    
}
