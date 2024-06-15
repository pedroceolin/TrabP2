/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.provap2.dao;

import br.com.unigran.dto.FuncaoDto;
import br.unigran.provap2.model.Funcao;
import java.util.List;


public abstract class FuncaoImp extends FuncaoDao {
    public void alterarFuncao(Funcao funcao) {
        {
            em.createNativeQuery("UPDATE Funcao SET nome = :novoNome, descricao = :novaDescricao WHERE id = :idFuncao")
                    .setParameter("novoNome", funcao.getNome())
                    .setParameter("novaDescricao", funcao.getDescricao())
                    .setParameter("idFuncao", funcao.getId())
                    .executeUpdate();
        }
    }

    public List<FuncaoDto> listar() {
        return em.createNativeQuery("SELECT * FROM Funcao")
                .getResultList();
    }
}
