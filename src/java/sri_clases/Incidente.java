/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sri_clases;

import java.util.Date;

/**
 *
 * @author Alejandra y  Lina
 */
public class Incidente {
    private int inc_codigoIncidente;
    private String inc_descripcionIncidente;
    private Date inc_fechaIncidente;

    public Incidente() {
    }

    public Incidente(int inc_codigoIncidente, String inc_descripcionIncidente, Date inc_fechaIncidente) {
        this.inc_codigoIncidente = inc_codigoIncidente;
        this.inc_descripcionIncidente = inc_descripcionIncidente;
        this.inc_fechaIncidente = inc_fechaIncidente;
    }

    public int getInc_codigoIncidente() {
        return inc_codigoIncidente;
    }

    public void setInc_codigoIncidente(int inc_codigoIncidente) {
        this.inc_codigoIncidente = inc_codigoIncidente;
    }

    public String getInc_descripcionIncidente() {
        return inc_descripcionIncidente;
    }

    public void setInc_descripcionIncidente(String inc_descripcionIncidente) {
        this.inc_descripcionIncidente = inc_descripcionIncidente;
    }

    public Date getInc_fechaIncidente() {
        return inc_fechaIncidente;
    }

    public void setInc_fechaIncidente(Date inc_fechaIncidente) {
        this.inc_fechaIncidente = inc_fechaIncidente;
    }
    
    
}
