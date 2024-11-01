package com.example.Parcial.Controller;

import com.example.Parcial.Model.Genero;
import com.example.Parcial.Service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/generos")
public class GeneroController {

    @Autowired
    private GeneroService generoService;

    @GetMapping
    public List<Genero> listarTodos() {
        return generoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Genero> obtenerPorId(@PathVariable Long id) {
        return generoService.obtenerPorId(id);
    }

    @PostMapping
    public Genero guardar(@RequestBody Genero genero) {
        return generoService.guardar(genero);
    }

    @PutMapping("/{id}")
    public Genero actualizar(@PathVariable Long id, @RequestBody Genero genero) {
        return generoService.actualizar(id, genero);
    }

    @DeleteMapping("/{id}")
    public boolean borrar(@PathVariable Long id) {
        return generoService.borrar(id);
    }
}
