package com.example.gerenciador_de_estoque_empresarial.infrastructure.exceptions;

public class ConflictExeptions extends RuntimeException{
    public ConflictExeptions(String mensagem){
        super(mensagem);
    }

    public ConflictExeptions(String mensagem , Throwable throwable){
        super(mensagem);
    }
}
