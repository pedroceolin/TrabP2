
package br.unigran.provap2.dao;

import br.unigran.provap2.model.Consulta;
import br.unigran.provap2.model.Prontuario;
import java.util.List;


public abstract class ProntuarioDao extends Dao {
    public abstract Prontuario gerarProntuario(Long id);
    
}
