package edu.uptc.swii.libraryapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.uptc.swii.libraryapp.domain.Libro;
import edu.uptc.swii.libraryapp.service.LibroService;


@Controller
public class ListadoController {
    private final LibroService libroService;

    public ListadoController(LibroService libroService) {
        this.libroService = libroService;
    }

    @RequestMapping("/")
    public String listarLibros(Model model) {
        List<Libro> libros = libroService.buscarDestacados();
        model.addAttribute("libros", libros);
        return "listado";
    }

    @RequestMapping("/librosPorEditorial")
    public String ListarLibrosPorEditorial(int idEditorial, Model model) {
        List<Libro> libros = libroService.buscarPorEditorial(idEditorial);
        model.addAttribute("libros", libros);
        return "listado";
    }
    
    @RequestMapping(value = "/buscar")
    public String buscar(String consulta, Model model) {
        List<Libro> libros = libroService.buscar(consulta);
        model.addAttribute("libros", libros);
        return "listado";
    }
}