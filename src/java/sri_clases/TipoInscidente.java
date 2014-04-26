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
public class TipoInscidente {

    private int tipinc_codigo;
    private String tipinc_descripcion;

    public TipoInscidente() {
    }

    public TipoInscidente(int tipinc_codigo, String tipinc_descripcion) {
        this.tipinc_codigo = tipinc_codigo;
        this.tipinc_descripcion = tipinc_descripcion;
    }

    public int getTipinc_codigo() {
        return tipinc_codigo;
    }

    public void setTipinc_codigo(int tipinc_codigo) {
        this.tipinc_codigo = tipinc_codigo;
    }

    public String getTipinc_descripcion() {
        return tipinc_descripcion;
    }

    public void setTipinc_descripcion(String tipinc_descripcion) {
        this.tipinc_descripcion = tipinc_descripcion;
    }

}
