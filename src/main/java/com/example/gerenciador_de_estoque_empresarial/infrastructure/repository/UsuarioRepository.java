package com.example.gerenciador_de_estoque_empresarial.infrastructure.repository;


import com.example.gerenciador_de_estoque_empresarial.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario , Long> {
    boolean existsByEmail(String email);


    Optional<Usuario> findByEmail(String email);


}
