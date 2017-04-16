/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author Iskandar Montano
 */
public class Portata {
    private String categoria;
    private String ID;
    private String nome;
    private double prezzo;

    public Portata(String categoria, String ID, String nome, double prezzo) {
        this.categoria = categoria;
        this.ID = ID;
        this.nome = nome;
        this.prezzo = prezzo;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
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
        return Objects.equals(this.ID, other.ID);
    }

    
    
    @Override
    public String toString() {
        return "Portata{" + "categoria=" + categoria + ", ID=" + ID + ", nome=" + nome + ", prezzo=" + prezzo + '}';
    }
    
    
}
