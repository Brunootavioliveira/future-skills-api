package com.fiap.global_solution_app.service;

import com.fiap.global_solution_app.entity.Usuario;
import com.fiap.global_solution_app.exception.ResourceNotFoundException;
import com.fiap.global_solution_app.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

    public List<Usuario> listar() {
        return repository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado"));
    }

    public Usuario atualizar(Long id, Usuario usuarioAtualizado) {
        Usuario existente = buscarPorId(id);
        existente.setNome(usuarioAtualizado.getNome());
        existente.setEmail(usuarioAtualizado.getEmail());
        existente.setProfissao(usuarioAtualizado.getProfissao());
        return repository.save(existente);
    }

    public void remover(Long id) {
        repository.delete(buscarPorId(id));
    }
}

