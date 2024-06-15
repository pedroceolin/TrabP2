/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.provap2.dao;

import br.unigran.provap2.model.Agendamento;
import br.unigran.provap2.model.Consulta;
import java.util.List;


public class ConsultaImp extends ConsultaDao {

    @Override
    public void agendarHorario(Agendamento agendamento) {
        em.createNativeQuery("INSERT INTO Agendamento(paciente, dentista, horario, dataAgendamento) " +
                             "VALUES (:paciente, :dentista, :horario, :dataAgendamento)")
                .setParameter("paciente", agendamento.getPaciente())
                .setParameter("dentista", agendamento.getDentista())
                .setParameter("horario", agendamento.getHorario())
                .setParameter("dataAgendamento", agendamento.getDataAgendamento())
                .executeUpdate();
    }

    @Override
    public void registrarConsulta(Consulta consulta) {
        em.createNativeQuery("INSERT INTO Consulta(paciente, dentista, observacoes, anexos, valor) " +
                             "VALUES (:paciente, :dentista, :observacoes, :anexos, :valor)")
                .setParameter("paciente", consulta.getPaciente())
                .setParameter("dentista", consulta.getDentista())
                .setParameter("observacoes", consulta.getObs())
                .setParameter("anexos", consulta.getAnexos())
                .setParameter("valor", consulta.getValor())
                .executeUpdate();
    }

    @Override
    public List<Consulta> listar() {
        return em.createQuery("SELECT c FROM Consulta c", Consulta.class)
                .getResultList();
    }
}