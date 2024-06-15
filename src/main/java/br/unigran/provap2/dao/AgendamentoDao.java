
package br.unigran.provap2.dao;

import br.com.unigran.dto.AgendamentoDto;
import br.unigran.provap2.model.Agendamento;
import br.unigran.provap2.model.Consulta;


public abstract class AgendamentoDao extends Dao{
    
    public abstract void marcarConsulta(Agendamento agendamento);
    public abstract void cancelarConsulta(Consulta consulta);
    public abstract AgendamentoDto buscaPorNome(Long idBusca);
    
}
