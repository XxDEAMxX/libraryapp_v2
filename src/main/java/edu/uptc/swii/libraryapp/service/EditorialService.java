package edu.uptc.swii.libraryapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.uptc.swii.libraryapp.domain.Editorial;
import edu.uptc.swii.libraryapp.repository.EditorialRepository;

@Service
public class EditorialService {
    private final EditorialRepository editorialRepository;

    public EditorialService(EditorialRepository editorialRepository) {
        this.editorialRepository = editorialRepository;
    }

    public List<Editorial> buscarTodos() {
        return editorialRepository.findAll();
    }

    public Editorial buscarPorId(int id) {
        return editorialRepository.findById(id).orElse(null);
    }
    
}
