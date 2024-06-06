/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jhonatan Schneider
 */
public class Idioma {
      
    /**
     * Lee una fila especifica en un archivo txt
     *
     * @param numeroFila El numero de fila a leer en el archivo, debe ser positiva.
     * @param direccion La direccion de donde se encuentra ubicado el archivo txt a leer.
     * @return El contenido de la fila seleccionada.
     * @throws IllegalArgumentException si el numero de fila no existe o es un tipo de dato diferente a int.
     */
public String leerFila(int numeroFila,String direccion) {
        String contenidoFila = "";
        try {
            FileReader fr = new FileReader(direccion);
            BufferedReader br = new BufferedReader(fr);
            for (int i = 1; i <= numeroFila; i++) {
                contenidoFila = br.readLine();
                if (contenidoFila == null) return "";
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenidoFila;
    }     
  
/**
     * 
     * Guarda en un archivo txt el texto seleccionado el cual esta establecido en la interfaz.
     *
     * @param texto El texto a ser guardado en el archivo txt Estado.txt.
     * @throws IllegalArgumentException si el texto a ser ingresado para ser guardado esta vacio.
     * Guarda un texto especifico para usarlo en la direccion de las rutas para el manejo de los distintos idiomas en el programa.
     */
    public void guardarEnArchivo(String texto) {
        String ruta = "C:\\Archivos gestor\\Idiomas\\Estado.txt"; 
        try {
            FileWriter fw = new FileWriter(ruta, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
