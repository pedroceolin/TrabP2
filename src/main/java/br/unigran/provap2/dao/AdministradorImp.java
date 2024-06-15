/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.provap2.dao;

import br.unigran.provap2.model.Dentista;
import br.unigran.provap2.model.Login;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class AdministradorImp extends AdministradorDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void alteraAcesso(Login login) {
        em.createNativeQuery("UPDATE Login SET login = :novoLogin, senha = :novaSenha WHERE id = :idLogin")
                .setParameter("novoLogin", login.getLogin())
                .setParameter("novaSenha", login.getSenha())
                .setParameter("idLogin", login.getId())
                .executeUpdate();
    }

    @Override
    public List<Dentista> listAdministradores() {
        return em.createNativeQuery("SELECT * FROM Administrador", Dentista.class)
                .getResultList();
    }
}
