package com.fiap.global_solution_app.controller;

import com.fiap.global_solution_app.entity.Trilha;
import com.fiap.global_solution_app.service.TrilhaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Trilhas", description = "CRUD de trilhas educacionais")
@RestController
@RequestMapping("/api/trilhas")
public class TrilhaController {

    private final TrilhaService service;

    public TrilhaController(TrilhaService service) {
        this.service = service;
    }

    @Operation(summary = "Criar nova trilha")
    @PostMapping
    public ResponseEntity<Trilha> criar(@Valid @RequestBody Trilha trilha) {
        return ResponseEntity.status(201).body(service.salvar(trilha));
    }

    @Operation(summary = "Listar todas as trilhas")
    @GetMapping
    public List<Trilha> listar() {
        return service.listar();
    }

    @Operation(summary = "Buscar trilha por ID")
    @GetMapping("/{id}")
    public Trilha buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @Operation(summary = "Atualizar trilha existente")
    @PutMapping("/{id}")
    public Trilha atualizar(@PathVariable Long id, @Valid @RequestBody Trilha trilha) {
        return service.atualizar(id, trilha);
    }

    @Operation(summary = "Deletar trilha")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }
}
