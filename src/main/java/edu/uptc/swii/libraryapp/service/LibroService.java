package edu.uptc.swii.libraryapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.uptc.swii.libraryapp.domain.Libro;
import edu.uptc.swii.libraryapp.repository.LibroRepository;

@Service
public class LibroService {

    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }
    
    public List<Libro> buscarDestacados() {
        return libroRepository.buscarTodos();
    }

    public List<Libro> buscarPorEditorial(int idEditorial) {
        return libroRepository.buscarPorEditorial(idEditorial);
    }

    public void deleteLibro(int id){libroRepository.deleteById(id);}    

    public List<Libro> buscar(String consulta){return libroRepository.buscar(consulta);}    

    public void guardar(Libro libro) {
        libroRepository.save(libro);
    }
}