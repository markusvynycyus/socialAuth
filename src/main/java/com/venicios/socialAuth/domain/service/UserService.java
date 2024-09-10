package com.venicios.socialAuth.domain.service;

import com.venicios.socialAuth.domain.exception.NegocioException;
import com.venicios.socialAuth.domain.exception.UserNaoEncontradoException;
import com.venicios.socialAuth.domain.model.User;
import com.venicios.socialAuth.repository.RoleRepository;
import com.venicios.socialAuth.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

//    @Autowired
//    private PasswordEncoder passwordEncoder;


    public User buscarOuFalhar(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new UserNaoEncontradoException(userId));
    }


//    @Transactional
//    public User salvar(User user) {
//        // Desconectar a entidade do contexto de persistência, caso necessário
//        userRepository.detach(user);
//
//        // Verificar se já existe um usuário com o mesmo nome de usuário
//        Optional<User> usuarioExistentePorUsername = userRepository.findByUsername(user.getUsername());
//
//        // Se o nome de usuário já existir e não for o mesmo usuário (na edição)
//        if (usuarioExistentePorUsername.isPresent() && !usuarioExistentePorUsername.get().equals(user)) {
//            throw new NegocioException(
//                    String.format("Já existe um usuário cadastrado com o username %s", user.getUsername()));
//        }
//
//        // Verificar se já existe um usuário com o mesmo email
//        Optional<User> usuarioExistentePorEmail = userRepository.findByEmail(user.getEmail());
//
//        // Se o email já existir e não for o mesmo usuário (na edição)
//        if (usuarioExistentePorEmail.isPresent() && !usuarioExistentePorEmail.get().equals(user)) {
//            throw new NegocioException(
//                    String.format("Já existe um usuário cadastrado com o e-mail %s", user.getEmail()));
//        }
//
//        // Codificar a senha somente se for um novo usuário ou se a senha foi alterada
//        if (user.isNovo() || user.isSenhaAlterada()) {
//            user.setPassword(passwordEncoder.encode(user.getPassword()));
//        }
//
//        // Salvar o usuário no banco de dados
//        return userRepository.save(user);
//    }


//    public void alterarSenha(Long usuarioId, String senhaAtual, String novaSenha) {
//        User usuario = buscarOuFalhar(usuarioId);
//
//        if (!passwordEncoder.matches(senhaAtual, usuario.getPassword())) {
//            throw new NegocioException("A senha atual informada não coincide com a senha do usuário.");
//        }
//
//        if (novaSenha.length() < 8) {
//            throw new NegocioException("A nova senha deve ter no mínimo 8 caracteres.");
//        }
//
//        usuario.setPassword(passwordEncoder.encode(novaSenha));
//        userRepository.save(usuario);
//    }


}
