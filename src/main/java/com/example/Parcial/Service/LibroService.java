package com.example.Parcial.Service;

import com.example.Parcial.Model.Libro;
import com.example.Parcial.Repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> listarTodos() {
        return libroRepository.findAll();
    }

    public Optional<Libro> obtenerPorId(Long id) {
        return libroRepository.findById(id);
    }

    public Libro guardar(Libro libro) {
        return libroRepository.save(libro);
    }

    public Libro actualizar(Long id, Libro libro) {
        if (libroRepository.existsById(id)) {
            libro.setIdLibro(id.intValue());
            return libroRepository.save(libro);
        }
        return null;
    }

    public boolean borrar(Long id) {
        if (libroRepository.existsById(id)) {
            libroRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Object[]> obtenerLibrosConGeneros() {
        return libroRepository.findBooksWithGenres();
    }


}
