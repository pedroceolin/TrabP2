
package br.unigran.provap2.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
public  abstract class Contato implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private String email;
    
    @JoinColumn(name = "numero_contato1")
    private String nContato1;
    @JoinColumn(name = "numero_contato2")
    private String nContato2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getnContato1() {
        return nContato1;
    }

    public void setnContato1(String nContato1) {
        this.nContato1 = nContato1;
    }

    public String getnContato2() {
        return nContato2;
    }

    public void setnContato2(String nContato2) {
        this.nContato2 = nContato2;
    }
    
}
