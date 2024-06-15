/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.dto;

import br.unigran.provap2.model.Material;


public abstract class MaterialDto extends GenericoDto<Material> {
    
    public int quantidade;
    public int qtdMinima;
    public String nome;
    public GerenteClinicaDto gerente;

    public Material builder() {
       Material material = new Material();
       material.setNome(this.nome);
       material.setQtdMinima(this.qtdMinima);
       material.setQuantidade(this.quantidade);
       if(gerente != null){
           material.setGerenteClinica(gerente.builder());
       }
       return material;
    } 
    
}
