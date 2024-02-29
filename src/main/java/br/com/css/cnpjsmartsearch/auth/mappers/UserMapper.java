package br.com.css.cnpjsmartsearch.auth.mappers;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.css.cnpjsmartsearch.auth.dtos.SignUpDto;
import br.com.css.cnpjsmartsearch.auth.dtos.UserDto;
import br.com.css.cnpjsmartsearch.auth.entites.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}
