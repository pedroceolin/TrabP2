/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.dto;

import br.unigran.provap2.model.Administrador;


public abstract class AdministradorDto extends GenericoDto<Administrador> {
    public LoginDto login;
    public String nome;

    public Administrador builder(){
        Administrador administrador = new Administrador();
        administrador.setNome(this.nome);
        if(login != null){
            administrador.setLogin(login.builder());
        }
        return administrador;
    }
    
}
