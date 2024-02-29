package br.com.css.cnpjsmartsearch.auth.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.css.cnpjsmartsearch.auth.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByLogin(String login);
}
