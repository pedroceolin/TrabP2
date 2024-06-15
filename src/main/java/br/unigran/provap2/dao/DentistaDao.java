
package br.unigran.provap2.dao;

import br.com.unigran.dto.DentistaDto;
import br.unigran.provap2.model.Dentista;
import java.util.List;


public abstract class DentistaDao  extends Dao{
    
    public abstract List<Dentista> listaDentistas();
    public abstract DentistaDto buscaPorNome(String nome);

    public static void salvar(Dentista dentista) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
