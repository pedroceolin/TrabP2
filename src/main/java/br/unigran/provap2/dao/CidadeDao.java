/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.provap2.dao;

import br.unigran.provap2.model.Cidade;
import java.util.List;


public abstract class CidadeDao extends Dao {
    public abstract List<Cidade> listarCidade();
}
