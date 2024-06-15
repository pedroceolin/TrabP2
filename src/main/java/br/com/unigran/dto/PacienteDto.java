/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.dto;

import br.unigran.provap2.model.Agendamento;
import br.unigran.provap2.model.Consulta;
import br.unigran.provap2.model.Paciente;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public abstract class PacienteDto extends GenericoDto<Paciente>{
    
    public Long id;
    public String nome;
    public String cpf;
    public Date dataNascimento;
    public String convenios;
    public String email;
    public String responsavel;
    public ContatoDto contato;
   
    public List<ConsultaDto> consultas;
    public List<AgendamentoDto> agendamentos;
    public EnderecoDto endereco;

    public PacienteDto(Paciente paciente) {
        this.id = paciente.getId();
    }
    
    
    @Override
public Paciente builder() {
    Paciente paciente = new Paciente();
    paciente.setId(this.id);
    paciente.setNome(this.nome);
    paciente.setCpf(this.cpf);
    paciente.setDataNascimento(this.dataNascimento);
    paciente.setConvenios(this.convenios);
    paciente.setEmail(this.email);
    paciente.setResponsavel(this.responsavel);
    paciente.setContato(contato.builder());
  

    List<Consulta> consultaEntidades = new ArrayList<>();
    for (ConsultaDto consultaDTO : consultas) {
        consultaEntidades.add(consultaDTO.builder());
    }
    paciente.setConsulta(consultaEntidades);

    List<Agendamento> agendamentoEntidades = new ArrayList<>();
    for (AgendamentoDto agendamentoDTO : agendamentos) {
        agendamentoEntidades.add(agendamentoDTO.builder());
    }
    paciente.setAgendamento((Agendamento) agendamentoEntidades);

    paciente.setEndereco(endereco.builder());

    return paciente;
}
    
    @Override
    public List getListaDados(List<Paciente> dados) {
        List dadosDto = new LinkedList();
        for (Paciente dado : dados) {
            dadosDto.add(converte(dado));
        }
        return dadosDto;
    }
    
    public Object converte(Paciente paciente) {
        PacienteDto dto= new PacienteDto() {
            @Override
            public Object convert(Paciente t) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        dto.nome = paciente.getNome();
        dto.email = paciente.getEmail();
        dto.cpf = paciente.getCpf();
        return dto;
    }  
}
