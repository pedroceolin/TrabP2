/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.provap2.dao;

import br.com.unigran.dto.LoginDto;
import br.unigran.provap2.model.Login;
import java.util.List;


public abstract class LoginImp extends LoginDao {
    @Override
    public List listarLogins() {
        return em.createNativeQuery("SELECT * FROM Login", Login.class)
                .getResultList();
    }

    public LoginDto autenticaUsuario(String usuario, String senha) {
        {
            Login login = em.createQuery("SELECT l FROM Login l WHERE l.login = :usuario AND l.senha = :senha", Login.class)
                            .setParameter("usuario", usuario)
                            .setParameter("senha", senha)
                            .getSingleResult();
            return new LoginDto(login);
        }
    }

    public LoginDto buscaIdDoLogin(Long id) {
        return (LoginDto) em.createNativeQuery("SELECT id FROM Login WHERE id = :id")
                .setParameter("id", id)
                .getSingleResult();
    }
}
