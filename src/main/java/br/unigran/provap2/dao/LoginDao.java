
package br.unigran.provap2.dao;

import br.com.unigran.dto.LoginDto;
import java.util.List;


public abstract class LoginDao extends Dao {
    public abstract List listarLogins();
    public abstract LoginDto autenticaUsuario();
}
