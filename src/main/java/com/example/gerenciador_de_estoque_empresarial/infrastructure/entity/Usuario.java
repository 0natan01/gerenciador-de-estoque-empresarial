package com.example.gerenciador_de_estoque_empresarial.infrastructure.entity;



import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "nome" , length = 100 )
    private String nome;

    @Column(name = "email" , length = 100)
    private String email;

    @Column(name = "senha" , length = 100)
    private String senha;

}
