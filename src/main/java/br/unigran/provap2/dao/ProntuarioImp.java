/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.provap2.dao;

import br.unigran.provap2.model.Prontuario;


public  abstract class ProntuarioImp extends ProntuarioDao{
    public Prontuario gerarProntuario(Long idBusca) {
        return (Prontuario) em.createNativeQuery("SELECT * FROM Paciente WHERE id = :?", Prontuario.class)
                .setParameter(1, "idBusca")
                .getSingleResult();
    }
}
