package br.com.unigran.dto;

import br.unigran.provap2.model.Cidade;
import br.unigran.provap2.model.Endereco;
import java.util.ArrayList;
import java.util.List;


public abstract class CidadeDto extends GenericoDto<Cidade> {
    private EstadoDto estado;
    private List<EnderecoDto> endereco;

    public Cidade builder() {
        Cidade cidade = new Cidade();
        if(estado != null){
            cidade.setEstado(estado.builder());
        }
       if (endereco != null && !endereco.isEmpty()){
            List<Endereco> enderecoEntidades = new ArrayList<>();
            for (EnderecoDto enderecoDto : endereco) {
                enderecoEntidades.add(enderecoDto.builder());
            }
            cidade.setEnderecos(enderecoEntidades);
        }

        return cidade;
    }
}
