package model;

import java.util.*;

/**
 * @param categoria
 * @param ID
 * @param nome
 * @param prezzo
 */
/**
 * @author Iskandar Montano
 */
public class Portata {

    private Categoria categoria;
    private String ID;
    private String nome;
    private double prezzo;

    public Portata(Categoria categoria, String ID, String nome, double prezzo) {
        setCategoria(categoria);
        setID(ID);
        setNome(nome);
        setPrezzo(prezzo);
    }

    public Categoria getCategoria() {
        // TODO implement here
        return this.categoria;
    }

    private boolean setCategoria(Categoria categoria) {
        if (categoria != null) {
            this.categoria = categoria;
            return true;
        } else {
            return false;
        }

    }

    public String getID() {
        return this.ID;
    }

    public boolean setID(String ID) {
        if (ID != null && !ID.isEmpty()) {
            this.ID = ID;
            return true;
        } else {
            return false;
        }

    }

    public String getNome() {
        // TODO implement here
        return this.nome;
    }
    
    public boolean setNome(String nome) {
        if(nome!=null && !nome.isEmpty()){
            this.nome=nome;
            return true;
        }
        else{
            return false;
        }

    }

    public double getPrezzo() {
        // TODO implement here
        return prezzo;
    }
    
    public boolean setPrezzo(double prezzo) {
        if(prezzo>0.0){
            this.prezzo=prezzo;
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Portata other = (Portata) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        return true;
    }
    
    public String toString() {
        // TODO implement here
        return "";
    }

    /**
     *
     */
    public void toFileFormat() {
        // TODO implement here
    }

}
