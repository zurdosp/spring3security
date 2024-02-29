package br.com.css.cnpjsmartsearch.auth.dtos;

public record SignUpDto (String firstName, String lastName, String login, char[] password) { }
