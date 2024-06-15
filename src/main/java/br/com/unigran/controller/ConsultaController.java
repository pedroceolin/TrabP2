/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.controller;

import br.com.unigran.dto.ConsultaDto;
import br.com.unigran.dto.GenericoDto;
import br.unigran.provap2.dao.ConsultaDao;
import br.unigran.provap2.dao.ConsultaImp;
import br.unigran.provap2.model.Agendamento;
import br.unigran.provap2.model.Consulta;
import java.util.List;


public abstract class ConsultaController extends GenericoController<Consulta, ConsultaDto> {
    ConsultaDao dao = new ConsultaImp();

    public void agendarHorario(Agendamento agendamento) {
        dao.agendarHorario(agendamento);
    }

    public void registrarConsulta(Consulta consulta) {
        dao.registrarConsulta(consulta);
    }

    public List<Consulta> listar() {
        return dao.listar();
    }

    public void salvar(GenericoDto dto) {
        dao.atualiza(dto.builder());
    }

    public void remove(GenericoDto dto) {
        dao.remove(dto.builder());
    }
    
}
