package com.example.Parcial.Repository;

import com.example.Parcial.Model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {


    @Query(value = "SELECT l.Titulo AS TituloLibro, l.Año_Publicacion, l.ISBN, " +
            "g.Nombre AS NombreGenero " +
            "FROM libros l " +
            "INNER JOIN generos g ON l.ID_Genero = g.ID_Genero", nativeQuery = true)
    List<Object[]> findBooksWithGenres();
}
