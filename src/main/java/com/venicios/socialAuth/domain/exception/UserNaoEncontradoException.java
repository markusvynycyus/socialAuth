package com.venicios.socialAuth.domain.exception;

public class UserNaoEncontradoException extends EntidadeNaoEncontradaException{

    private static final long serialVersionUID = 1L;

    public UserNaoEncontradoException(String mensagem) {
        super(mensagem);
    }

    public UserNaoEncontradoException(Long userId) {
        this(String.format("Não existe um cadastro de Usuário com código %d", userId));
    }

}
