
package br.unigran.provap2.dao;

import br.unigran.provap2.model.Paciente;
import java.util.List;



public abstract class PacienteDao extends Dao { //paciente DAO usando o metodo crud (create, read, update e delete).
    
     public abstract Paciente buscarId(Long id);
     
     public abstract List<Paciente> listarPac();
   
}
