/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad4;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Asignatura {
    private String codigo;
    private String nombre;
    private ArrayList<Docente> docentes = new ArrayList<>();

    public Asignatura(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarDocente(Docente d) {
        this.docentes.add(d);
        d.agregarAsignatura(this);
    }
}
