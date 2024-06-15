/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.dto;

import br.unigran.provap2.model.Dentista;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public abstract class DentistaDto extends GenericoDto<Dentista> {
    public Long id;
    public String nomeDentista;
    public LoginDto login;
    
    public DentistaDto(Dentista dentista){
        this.id = dentista.getId();
    }
}
