package com.example.Parcial.Controller;

import com.example.Parcial.Model.Autor;
import com.example.Parcial.Service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor> listarTodos() {
        return autorService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Autor> obtenerPorId(@PathVariable Long id) {
        return autorService.obtenerPorId(id);
    }

    @PostMapping
    public Autor guardar(@RequestBody Autor autor) {
        return autorService.guardar(autor);
    }

    @PutMapping("/{id}")
    public Autor actualizar(@PathVariable Long id, @RequestBody Autor autor) {
        return autorService.actualizar(id, autor);
    }

    @DeleteMapping("/{id}")
    public boolean borrar(@PathVariable Long id) {
        return autorService.borrar(id);
    }
}
