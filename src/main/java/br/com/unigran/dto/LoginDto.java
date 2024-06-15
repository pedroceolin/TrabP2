/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.dto;

import br.unigran.provap2.model.Login;
import java.util.List;


public class LoginDto extends GenericoDto<Login> {
    
    public Long id;
    public FuncaoDto funcao;
    public String senha;
    public String nomeUsu;
    
    // Construtor padrão
    public LoginDto() {
    }

    // Construtor que inicializa os campos a partir de um objeto Login
    public LoginDto(Login login) {
        this.id = login.getId();
        this.nomeUsu = login.getLogin();
        this.senha = login.getSenha();
    }

    @Override
    public Login builder() {
        Login login = new Login();
        login.setId(this.id);
        login.setLogin(this.nomeUsu);
        login.setSenha(this.senha);
        if (funcao != null) {
            login.setFuncao(funcao.builder());
        }
        return login;
    } 
    
    public List<LoginDto> getListDados(List<Login> dados) {
        // Implementar a conversão de uma lista de Logins para uma lista de LoginDto
        return List.of(); // Implementar corretamente
    }
    
    @Override
    public LoginDto convert(Login t) {
        LoginDto dto = new LoginDto();
        dto.id = t.getId();
        dto.nomeUsu = t.getLogin();
        dto.senha = t.getSenha();
        return dto;
    }    

    @Override
    public List getListaDados(List<Login> dados) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
