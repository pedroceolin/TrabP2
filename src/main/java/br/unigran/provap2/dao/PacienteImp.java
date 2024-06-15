    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.provap2.dao;

import br.com.unigran.dto.PacienteDto;
import br.unigran.provap2.model.Paciente;
import java.util.List;


public abstract class PacienteImp extends PacienteDao {

    public PacienteDto buscarId(String filtro) {
        {
            Paciente paciente = em.createQuery("SELECT l FROM Paciente l WHERE l.nome = :filtro", Paciente.class)
                            .setParameter("filtro", filtro)
                            .getSingleResult();
            return new PacienteDto(paciente) {
                @Override
                public Object convert(Paciente t) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            }; 
        }
    }

    public List<Paciente> listaPac() {
        return em.createNativeQuery("SELECT * FROM Paciente", Paciente.class)
                .getResultList();
    }
}
