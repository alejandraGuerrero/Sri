/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sri_controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import sri_clases.Barrio;
import sri_clases.Comuna;
import sri_clases.Incidente;
import sri_clases.TipoIngresoInsidente;
import sri_clases.TipoInscidente;
import sri_clases.Usuario;

/**
 *
 * @author desarrollo4
 */
public class Controlador {

    private List<Usuario> listausuarios = new ArrayList<Usuario>();
    private List<Barrio> listabarrios = new ArrayList<Barrio>();
    private List<Comuna> listacomunas = new ArrayList<Comuna>();
    private Usuario usuario = new Usuario();
    private Barrio barrio = new Barrio();
    private Comuna comuna = new Comuna();
    private String password;
    private String password2;
    private List<Barrio>lstbarrio=new ArrayList<Barrio>();
    private List<TipoInscidente> listaTipoInscidentes=new ArrayList<TipoInscidente>();
    private TipoInscidente tipoInscidente = new TipoInscidente();
    private TipoIngresoInsidente tipoIngresoInsidente = new TipoIngresoInsidente();
    private List<TipoIngresoInsidente> listatipoingresoincidente = new ArrayList<TipoIngresoInsidente>();
    

    public Controlador() {
        CargarUsuarios();
        CargarBarrios();
        CargarComunas();
        cargarTipoIncidente();
        cargarTipoIngresoIncidente();
        usuario = new Usuario();
    }

    public List<Usuario> getListausuarios() {
        return listausuarios;
    }

    public void setListausuarios(List<Usuario> listausuarios) {
        this.listausuarios = listausuarios;
    }

    public List<Barrio> getListabarrios() {
        return listabarrios;
    }

    public void setListabarrios(List<Barrio> listabarrios) {
        this.listabarrios = listabarrios;
    }

    public List<Comuna> getListacomunas() {
        return listacomunas;
    }

    public void setListacomunas(List<Comuna> listacomunas) {
        this.listacomunas = listacomunas;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public List<Barrio> getLstbarrio() {
        return lstbarrio;
    }

    public void setLstbarrio(List<Barrio> lstbarrio) {
        this.lstbarrio = lstbarrio;
    }

    public List<TipoInscidente> getListaTipoInscidentes() {
        return listaTipoInscidentes;
    }

    public void setListaTipoInscidentes(List<TipoInscidente> listaTipoInscidentes) {
        this.listaTipoInscidentes = listaTipoInscidentes;
    }

    public TipoInscidente getTipoInscidente() {
        return tipoInscidente;
    }

    public void setTipoInscidente(TipoInscidente tipoInscidente) {
        this.tipoInscidente = tipoInscidente;
    }

    public TipoIngresoInsidente getTipoIngresoInsidente() {
        return tipoIngresoInsidente;
    }

    public void setTipoIngresoInsidente(TipoIngresoInsidente tipoIngresoInsidente) {
        this.tipoIngresoInsidente = tipoIngresoInsidente;
    }

    public List<TipoIngresoInsidente> getListatipoingresoincidente() {
        return listatipoingresoincidente;
    }

    public void setListatipoingresoincidente(List<TipoIngresoInsidente> listatipoingresoincidente) {
        this.listatipoingresoincidente = listatipoingresoincidente;
    }
    
    
      public void cargarBarrio() {
        listabarrios = new ArrayList<Barrio>();
        lstbarrio =  new ArrayList<Barrio>();
        listabarrios = CargarBarrios();     
        for (Barrio ls : listabarrios){
            if (ls.getComuna() == getComuna().getCom_codigo()){
              lstbarrio.add(ls);                
            }          
        }  
      
      }
      
      public List<TipoInscidente> cargarTipoIncidente(){
          
          tipoInscidente.setTipinc_codigo(1);
          tipoInscidente.setTipinc_descripcion("Violento");
          getListaTipoInscidentes().add(tipoInscidente);
          tipoInscidente = new TipoInscidente();
          tipoInscidente.setTipinc_codigo(2);
          tipoInscidente.setTipinc_descripcion("No Violento");
          getListaTipoInscidentes().add(tipoInscidente);
          System.out.println("tipo2"+tipoInscidente.getTipinc_codigo());
          for (TipoInscidente tipoInscidente : listaTipoInscidentes) {
              System.out.println("incidente" + tipoInscidente.getTipinc_descripcion());
          }
          return listaTipoInscidentes;
      }
      
      public List<TipoIngresoInsidente> cargarTipoIngresoIncidente(){
          
          tipoIngresoInsidente.setTii_codigo(1);
          tipoIngresoInsidente.setTii_descripcion("Via Movil");
          getListatipoingresoincidente().add(tipoIngresoInsidente);
          tipoIngresoInsidente = new TipoIngresoInsidente();
          tipoIngresoInsidente.setTii_codigo(2);
          tipoIngresoInsidente.setTii_descripcion("Via Web");
          getListatipoingresoincidente().add(tipoIngresoInsidente);
          tipoIngresoInsidente = new TipoIngresoInsidente();
          tipoIngresoInsidente.setTii_codigo(3);
          tipoIngresoInsidente.setTii_descripcion("Via Asesor en linea");
          getListatipoingresoincidente().add(tipoIngresoInsidente);
          
          for (TipoIngresoInsidente tii : listatipoingresoincidente) {
              
              System.out.println("tipo ingreso incidente " + tii.getTii_descripcion() );
              
          }
      
          return listatipoingresoincidente;
      }
      

    public String ValidarUsuario() {

        if (!((usuario.getTelefono().equals("")) && (usuario.getPassword().equals("")))) {
           for(int w=0; w<listausuarios.size(); w++){
               System.out.println("www " + w);
                System.out.println("usuario = " + usuario.getTelefono());
                if(listausuarios.get(w).getTelefono().equals(usuario.getTelefono()) && 
                        listausuarios.get(w).getPassword().equals(usuario.getPassword()) ){
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("El usuario ingresado no Existe."));
                    return "operaciones";
                } else {

                    System.out.println("aqui 1");
                    return "";
                }
            }
            System.out.println("aqui 3");
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("El usuario ingresado no Existe."));
            return "";

        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("El usuario ingresado no Existe."));
            return "";
        }

    }

    public void RegistrarUsuario() {
        System.out.println("past " + password);
        System.out.println("past " + password2);
        if (password.equals(password2)) {
            usuario.setPassword(password);
            listausuarios.add(usuario);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("El usuario ha sido ingresado con exito"));
            for (Usuario usuario1 : listausuarios) {
                System.out.println("nombres " + usuario1.getUsu_nombre());
            }
            limpiarUsuario();
        }
    }

    public Usuario validarUsuario(String tel, String contr) {
        
        for (Usuario usuario1 : listausuarios) {
              if (usuario.getTelefono().equals(usuario1.getTelefono()) && usuario.getPassword().equals(usuario1.getPassword())) {
                return usuario1;
            } else {

                return null;
            }
        }
        return null;
    }

    public void limpiarUsuario() {
        usuario.setTelefono("");
        usuario.setPassword("");
        usuario.setUsu_nombre("");
        usuario.setUsu_direccion("");
        password = "";
        password2 = "";
    }

    public String cerrarSesion() {
        return "index";
    }

    public List<Usuario> CargarUsuarios() {
        //  listausuarios = new ArrayList<Usuario>();
        usuario.setTelefono("0000000000");
        usuario.setUsu_nombre("cero");
        usuario.setPassword("000000");
        usuario.setUsu_codigo(1);
        usuario.setUsu_direccion("--------------");
        usuario.setUsu_fechaRegistro(new Date());
        getListausuarios().add(usuario);
        
        usuario.setTelefono("3002302551");
        usuario.setUsu_nombre("Administrador");
        usuario.setPassword("123456");
        usuario.setUsu_codigo(2);
        usuario.setUsu_direccion("Calle 68 A #39-42");
        usuario.setUsu_fechaRegistro(new Date());
        getListausuarios().add(usuario);

        usuario = new Usuario();
        usuario.setTelefono("3122721868");
        usuario.setUsu_nombre("Asesor Telefonico");
        usuario.setPassword("123456");
        usuario.setUsu_codigo(3);
        usuario.setUsu_direccion("Calle 68 A #39-42");
        usuario.setUsu_fechaRegistro(new Date());
        getListausuarios().add(usuario);

        usuario = new Usuario();
        usuario.setTelefono("3185994555");
        usuario.setUsu_nombre("Lnin");
        usuario.setPassword("11111");
        usuario.setUsu_codigo(4);
        usuario.setUsu_direccion("Calle 68 A #39-42");
        usuario.setUsu_fechaRegistro(new Date());
        getListausuarios().add(usuario);

        for (Usuario usuario1 : getListausuarios()) {
            System.out.println("usurio: " + usuario1.getUsu_nombre() + "," + usuario1.getTelefono() + "," + usuario1.getPassword());
        }
        return listausuarios;
    }

    public List<Barrio> CargarBarrios() {
        Barrio barrio = new Barrio();
        barrio.setBar_codigo(1010);
        barrio.setBar_nombre("LA LINDA");
        barrio.setEstrato("2");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1011);
        barrio.setBar_nombre("La Quinta");
        barrio.setEstrato("2");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1020);
        barrio.setBar_nombre("BELLA MONTAÑA");
        barrio.setEstrato("3");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1021);
        barrio.setBar_nombre("Hospital Geriatrico san Isidro");
        barrio.setEstrato("0");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1022);
        barrio.setBar_nombre("Escuela de Trabajo la Linda");
        barrio.setEstrato("0");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1030);
        barrio.setBar_nombre("SACATIN");
        barrio.setEstrato("1");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1040);
        barrio.setBar_nombre("VILLA PILAR");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1041);
        barrio.setBar_nombre("Villa Pilar II");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1042);
        barrio.setBar_nombre("Torres de Avila");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1043);
        barrio.setBar_nombre("Venecia");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1044);
        barrio.setBar_nombre("San Luis");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1045);
        barrio.setBar_nombre("Aquilino Villegas");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1046);
        barrio.setBar_nombre("Urb. Atalaya");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1047);
        barrio.setBar_nombre("Urb. Bello Horizonte");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1048);
        barrio.setBar_nombre("Urb. Santa Mónica");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1050);
        barrio.setBar_nombre("CHIPRE");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1051);
        barrio.setBar_nombre("Chipre Viejo");
        barrio.setEstrato("3");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1052);
        barrio.setBar_nombre("Balcones de Chipre");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1053);
        barrio.setBar_nombre("Bellavista");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1060);
        barrio.setBar_nombre("CAMPOHERMOSO");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1061);
        barrio.setBar_nombre("La Chimenea I y II");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1062);
        barrio.setBar_nombre("Altos de Castilla");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1063);
        barrio.setBar_nombre("Terrazas de Campohermoso");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1064);
        barrio.setBar_nombre("Conjunto Campohermoso");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1065);
        barrio.setBar_nombre("Universidad de Manizales");
        barrio.setEstrato("0");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1070);
        barrio.setBar_nombre("MORROGACHO");
        barrio.setEstrato("2");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1071);
        barrio.setBar_nombre("Topacio");
        barrio.setEstrato("2");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1072);
        barrio.setBar_nombre("Montana");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1080);
        barrio.setBar_nombre("LA FRANCIA");
        barrio.setEstrato("6");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1081);
        barrio.setBar_nombre("Palmar");
        barrio.setEstrato("6");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1082);
        barrio.setBar_nombre("San Francisco");
        barrio.setEstrato("6");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1083);
        barrio.setBar_nombre("Poblado");
        barrio.setEstrato("6");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1084);
        barrio.setBar_nombre("San Remo");
        barrio.setEstrato("6");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1085);
        barrio.setBar_nombre("Candelaria");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1090);
        barrio.setBar_nombre("LOS ALCAZARES");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1091);
        barrio.setBar_nombre("Portal de los Alcazares");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1092);
        barrio.setBar_nombre("Portales");
        barrio.setEstrato("5");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1093);
        barrio.setBar_nombre("Villa Real");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1094);
        barrio.setBar_nombre("Quinta Hispania");
        barrio.setEstrato("2");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1095);
        barrio.setBar_nombre("Asturias");
        barrio.setEstrato("4");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(1100);
        barrio.setBar_nombre("ARENILLO");
        barrio.setEstrato("2-3");
        barrio.setComuna(1);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(2010);
        barrio.setBar_nombre("ASIS");
        barrio.setEstrato("1");
        barrio.setComuna(2);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(2011);
        barrio.setBar_nombre("Jazmin");
        barrio.setEstrato("1-2");
        barrio.setComuna(2);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(2020);
        barrio.setBar_nombre("AVANZADA");
        barrio.setEstrato("2 - 1");
        barrio.setComuna(2);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(2021);
        barrio.setBar_nombre("Camino del Medio");
        barrio.setEstrato("1");
        barrio.setComuna(2);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(2022);
        barrio.setBar_nombre("Tachuelo");
        barrio.setEstrato("1");
        barrio.setComuna(2);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(2030);
        barrio.setBar_nombre("SAN IGNACIO");
        barrio.setEstrato("2");
        barrio.setComuna(2);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(2040);
        barrio.setBar_nombre("GALAN");
        barrio.setEstrato("2 - 1");
        barrio.setComuna(2);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(2041);
        barrio.setBar_nombre("Alto Galan");
        barrio.setEstrato("1");
        barrio.setComuna(2);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(2042);
        barrio.setBar_nombre("Maizal");
        barrio.setEstrato("1");
        barrio.setComuna(2);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(2043);
        barrio.setBar_nombre("Holanda");
        barrio.setEstrato("1");
        barrio.setComuna(2);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(2050);
        barrio.setBar_nombre("ESTRADA");
        barrio.setEstrato("1");
        barrio.setComuna(2);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(2051);
        barrio.setBar_nombre("Sierra Morena");
        barrio.setEstrato("1");
        barrio.setComuna(2);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(2060);
        barrio.setBar_nombre("DELICIAS");
        barrio.setEstrato("3 - 2");
        barrio.setComuna(2);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(2070);
        barrio.setBar_nombre("SAN JOSE");
        barrio.setEstrato("3 - 2");
        barrio.setComuna(2);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(2071);
        barrio.setBar_nombre("San Vicente");
        barrio.setEstrato("2");
        barrio.setComuna(2);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(2080);
        barrio.setBar_nombre("COLON");
        barrio.setEstrato("3 - 2");
        barrio.setComuna(2);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(2081);
        barrio.setBar_nombre("Galerias");
        barrio.setEstrato("3");
        barrio.setComuna(2);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(3010);
        barrio.setBar_nombre("LAS AMERICAS");
        barrio.setEstrato("3");
        barrio.setComuna(3);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(3011);
        barrio.setBar_nombre("La Palma");
        barrio.setEstrato("3");
        barrio.setComuna(3);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(3012);
        barrio.setBar_nombre("Residencias Caldas");
        barrio.setEstrato("3");
        barrio.setComuna(3);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(3013);
        barrio.setBar_nombre("Terminal de Transportes");
        barrio.setEstrato("0");
        barrio.setComuna(3);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(3020);
        barrio.setBar_nombre("LOS AGUSTINOS");
        barrio.setEstrato("3");
        barrio.setComuna(3);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(3030);
        barrio.setBar_nombre("CENTRO");
        barrio.setEstrato("3-4");
        barrio.setComuna(3);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(3031);
        barrio.setBar_nombre("Valvanera");
        barrio.setEstrato("3");
        barrio.setComuna(3);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(3040);
        barrio.setBar_nombre("SAN JOAQUIN");
        barrio.setEstrato("3");
        barrio.setComuna(3);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(3050);
        barrio.setBar_nombre("CAMPO AMOR");
        barrio.setEstrato("3");
        barrio.setComuna(3);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(3051);
        barrio.setBar_nombre("Hoyo Frio");
        barrio.setEstrato("3");
        barrio.setComuna(3);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(3060);
        barrio.setBar_nombre("FUNDADORES");
        barrio.setEstrato("3-4");
        barrio.setComuna(3);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4010);
        barrio.setBar_nombre("SANTA HELENA");
        barrio.setEstrato("3-4");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4011);
        barrio.setBar_nombre("Saenz");
        barrio.setEstrato("3");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4012);
        barrio.setBar_nombre("Conjunto cerrado Fundadores");
        barrio.setEstrato("3");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4013);
        barrio.setBar_nombre("Parque Castilla");
        barrio.setEstrato("3");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4014);
        barrio.setBar_nombre("Universidad Autonoma");
        barrio.setEstrato("");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4015);
        barrio.setBar_nombre("Conjunto cerrado la Estaci3⁄4n");
        barrio.setEstrato("6");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4020);
        barrio.setBar_nombre("LOS CEDROS");
        barrio.setEstrato("3");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4021);
        barrio.setBar_nombre("Urbanizacion el Rio");
        barrio.setEstrato("3");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4030);
        barrio.setBar_nombre("SAN JORGE");
        barrio.setEstrato("3-4");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4040);
        barrio.setBar_nombre("EL SOL");
        barrio.setEstrato("4 - 3");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4041);
        barrio.setBar_nombre("La Primavera");
        barrio.setEstrato("4");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4042);
        barrio.setBar_nombre("Conjunto las Americas");
        barrio.setEstrato("3");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4050);
        barrio.setBar_nombre("LA ARGENTINA");
        barrio.setEstrato("3");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4060);
        barrio.setBar_nombre("LA ASUNCION");
        barrio.setEstrato("3");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4061);
        barrio.setBar_nombre("Villa del Río");
        barrio.setEstrato("3");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4070);
        barrio.setBar_nombre("VERSALLES");
        barrio.setEstrato("4 - 5");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4071);
        barrio.setBar_nombre("Nuevo Versalles");
        barrio.setEstrato("4");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4080);
        barrio.setBar_nombre("EL CAMPIN");
        barrio.setEstrato("4");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4090);
        barrio.setBar_nombre("LLERAS");
        barrio.setEstrato("3-4");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(4091);
        barrio.setBar_nombre("Bavaria");
        barrio.setEstrato("3-4");
        barrio.setComuna(4);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5010);
        barrio.setBar_nombre("PUERTA DEL SOL (Corinto)");
        barrio.setEstrato("1");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5011);
        barrio.setBar_nombre("Aures");
        barrio.setEstrato("2");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5020);
        barrio.setBar_nombre("SIERRA MORENA");
        barrio.setEstrato("2");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5030);
        barrio.setBar_nombre("EL CARIBE");
        barrio.setEstrato("2");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5031);
        barrio.setBar_nombre("Piamonte");
        barrio.setEstrato("3");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5040);
        barrio.setBar_nombre("SAN CAYETANO");
        barrio.setEstrato("2");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5050);
        barrio.setBar_nombre("BOSQUES DEL NORTE");
        barrio.setEstrato("2");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5051);
        barrio.setBar_nombre("Bengala");
        barrio.setEstrato("2");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5060);
        barrio.setBar_nombre("SAN SEBASTIAN");
        barrio.setEstrato("1");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5070);
        barrio.setBar_nombre("SOLFERINO");
        barrio.setEstrato("2");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5071);
        barrio.setBar_nombre("Samaria");
        barrio.setEstrato("1");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5080);
        barrio.setBar_nombre("LA CAROLA");
        barrio.setEstrato("3");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5081);
        barrio.setBar_nombre("La Carolita");
        barrio.setEstrato("2");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5082);
        barrio.setBar_nombre("Altos de Granada");
        barrio.setEstrato("3");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5083);
        barrio.setBar_nombre("Villa Cafe");
        barrio.setEstrato("3");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5084);
        barrio.setBar_nombre("Parte del Ecoparque");
        barrio.setEstrato("");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5090);
        barrio.setBar_nombre("VILLAHERMOSA");
        barrio.setEstrato("2");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5091);
        barrio.setBar_nombre("La Daniela");
        barrio.setEstrato("2");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5092);
        barrio.setBar_nombre("Viña del Rio");
        barrio.setEstrato("3");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5093);
        barrio.setBar_nombre("La Playa");
        barrio.setEstrato("3");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5100);
        barrio.setBar_nombre("COMUNEROS");
        barrio.setEstrato("2");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5110);
        barrio.setBar_nombre("FANNY GONZALEZ");
        barrio.setEstrato("2");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5120);
        barrio.setBar_nombre("ALTOS DE CAPRI");
        barrio.setEstrato("3");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5121);
        barrio.setBar_nombre("Palonegro o Altos del Encenillo");
        barrio.setEstrato("3");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5130);
        barrio.setBar_nombre("VILLA JULIA");
        barrio.setEstrato("2");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5140);
        barrio.setBar_nombre("PORVENIR");
        barrio.setEstrato("2");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5141);
        barrio.setBar_nombre("Parte del Ecoparque");
        barrio.setEstrato("");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5150);
        barrio.setBar_nombre("SINAI");
        barrio.setEstrato("2");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5151);
        barrio.setBar_nombre("Parte del Ecoparque");
        barrio.setEstrato("");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(5160);
        barrio.setBar_nombre("PERALONSO");
        barrio.setEstrato("2 – 1");
        barrio.setComuna(5);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6010);
        barrio.setBar_nombre("VIVEROS");
        barrio.setEstrato("3");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6011);
        barrio.setBar_nombre("Yarumales I y II");
        barrio.setEstrato("2");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6012);
        barrio.setBar_nombre("Licorera");
        barrio.setEstrato("3");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6013);
        barrio.setBar_nombre("Villa Luz");
        barrio.setEstrato("3");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6020);
        barrio.setBar_nombre("LA CUMBRE");
        barrio.setEstrato("3 - 2");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6030);
        barrio.setBar_nombre("MINITAS");
        barrio.setEstrato("3");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6040);
        barrio.setBar_nombre("BAJA SUIZA");
        barrio.setEstrato("4");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6050);
        barrio.setBar_nombre("ALTA SUIZA");
        barrio.setEstrato("4 - 5");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6051);
        barrio.setBar_nombre("La Riviera");
        barrio.setEstrato("4");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6060);
        barrio.setBar_nombre("RESIDENCIAS MANIZALES");
        barrio.setEstrato("4");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6070);
        barrio.setBar_nombre("COLSEGUROS");
        barrio.setEstrato("4");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6071);
        barrio.setBar_nombre("Torres de Oriente");
        barrio.setEstrato("5");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6072);
        barrio.setBar_nombre("Agrícola de Seguros");
        barrio.setEstrato("5");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6080);
        barrio.setBar_nombre("LA TOSCANA");
        barrio.setEstrato("3");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6081);
        barrio.setBar_nombre("Escuela de Carabineros");
        barrio.setEstrato("3");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6090);
        barrio.setBar_nombre("LA SULTANA");
        barrio.setEstrato("3");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6100);
        barrio.setBar_nombre("BOSQUES DE NIZA");
        barrio.setEstrato("4");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6101);
        barrio.setBar_nombre("Balcones de la Palma");
        barrio.setEstrato("4");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6102);
        barrio.setBar_nombre("Camino de la Palma");
        barrio.setEstrato("4");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6103);
        barrio.setBar_nombre("Rincón de la Palma");
        barrio.setEstrato("4");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6104);
        barrio.setBar_nombre("Cerro de Oro");
        barrio.setEstrato("3");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6105);
        barrio.setBar_nombre("Mirador de la Sierra");
        barrio.setEstrato("2");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(6106);
        barrio.setBar_nombre("Colinas de San Sebastián");
        barrio.setEstrato("5");
        barrio.setComuna(6);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7010);
        barrio.setBar_nombre("SAN MARCEL");
        barrio.setEstrato("6");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7011);
        barrio.setBar_nombre("El Pinar");
        barrio.setEstrato("4");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7012);
        barrio.setBar_nombre("Arboletes");
        barrio.setEstrato("5");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7013);
        barrio.setBar_nombre("Conjunto cerrado Santa Ana");
        barrio.setEstrato("5");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7014);
        barrio.setBar_nombre("Chachafruto");
        barrio.setEstrato("2");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7015);
        barrio.setBar_nombre("Bosque Popular");
        barrio.setEstrato("4");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7020);
        barrio.setBar_nombre("ALHAMBRA");
        barrio.setEstrato("6");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7021);
        barrio.setBar_nombre("El portal del Bosque");
        barrio.setEstrato("6");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7022);
        barrio.setBar_nombre("Colinas del Viento");
        barrio.setEstrato("6");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7030);
        barrio.setBar_nombre("CERROS DE LA ALHAMBRA");
        barrio.setEstrato("6");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7031);
        barrio.setBar_nombre("Valles de la Alhambra");
        barrio.setEstrato("6");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7040);
        barrio.setBar_nombre("MALTERIA");
        barrio.setEstrato("1");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7041);
        barrio.setBar_nombre("Juanchito");
        barrio.setEstrato("1 - 2");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7050);
        barrio.setBar_nombre("ZONA INDUSTRIAL");
        barrio.setEstrato("1");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7051);
        barrio.setBar_nombre("Sena");
        barrio.setEstrato("1");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7060);
        barrio.setBar_nombre("CASERIO LA ENEA");
        barrio.setEstrato("4 - 3");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7061);
        barrio.setBar_nombre("La Capilla");
        barrio.setEstrato("2");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7062);
        barrio.setBar_nombre("Bosques de la Alhambra");
        barrio.setEstrato("4");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7063);
        barrio.setBar_nombre("Villa Fundemos");
        barrio.setEstrato("2");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7064);
        barrio.setBar_nombre("El Cairo");
        barrio.setEstrato("3");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7070);
        barrio.setBar_nombre("LA ENEA");
        barrio.setEstrato("3");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7071);
        barrio.setBar_nombre("Los Pinos");
        barrio.setEstrato("3");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7072);
        barrio.setBar_nombre("Sector Gallinazo");
        barrio.setEstrato("3");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7073);
        barrio.setBar_nombre("Aeropuerto");
        barrio.setEstrato("3");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(7080);
        barrio.setBar_nombre("LUSITANIA");
        barrio.setEstrato("3 – 2");
        barrio.setComuna(7);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8010);
        barrio.setBar_nombre("LEONORA");
        barrio.setEstrato("4 - 5");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8011);
        barrio.setBar_nombre("Baja Leonora");
        barrio.setEstrato("4");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8020);
        barrio.setBar_nombre("LOS ROSALES");
        barrio.setEstrato("5 - 4 - 6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8030);
        barrio.setBar_nombre("LA RAMBLA");
        barrio.setEstrato("5");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8040);
        barrio.setBar_nombre("LAURELES");
        barrio.setEstrato("5");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8050);
        barrio.setBar_nombre("PALOGRANDE");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8051);
        barrio.setBar_nombre("Estadio");
        barrio.setEstrato("5");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8052);
        barrio.setBar_nombre("Universidad de Caldas");
        barrio.setEstrato("5");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8053);
        barrio.setBar_nombre("Universidad Nacional");
        barrio.setEstrato("5");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8060);
        barrio.setBar_nombre("ESTRELLA");
        barrio.setEstrato("5 - 6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8070);
        barrio.setBar_nombre("BELEN");
        barrio.setEstrato("5 - 6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8080);
        barrio.setBar_nombre("GUAYACANES");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8090);
        barrio.setBar_nombre("ARBOLEDA");
        barrio.setEstrato("5");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8091);
        barrio.setBar_nombre("Conjunto Ibiza");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8100);
        barrio.setBar_nombre("PALERMO");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8101);
        barrio.setBar_nombre("Los Sauces");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8102);
        barrio.setBar_nombre("Bajo Palermo");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8110);
        barrio.setBar_nombre("CAMELIA");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8111);
        barrio.setBar_nombre("Sector del Batallon");
        barrio.setEstrato("0");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8120);
        barrio.setBar_nombre("SANCANCIO");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8121);
        barrio.setBar_nombre("La Alameda");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8122);
        barrio.setBar_nombre("Villa del Campo");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8123);
        barrio.setBar_nombre("Loma Verde");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8130);
        barrio.setBar_nombre("MILAN");
        barrio.setEstrato("5 - 6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8131);
        barrio.setBar_nombre("Guaduales");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8131);
        barrio.setBar_nombre("Alto del perro");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8132);
        barrio.setBar_nombre("Tejares del Bosque");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8132);
        barrio.setBar_nombre("Sierra Bonita");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8137);
        barrio.setBar_nombre("Condominio el Tejar");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8138);
        barrio.setBar_nombre("San Sebastián de Buena Vista");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8140);
        barrio.setBar_nombre("EL TREBOL");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8141);
        barrio.setBar_nombre("Los Guaduales");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8142);
        barrio.setBar_nombre("Rincon de Doña Elvira");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8143);
        barrio.setBar_nombre("Edificio Tejarres del bosque");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8144);
        barrio.setBar_nombre("Condominio el Tejar");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8145);
        barrio.setBar_nombre("Rincon del Trebol");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8146);
        barrio.setBar_nombre("Bosques del Trebol");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(8147);
        barrio.setBar_nombre("San Sebastian de Buena Vista");
        barrio.setEstrato("6");
        barrio.setComuna(8);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9010);
        barrio.setBar_nombre("BETANIA");
        barrio.setEstrato("2 - 3");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9020);
        barrio.setBar_nombre("FATIMA");
        barrio.setEstrato("3");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9030);
        barrio.setBar_nombre("VIVIENDA POPULAR");
        barrio.setEstrato("3");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9031);
        barrio.setBar_nombre("Granjas y Viviendas");
        barrio.setEstrato("2");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9032);
        barrio.setBar_nombre("Sector del Aguacate");
        barrio.setEstrato("2");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9040);
        barrio.setBar_nombre("PIO XII");
        barrio.setEstrato("2 - 1");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9050);
        barrio.setBar_nombre("KENNEDY");
        barrio.setEstrato("2 - 3");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9051);
        barrio.setBar_nombre("San Luis");
        barrio.setEstrato("2");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9052);
        barrio.setBar_nombre("Pepe Caceres");
        barrio.setEstrato("2");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9053);
        barrio.setBar_nombre("Ciudadela del Ciego");
        barrio.setEstrato("2");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9054);
        barrio.setBar_nombre("Sector Bolivariana");
        barrio.setEstrato("2");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9055);
        barrio.setBar_nombre("San Fernando");
        barrio.setEstrato("2");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9060);
        barrio.setBar_nombre("CAMILO TORRES");
        barrio.setEstrato("2 - 3");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9061);
        barrio.setBar_nombre("Santos");
        barrio.setEstrato("3");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9062);
        barrio.setBar_nombre("Villa Mercedes");
        barrio.setEstrato("3");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9070);
        barrio.setBar_nombre("LAS COLINAS");
        barrio.setEstrato("3 - 2");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9071);
        barrio.setBar_nombre("11 de noviembre");
        barrio.setEstrato("2");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9072);
        barrio.setBar_nombre("Castilla");
        barrio.setEstrato("3");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9080);
        barrio.setBar_nombre("MALHABAR");
        barrio.setEstrato("3");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9081);
        barrio.setBar_nombre("Sector Malhabarrio II");
        barrio.setEstrato("3");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9090);
        barrio.setBar_nombre("ARANJUEZ");
        barrio.setEstrato("3");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9091);
        barrio.setBar_nombre("El Encuentro");
        barrio.setEstrato("3");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(9092);
        barrio.setBar_nombre("La Paz");
        barrio.setEstrato("2");
        barrio.setComuna(9);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10010);
        barrio.setBar_nombre("URIBE");
        barrio.setEstrato("3");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10011);
        barrio.setBar_nombre("Villa Nueva");
        barrio.setEstrato("3");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10012);
        barrio.setBar_nombre("El Palmar");
        barrio.setEstrato("3");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10020);
        barrio.setBar_nombre("VELEZ");
        barrio.setEstrato("4 - 3");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10022);
        barrio.setBar_nombre("Los Alamos");
        barrio.setEstrato("4");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10030);
        barrio.setBar_nombre("COLOMBIA");
        barrio.setEstrato("3");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10040);
        barrio.setBar_nombre("EL PRADO");
        barrio.setEstrato("3");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10050);
        barrio.setBar_nombre("BAJO PRADO");
        barrio.setEstrato("3");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10060);
        barrio.setBar_nombre("GONZALEZ");
        barrio.setEstrato("1-2");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10070);
        barrio.setBar_nombre("PERSIA");
        barrio.setEstrato("2");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10071);
        barrio.setBar_nombre("Bajo Persia");
        barrio.setEstrato("1-2");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10072);
        barrio.setBar_nombre("Isabela");
        barrio.setEstrato("2");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10073);
        barrio.setBar_nombre("Eucaliptus");
        barrio.setEstrato("3");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10074);
        barrio.setBar_nombre("Portal Eucaliptus");
        barrio.setEstrato("3");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10075);
        barrio.setBar_nombre("Portal de San Luis");
        barrio.setEstrato("3");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10080);
        barrio.setBar_nombre("GUAMAL");
        barrio.setEstrato("3");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10081);
        barrio.setBar_nombre("La Fuente");
        barrio.setEstrato("4");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10082);
        barrio.setBar_nombre("Galicia");
        barrio.setEstrato("4");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10090);
        barrio.setBar_nombre("EL PARAISO");
        barrio.setEstrato("1");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10100);
        barrio.setBar_nombre("VILLA CARMENZA");
        barrio.setEstrato("4");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10110);
        barrio.setBar_nombre("ARRAYANES");
        barrio.setEstrato("3");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10120);
        barrio.setBar_nombre("CERVANTES");
        barrio.setEstrato("3");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10130);
        barrio.setBar_nombre("NEVADO");
        barrio.setEstrato("2");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10131);
        barrio.setBar_nombre("Andes");
        barrio.setEstrato("2");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10132);
        barrio.setBar_nombre("Bajo Nevado");
        barrio.setEstrato("1");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10133);
        barrio.setBar_nombre("Panamericana");
        barrio.setEstrato("1");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10140);
        barrio.setBar_nombre("MARMATO");
        barrio.setEstrato("1");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10141);
        barrio.setBar_nombre("La Isla");
        barrio.setEstrato("1");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(10142);
        barrio.setBar_nombre("Solidaridad");
        barrio.setEstrato("1");
        barrio.setComuna(10);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11010);
        barrio.setBar_nombre("SAN ANTONIO");
        barrio.setEstrato("3");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11020);
        barrio.setBar_nombre("20 DE JULIO");
        barrio.setEstrato("1-2");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11021);
        barrio.setBar_nombre("Solidaridad");
        barrio.setEstrato("1-2");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11030);
        barrio.setBar_nombre("EL CARMEN");
        barrio.setEstrato("1-2");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11031);
        barrio.setBar_nombre("Campamento");
        barrio.setEstrato("1");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11032);
        barrio.setBar_nombre("La Providencia");
        barrio.setEstrato("1");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11033);
        barrio.setBar_nombre("Albania");
        barrio.setEstrato("1");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11034);
        barrio.setBar_nombre("El Rocio");
        barrio.setEstrato("1");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11040);
        barrio.setBar_nombre("CASTELLANA");
        barrio.setEstrato("6");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11050);
        barrio.setBar_nombre("EL BOSQUE");
        barrio.setEstrato("3");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11051);
        barrio.setBar_nombre("Bosconia");
        barrio.setEstrato("1");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11060);
        barrio.setBar_nombre("BUENA ESPERANZA");
        barrio.setEstrato("2 - 3 - 1");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11070);
        barrio.setBar_nombre("NOGALES");
        barrio.setEstrato("3");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11071);
        barrio.setBar_nombre("Portal de Nogales");
        barrio.setEstrato("3");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11080);
        barrio.setBar_nombre("PANORAMA");
        barrio.setEstrato("2");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11081);
        barrio.setBar_nombre("Nuevo Horizontes");
        barrio.setEstrato("2");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11082);
        barrio.setBar_nombre("La Montaña");
        barrio.setEstrato("2");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11090);
        barrio.setBar_nombre("CENTENARIO");
        barrio.setEstrato("3");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11091);
        barrio.setBar_nombre("Villa Kempis");
        barrio.setEstrato("2");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11092);
        barrio.setBar_nombre("Chapinero");
        barrio.setEstrato("1");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11100);
        barrio.setBar_nombre("ESTAMBUL");
        barrio.setEstrato("3");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11101);
        barrio.setBar_nombre("Villa Jardín");
        barrio.setEstrato("3");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11102);
        barrio.setBar_nombre("Torres de Esponsion");
        barrio.setEstrato("3");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11103);
        barrio.setBar_nombre("Niño Jesús de Praga");
        barrio.setEstrato("2");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11104);
        barrio.setBar_nombre("Granjas de Estambul");
        barrio.setEstrato("2");
        barrio.setComuna(11);
        getListabarrios().add(barrio);
        barrio = new Barrio();

        barrio.setBar_codigo(11105);
        barrio.setBar_nombre("Esstación Uribe");
        barrio.setEstrato("2");
        barrio.setComuna(11);
        getListabarrios().add(barrio);

        for (Barrio barrio1 : listabarrios) {
//            System.out.println("lista de barrios " + barrio1.getBar_nombre() + "Estrato " + barrio1.getEstrato());
        }

        return listabarrios;
    }

    public String CargarComunas() {
        comuna.setCom_codigo(1);
        comuna.setCom_nombre("COMUNA ATARDECERES");
        getListacomunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(2);
        comuna.setCom_nombre("COMUNA SAN JOSÉ");
        getListacomunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(3);
        comuna.setCom_nombre("COMUNA CUMANDAY");
        getListacomunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(4);
        comuna.setCom_nombre("COMUNA ESTACIÓN");
        getListacomunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(5);
        comuna.setCom_nombre("COMUNA CIUDADELA DEL NORTE");
        getListacomunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(6);
        comuna.setCom_nombre("COMUNA ECOTURÍSTICO CERRO DE ORO");
        getListacomunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(7);
        comuna.setCom_nombre("COMUNA TESORITO");
        getListacomunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(8);
        comuna.setCom_nombre("COMUNA PALOGRANDE");
        getListacomunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(9);
        comuna.setCom_nombre("COMUNA UNIVERSITARIA");
        getListacomunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(10);
        comuna.setCom_nombre("COMUNA LA FUENTE");
        getListacomunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(11);
        comuna.setCom_nombre("COMUNA LA MACARENA");
        getListacomunas().add(comuna);

        for (Comuna comuna1 : listacomunas) {
//            System.out.println("Comunas " + comuna1.getCom_nombre() + " Codigo " + comuna1.getCom_codigo());
        }

        return null;
    }

}
