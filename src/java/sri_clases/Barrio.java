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
public class Barrio {

    private int bar_codigo;
    private String bar_nombre;
    private String estrato;
    private int comuna;

    public Barrio() {
    }

    public Barrio(int bar_codigo, String bar_nombre, String estrato, int comuna) {
        this.bar_codigo = bar_codigo;
        this.bar_nombre = bar_nombre;
        this.estrato = estrato;
        this.comuna = comuna;
    }

    
    public int getBar_codigo() {
        return bar_codigo;
    }

    public void setBar_codigo(int bar_codigo) {
        this.bar_codigo = bar_codigo;
    }

    public String getBar_nombre() {
        return bar_nombre;
    }

    public void setBar_nombre(String bar_nombre) {
        this.bar_nombre = bar_nombre;
    }

   

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public int getComuna() {
        return comuna;
    }

    public void setComuna(int comuna) {
        this.comuna = comuna;
    }
    
    

}
