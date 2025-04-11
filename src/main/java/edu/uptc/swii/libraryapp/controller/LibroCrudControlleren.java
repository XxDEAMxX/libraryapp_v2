package edu.uptc.swii.libraryapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import edu.uptc.swii.libraryapp.service.EditorialService;
import edu.uptc.swii.libraryapp.service.LibroService;

import org.springframework.web.bind.annotation.RequestMapping;

import edu.uptc.swii.libraryapp.domain.Libro;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class LibroCrudControlleren {
    private final EditorialService editorialService;
    private final LibroService libroService;

    public LibroCrudControlleren(EditorialService editorialService, LibroService libroService) {
        this.editorialService = editorialService;
        this.libroService = libroService;
    }

    @RequestMapping("/libros/crear")
    public String mostrarFormAlta(Model model) {
        model.addAttribute("editoriales", editorialService.buscarTodos());
        model.addAttribute("libro", new Libro());
        return "formLibro";
    }

    @PostMapping("/libros/guardar")
    public String guardar(Libro libro) {
        libroService.guardar(libro);
        return "redirect:/";
    }
    
}
