/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jhonatan Schneider
 */
public class Registros {
    
    /**
     * Guarda el registro de transacciones realizadas en ua cuenta.
     *
     * @param monto El monto de la transaccion realizada.
     * @param id el id del Usuario que realizo la transaccion.
     * @param tipoAccion La accion realizada por el usuario(Deposito, Retiro, Transferencia).
     * @param cuenta La ruta de la cuenta de donde se realizo la transferencia.
     * @throws IllegalArgumentException si la ruta de entrada es incorrecta o no existe.
     */
    public void guardarRegistroOperaciones(String monto,String id, int tipoAccion, String cuenta) {

        String accion = obtenerAccion(tipoAccion);

        String fechaHoraActual = obtenerFechaHoraActual();

        String registro = fechaHoraActual + ";" + accion + ";" + monto+";"+cuenta;

        String rutaArchivo = "C:\\Archivos gestor\\Cuentas\\"+id+"\\registroActividades.txt";

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            escritor.write(registro);
            escritor.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *Obtiene la accion realizada por el usario.
     *
     * @param tipoAccion El numero de accion realizada(En este caso van desde el 1 hasta el 5).
     * @return Devuelve el tipo de accion realizada.
     */
    private String obtenerAccion(int tipoAccion) {
        String accion;
        switch (tipoAccion) {
            case 1:
                accion = "Deposito";
                break;
            case 2:
                accion = "Retiro";
                break;
            case 3:
                accion = "Consulta de saldo";
                break;
            case 4:
                accion = "Transferencia";
                break;
            case 5:
                accion = "Cambio de Pin";
                break;
            default:
                accion = "Acción Desconocida";
                break;
        }
        return accion;
    }
    
/**
     * Obtiene la fecha y hora acutal en la que se realizo la transaccion.
     *
     * @return Retorna la fecha y hora actual del sistema.
     */
    public String obtenerFechaHoraActual() {
        // Obtener la fecha y hora actual en el formato deseado
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fechaHoraActual = new Date();
        return formatter.format(fechaHoraActual);
    }
    
}
