/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.dto;

import br.unigran.provap2.model.Funcao;
import java.util.LinkedList;
import java.util.List;


public  abstract class FuncaoDto  extends GenericoDto<Funcao>{
    public String descricao;
    public String nome;
    
    public Funcao builder(){
        Funcao funcao = new Funcao();
        funcao.setNome(this.nome);
        funcao.setDescricao(this.descricao);
        return funcao;
    }
    
    public List getListaDados(List<Funcao> dados){
        List dadosDto = new LinkedList();
        for (Funcao dado : dados) {
            dadosDto.add(converte(dado));
        }
        return dadosDto;
    } 

    private Object converte(Funcao f) {
        FuncaoDto dto = new FuncaoDto() {
            @Override
            public Object convert(Funcao t) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        dto.nome = f.getNome();
        dto.descricao = f.getDescricao();
        return dto;
    }
}
