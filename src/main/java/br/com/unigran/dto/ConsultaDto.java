/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.dto;

import br.unigran.provap2.model.Consulta;
import java.io.File;
import java.util.LinkedList;
import java.util.List;


public class ConsultaDto extends GenericoDto<Consulta>{
    public Long id;
    public File anexos;
    public AgendamentoDto agendamento;
    public PacienteDto paciente;
    public DentistaDto dentista;
    public Double valor;
    public String obs;
    
    public Consulta builder(){
        Consulta consulta = new Consulta();
        consulta.setId(this.id);
        consulta.setObs(this.obs);
        consulta.setValor(this.valor);
        consulta.setAnexos(this.anexos);
        
        if(paciente != null){
            consulta.setPaciente(paciente.builder());            
        }
        if(dentista != null){
            consulta.setAgendamento(agendamento.builder());
        }
        if(agendamento != null){
            consulta.setAgendamento(agendamento.builder());
        }
        return consulta;
    }
    
    
    public List getListaDados(List<Consulta> dados){
        List dadosDto = new LinkedList ();
        for (Consulta dado : dados){
            dadosDto.add(Converte(dado));
        }
        return dadosDto;
    }
    
    public Object convert (Consulta consulta) {
        ConsultaDto dto = new ConsultaDto();
        dto.id = consulta.getId();
        dto.valor = consulta.getValor();
        return dto;
    }

    private Object Converte(Consulta dado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
