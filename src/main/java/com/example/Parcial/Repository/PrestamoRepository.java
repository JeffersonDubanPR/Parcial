package com.example.Parcial.Repository;

import com.example.Parcial.Model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {

    @Query(value = "SELECT c.Nombre AS NombreCliente, c.Apellido AS ApellidoCliente, c.Email AS EmailCliente, " +
            "l.Titulo AS TituloLibro, a.Nombre AS NombreAutor, a.Apellido AS ApellidoAutor, " +
            "g.Nombre AS NombreGenero, p.Fecha_Prestamo AS FechaPrestamo, " +
            "p.Fecha_Devolucion AS FechaDevolucion " +
            "FROM prestamos p " +
            "INNER JOIN clientes c ON p.ID_Cliente = c.ID_Cliente " +
            "INNER JOIN libros l ON p.ID_Libro = l.ID_Libro " +
            "INNER JOIN autores a ON l.ID_Autor = a.ID_Autor " +
            "INNER JOIN generos g ON l.ID_Genero = g.ID_Genero", nativeQuery = true)
    List<Object[]> findAllClientBookAuthorGenreDetails();

}
