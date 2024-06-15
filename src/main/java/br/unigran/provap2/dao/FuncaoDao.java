/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.provap2.dao;

import br.com.unigran.dto.FuncaoDto;
import br.unigran.provap2.model.Funcao;
import java.util.List;


public  abstract class FuncaoDao extends Dao {
    public abstract void alterarFuncao(Funcao funcao);
    public abstract List<FuncaoDto> listar();
}
