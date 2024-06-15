
package br.unigran.provap2.dao;

import br.unigran.provap2.model.Agendamento;
import br.unigran.provap2.model.Consulta;
import java.util.List;


public  abstract class ConsultaDao extends Dao {
    public abstract void agendarHorario (Agendamento agendamento);
    public abstract void registrarConsulta (Consulta consulta);
    public abstract List<Consulta> listar();
}
