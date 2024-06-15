/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.controller;

import br.com.unigran.dto.AdministradorDto;
import br.com.unigran.dto.GenericoDto;
import br.unigran.provap2.dao.Dao;
import java.util.List;


public abstract class GenericoController <T, GenericoDto> {
    
    
    protected abstract Dao getDao();
    
    protected abstract T builderEntity(GenericoDto dto);
        
    public void salvar(GenericoDto dto) throws Exception {
        getDao().salvar(builderEntity(dto));
    }

    public void atualizar(GenericoDto dto) throws Exception {
        getDao().atualiza(builderEntity(dto));
    }
    
    public void remover(GenericoDto dto) throws Exception{
        getDao().remove(builderEntity(dto));
    }
    
   public abstract String[] getTitulosColunas();

    public abstract Object[] getDados(GenericoDto dto);

    public abstract List getListaDados();
}

