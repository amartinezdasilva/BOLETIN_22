/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_22;

/**
 *
 * @author AAron
 */
public class Boletin_22 {

    public static void main(String[] args) {
          Metodos obx=new Metodos();   
        obx.crearArray();
        obx.crearFichero("Libreria.txt");
        obx.leerFicheiro("Libreria.txt");
        obx.engadir("Libreria.txt",new Libros("Libro5","Pepe",5f,5));
        obx.buscarAutor();
        obx.consultarTitulo();
        obx.modificar();
        obx.eliminar();
        obx.ordenar();
    }
    
}
