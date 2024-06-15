/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.provap2.dao;

import br.com.unigran.dto.DentistaDto;
import br.unigran.provap2.model.Dentista;
import java.util.List;
import javax.persistence.NoResultException;


public  abstract class DentistaImp extends Dao{
    public List<Dentista> listaDentistas() {
        return em.createNativeQuery("SELECT * FROM Dentista")
                .getResultList();
    }

    public DentistaDto buscaPorNome(String nome) {
         try {
            Dentista dentista = em.createQuery("SELECT l FROM Dentista l WHERE l.nome = :filtro", Dentista.class)
                            .setParameter("filtro", nome)
                            .getSingleResult();
            return new DentistaDto(dentista) {
                @Override
                public Dentista builder() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public List getListaDados(List<Dentista> dados) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public Object convert(Dentista t) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            }; 
        } catch (NoResultException e) {
            return null; 
        }
    }
}
