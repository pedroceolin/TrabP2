/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.dto;

import br.unigran.provap2.model.Estado;




public abstract  class EstadoDto extends GenericoDto<Estado> {
    
    public Estado builder() {
        Estado estado = new Estado();
        return estado;
    }
}
