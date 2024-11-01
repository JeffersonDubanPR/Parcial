package com.example.Parcial.Controller;

import com.example.Parcial.Model.Prestamo;
import com.example.Parcial.Service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoService prestamoService;

    @GetMapping
    public List<Prestamo> listarTodos() {

        return prestamoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Prestamo> obtenerPorId(@PathVariable Long id) {

        return prestamoService.obtenerPorId(id);
    }

    @PostMapping
    public Prestamo guardar(@RequestBody Prestamo prestamo) {

        return prestamoService.guardar(prestamo);
    }

    @PutMapping("/{id}")
    public Prestamo actualizar(@PathVariable Long id, @RequestBody Prestamo prestamo) {
        return prestamoService.actualizar(id, prestamo);
    }

    @DeleteMapping("/{id}")
    public boolean borrar(@PathVariable Long id) {

        return prestamoService.borrar(id);
    }

    @GetMapping("/detalles/clientes-libros-generos")
    public List<Object[]> obtenerDetallesClientesLibrosGeneros() {
        return prestamoService.obtenerDetallesClientesLibrosGeneros();
    }



}
