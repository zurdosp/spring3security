package br.com.css.cnpjsmartsearch.auth.controllers;


import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.css.cnpjsmartsearch.auth.config.UserAuthenticationProvider;
import br.com.css.cnpjsmartsearch.auth.dtos.CredentialsDto;
import br.com.css.cnpjsmartsearch.auth.dtos.SignUpDto;
import br.com.css.cnpjsmartsearch.auth.dtos.UserDto;
import br.com.css.cnpjsmartsearch.auth.services.UserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class AuthController {

    private final UserService userService;
    private final UserAuthenticationProvider userAuthenticationProvider;

    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody  CredentialsDto credentialsDto) {
        UserDto userDto = userService.login(credentialsDto);
        userDto.setToken(userAuthenticationProvider.createToken(userDto));
        return ResponseEntity.ok(userDto);
    }

    @PostMapping("/register")
    public ResponseEntity<UserDto> register(@RequestBody  SignUpDto user) {
        UserDto creUser = userService.register(user);
        creUser.setToken(userAuthenticationProvider.createToken(creUser));
        return ResponseEntity.created(URI.create("/users/" + creUser.getId())).body(creUser);
    }

}
