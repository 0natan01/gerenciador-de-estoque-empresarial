package com.example.gerenciador_de_estoque_empresarial.business.converter;



import com.example.gerenciador_de_estoque_empresarial.business.dto.UsuarioDto;
import com.example.gerenciador_de_estoque_empresarial.infrastructure.entity.Usuario;
import org.springframework.stereotype.Component;



@Component
public class UsuarioConverter {
    public Usuario paraUsuario(UsuarioDto usuarioDto){
        return Usuario.builder()
                .nome(usuarioDto.getNome())
                .email(usuarioDto.getEmail())
                .senha(usuarioDto.getSenha())
                .build();
    }




    public UsuarioDto paraUsuarioDto(Usuario usuarioDto){
        return UsuarioDto.builder()
                .nome(usuarioDto.getNome())
                .email(usuarioDto.getEmail())
                .senha(usuarioDto.getSenha())
                .build();
    }

}
