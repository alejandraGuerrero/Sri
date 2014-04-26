/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sri_clases;

/**
 *
 * @author Alejandra y Lina
 */
public class TipoUsuario {

    private int tipusu_codigo;
    private String tipusu_descripcion;

    public TipoUsuario() {
    }

    public TipoUsuario(int tipusu_codigo, String tipusu_descripcion) {
        this.tipusu_codigo = tipusu_codigo;
        this.tipusu_descripcion = tipusu_descripcion;
    }

    public int getTipusu_codigo() {
        return tipusu_codigo;
    }

    public void setTipusu_codigo(int tipusu_codigo) {
        this.tipusu_codigo = tipusu_codigo;
    }

    public String getTipusu_descripcion() {
        return tipusu_descripcion;
    }

    public void setTipusu_descripcion(String tipusu_descripcion) {
        this.tipusu_descripcion = tipusu_descripcion;
    }

}
