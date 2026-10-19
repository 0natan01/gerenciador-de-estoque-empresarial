package com.example.gerenciador_de_estoque_empresarial.business.dto;

import lombok.*;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDto {
    private String nome;
    private String email;
    private String senha;

}
