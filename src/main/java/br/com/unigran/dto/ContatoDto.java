/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.dto;

import br.unigran.provap2.model.Contato;


public abstract class ContatoDto extends GenericoDto<Contato> {
    public String nContato1;
    public String nContato2;
    public String email;
    
    public ContatoDto(Contato contato) {

    }
    
    public Contato builder(){
        Contato contato = new Contato() {};
        contato.setEmail(this.email);
        contato.setnContato1(this.nContato1);
        contato.setnContato2(this.nContato2);
        return contato;
    }

}
