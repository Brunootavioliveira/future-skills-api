package com.fiap.global_solution_app.repository;

import com.fiap.global_solution_app.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}

