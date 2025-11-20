package com.fiap.global_solution_app.service;

import com.fiap.global_solution_app.entity.Trilha;
import com.fiap.global_solution_app.exception.ResourceNotFoundException;
import com.fiap.global_solution_app.repository.TrilhaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TrilhaService {

    private final TrilhaRepository repository;

    public TrilhaService(TrilhaRepository repository) {
        this.repository = repository;
    }

    public Trilha salvar(Trilha trilha) {
        return repository.save(trilha);
    }

    public List<Trilha> listar() {
        return repository.findAll();
    }

    public Trilha buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Trilha não encontrada"));
    }

    public Trilha atualizar(Long id, Trilha trilhaAtualizada) {
        Trilha existente = buscarPorId(id);
        existente.setNome(trilhaAtualizada.getNome());
        existente.setDescricao(trilhaAtualizada.getDescricao());
        existente.setAreaFoco(trilhaAtualizada.getAreaFoco());
        return repository.save(existente);
    }

    public void remover(Long id) {
        repository.delete(buscarPorId(id));
    }
}

