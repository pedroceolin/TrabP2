/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.dto;

import java.util.List;


public abstract class GenericoDto<T> {
    public abstract T builder();
    
    public abstract List getListaDados(List<T> dados);
    
    public abstract Object convert(T t);
}
