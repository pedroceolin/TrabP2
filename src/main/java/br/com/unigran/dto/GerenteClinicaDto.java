/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.dto;

import br.unigran.provap2.model.GerenteClinica;
import br.unigran.provap2.model.Material;
import java.util.ArrayList;
import java.util.List;


public abstract class GerenteClinicaDto extends GenericoDto<GerenteClinica> {
    public Long id;
    public LoginDto login;
    public String nome;
    public List<MaterialDto> material;

    @Override
    public GerenteClinica builder() {
        GerenteClinica gerenteClinica = new GerenteClinica();
        gerenteClinica.setId(id);
        gerenteClinica.setNome(this.nome);
        if (login != null) {
            gerenteClinica.setLogin(login.builder());
        }
        if (material != null && !material.isEmpty()) {
            List<Material> materialEntidades = new ArrayList<>();
            for (MaterialDto m : material) {
                materialEntidades.add(m.builder());
            }
            gerenteClinica.setMateriais(materialEntidades);
        }
        return gerenteClinica;
    }
}
