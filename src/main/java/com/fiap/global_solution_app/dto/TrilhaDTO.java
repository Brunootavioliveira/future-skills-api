package com.fiap.global_solution_app.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TrilhaDTO {

    @NotBlank(message = "Nome da trilha é obrigatório")
    @Size(max = 150, message = "Nome deve ter no máximo 150 caracteres")
    private String nome;

    @NotBlank(message = "Descrição é obrigatória")
    @Size(max = 500, message = "Descrição muito longa")
    private String descricao;

    @NotBlank(message = "Área de foco é obrigatória")
    @Size(max = 80, message = "Área de foco deve ter no máximo 80 caracteres")
    private String areaFoco;
}

