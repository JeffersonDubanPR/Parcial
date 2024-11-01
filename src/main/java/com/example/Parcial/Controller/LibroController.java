package com.example.Parcial.Controller;

import com.example.Parcial.Model.Libro;
import com.example.Parcial.Service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> listarTodos() {
        return libroService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Libro> obtenerPorId(@PathVariable Long id) {
        return libroService.obtenerPorId(id);
    }

    @PostMapping
    public Libro guardar(@RequestBody Libro libro) {
        return libroService.guardar(libro);
    }

    @PutMapping("/{id}")
    public Libro actualizar(@PathVariable Long id, @RequestBody Libro libro) {
        return libroService.actualizar(id, libro);
    }

    @DeleteMapping("/{id}")
    public boolean borrar(@PathVariable Long id) {
        return libroService.borrar(id);
    }


    @GetMapping("/detalles/generos")
    public List<Object[]> obtenerLibrosConGeneros() {
        return libroService.obtenerLibrosConGeneros();
    }


}