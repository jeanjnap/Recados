/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jean Nelson
 */
public class Recado {
    private int idRecado;
    private String setorRecado;
    private String tituloRecado;
    private String mensagemRecado;

    public Recado(int idRecado, String setorRecado, String tituloRecado, String mensagemRecado) {
        this.idRecado = idRecado;
        this.setorRecado = setorRecado;
        this.tituloRecado = tituloRecado;
        this.mensagemRecado = mensagemRecado;
    }

    

    public Recado() {
    }

    public int getIdRecado() {
        return idRecado;
    }

    public void setIdRecado(int idRecado) {
        this.idRecado = idRecado;
    }

    public String getSetorRecado() {
        return setorRecado;
    }

    public void setSetorRecado(String setorRecado) {
        this.setorRecado = setorRecado;
    }

    public String getTituloRecado() {
        return tituloRecado;
    }

    public void setTituloRecado(String tituloRecado) {
        this.tituloRecado = tituloRecado;
    }

    public String getMensagemRecado() {
        return mensagemRecado;
    }

    public void setMensagemRecado(String mensagemRecado) {
        this.mensagemRecado = mensagemRecado;
    }

    
    
    
    
    
}
