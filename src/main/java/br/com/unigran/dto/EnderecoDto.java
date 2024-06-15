/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.dto;

import br.unigran.provap2.model.Endereco;


public abstract class EnderecoDto extends GenericoDto<Endereco> {
       public String rua;
       public String estado;
       public PacienteDto paciente;
       public CidadeDto cidade;
    
    public Endereco builder() {
        Endereco endereco = new Endereco();
        endereco.setRua(this.rua);
        endereco.setEstado(this.rua);
        if(paciente != null){
            endereco.setPaciente(paciente.builder());
        }
        if(cidade != null){
            endereco.setCidade(cidade.builder());
        }
        return endereco;
    }
    
}
