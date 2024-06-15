
package br.unigran.provap2.dao;

import br.unigran.provap2.model.Dentista;
import br.unigran.provap2.model.Login;
import java.util.List;




public abstract class AdministradorDao extends Dao{
    public abstract void alteraAcesso (Login login);
    public abstract List<Dentista> listAdministradores();
}
