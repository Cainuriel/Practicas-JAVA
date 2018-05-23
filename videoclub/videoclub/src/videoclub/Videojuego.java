/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

/**
 *
 * @author SOIB1A07
 */
public class Videojuego implements Entregable{
    
    String titulo;
    int duracion;
    boolean entregado;
    String companyia;
    String genero;

    public Videojuego() {
        titulo = null;
        duracion = 10;
        entregado = false;
        companyia =null;
        genero = null;
    }

    public Videojuego(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
        entregado=false;
        companyia=null;
        genero=null;
    }

    public Videojuego(String titulo, int duracion, String companyia, String genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.companyia = companyia;
        this.genero = genero;
        entregado=false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCompanyia() {
        return companyia;
    }

    public void setCompanyia(String companyia) {
        this.companyia = companyia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public String toString() {
        
        return "Juego: "+getTitulo()+
                " es del género: "+ getGenero();    
}
    
    @Override
    public void entregar() {
        
        entregado=true;
        
    }
    
    @Override
    public void devolver() {
        
        entregado=false;
    }
    
    @Override
    public boolean isentregado() {
        
        return entregado;
        
    }
    
    /**
     *
     * @param a primer objeto a comparar
     * @param b segundo objeto a comparar
     * @return devuelve un String, resultado de la ocmparación
     */
    @Override
 public String compareTo(Object a) {
  
  if (a instanceof Videojuego) {
            Videojuego auxiliar = (Videojuego) a;
            
            if (this.getDuracion() == auxiliar.getDuracion()) {
                return "Dura lo mismo que:";
            }
            if (this.getDuracion() < auxiliar.getDuracion()) {
                
                return "Tiene más duración que:";
            } else {
                
                return "Tiene menos duración que:";
                
            }
            
        }
        
        return "No es un Videojuego, se trata de una Serie";
        
    }
     
     
     
 }    
    
    
    
