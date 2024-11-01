package com.example.Parcial.Service;

import com.example.Parcial.Model.Genero;
import com.example.Parcial.Repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository generoRepository;

    public List<Genero> listarTodos() {
        return generoRepository.findAll();
    }

    public Optional<Genero> obtenerPorId(Long id) {
        return generoRepository.findById(id);
    }

    public Genero guardar(Genero genero) {
        return generoRepository.save(genero);
    }

    public Genero actualizar(Long id, Genero genero) {
        if (generoRepository.existsById(id)) {
            genero.setIdGenero(id.intValue());
            return generoRepository.save(genero);
        }
        return null;
    }

    public boolean borrar(Long id) {
        if (generoRepository.existsById(id)) {
            generoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
