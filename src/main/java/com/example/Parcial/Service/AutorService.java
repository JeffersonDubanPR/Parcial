package com.example.Parcial.Service;

import com.example.Parcial.Model.Autor;
import com.example.Parcial.Repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> listarTodos() {
        return autorRepository.findAll();
    }

    public Optional<Autor> obtenerPorId(Long id) {
        return autorRepository.findById(id);
    }

    public Autor guardar(Autor autor) {
        return autorRepository.save(autor);
    }

    public Autor actualizar(Long id, Autor autor) {
        if (autorRepository.existsById(id)) {
            autor.setIdAutor(id.intValue());
            return autorRepository.save(autor);
        }
        return null;
    }

    public boolean borrar(Long id) {
        if (autorRepository.existsById(id)) {
            autorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
