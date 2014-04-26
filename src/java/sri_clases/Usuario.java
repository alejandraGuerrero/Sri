/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sri_clases;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Alejandra y Lina
 */
public class Usuario {

    private int usu_codigo;
    private String usu_nombre;
    private String telefono;
    private String password;
    private Date usu_fechaRegistro;
    private String usu_direccion;

    public Usuario() {
    }

    public Usuario(int usu_codigo, String usu_nombre, String telefono, String password, Date usu_fechaRegistro, String usu_direccion) {
        this.usu_codigo = usu_codigo;
        this.usu_nombre = usu_nombre;
        this.telefono = telefono;
        this.password = password;
        this.usu_fechaRegistro = usu_fechaRegistro;
        this.usu_direccion = usu_direccion;
    }

    

    public int getUsu_codigo() {
        return usu_codigo;
    }

    public void setUsu_codigo(int usu_codigo) {
        this.usu_codigo = usu_codigo;
    }

    public String getUsu_nombre() {
        return usu_nombre;
    }

    public void setUsu_nombre(String usu_nombre) {
        this.usu_nombre = usu_nombre;
    }

    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getUsu_fechaRegistro() {
        return usu_fechaRegistro;
    }

    public void setUsu_fechaRegistro(Date usu_fechaRegistro) {
        this.usu_fechaRegistro = usu_fechaRegistro;
    }

    public String getUsu_direccion() {
        return usu_direccion;
    }

    public void setUsu_direccion(String usu_direccion) {
        this.usu_direccion = usu_direccion;
    }
    
    
}
