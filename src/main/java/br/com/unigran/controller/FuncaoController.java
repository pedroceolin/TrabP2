/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.controller;

import br.com.unigran.dto.FuncaoDto;
import br.unigran.provap2.dao.FuncaoDao;
import br.unigran.provap2.dao.FuncaoImp;
import br.unigran.provap2.model.Funcao;
import java.util.List;


public abstract class FuncaoController extends GenericoController {
    private final FuncaoDao funcaoDao = new FuncaoImp() {};

    @Override
    protected FuncaoDao getDao() {
        return funcaoDao;
    }

    protected Funcao builderEntity(FuncaoDto dto) {
        return dto.builder();
    }

    public List<FuncaoDto> listar() {
        return funcaoDao.listar();
    }

    @Override
    public String[] getTitulosColunas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object[] getDados(FuncaoDto dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List getListaDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
