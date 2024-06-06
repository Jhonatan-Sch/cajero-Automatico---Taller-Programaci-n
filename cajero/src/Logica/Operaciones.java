/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author Jhonatan Schneider
 */
public class Operaciones {
    
    /**
     * Muestra el saldo actual de una cuenta especifica
     *
     *@param ruta La direccion de la ruta donde se encuentra almacenada la informacion de la cuenta.
     * @return Retorna el saldo de la cuenta .
     * @throws IllegalArgumentException si la ruta de entrada es incorrecta o no existe.
     */
    public String SaldoActual(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en partes usando el delimitador ":"
                String[] partes = linea.split(":");
                return partes[0];
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ""; 
    }
    
   /**
     * Muestra el tipo de moneda de una cuenta especifica.
     *
     * @param ruta La direccion de la ruta donde se encuentra almacenada la informacion de la cuenta.
     * @return Retorna el tipo de moneda de la cuenta.
     * @throws IllegalArgumentException si la ruta de entrada es incorrecta o no existe.
     */
    public String MonedaCuenta(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en partes usando el delimitador ":"
                String[] partes = linea.split(":");
                return partes[1];
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ""; // No coincide o hubo un error
    }
    
     /**
     * Modifica el saldo actual de una cuenta especifica.
     *
     * @param rutaArchivo La direccion de la ruta donde se encuentra almacenada la informacion de la cuenta.
     * @param nuevoNumero La saldo restante de la cuenta despues de alguna transaccion.
     * @throws IllegalArgumentException si la ruta de entrada es incorrecta o no existe.
     */
   public void modificarSaldo(String rutaArchivo, String nuevoNumero) {
       File archivo = new File(rutaArchivo);
        // Crear un objeto StringBuilder para construir el nuevo contenido del archivo
        StringBuilder nuevoContenido = new StringBuilder();
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                // Separar la línea en dos partes utilizando ":" como delimitador
                String[] partes = linea.split(":");
                if (partes.length >= 2) {
                    // Reemplazar el primer componente con el nuevo número
                    partes[0] = nuevoNumero;
                    // Reconstruir la línea con los componentes modificados
                    nuevoContenido.append(String.join(":", partes)).append("\n");
                } else {
                    // Si la línea no tiene el formato esperado, agregarla sin modificaciones
                    nuevoContenido.append(linea).append("\n");
                }
            }
            br.close();
            // Sobrescribir el archivo con el nuevo contenido
            FileWriter fw = new FileWriter(archivo);
            fw.write(nuevoContenido.toString());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
   /**
     *Busca la ruta en la que se encuetra almacenado el archivo txt que contiene la informacion de la cuenta de una cuenta.
     *
     * @param numeroCuenta El numero de cuenta de la cual se desea saber la ruta en la que esta guardada.
     */
   public  File buscarArchivoPorNumeroCuenta(String numeroCuenta) {
        String rutaCuentas = "C:\\Archivos gestor\\Cuentas";

        File directorioCuentas = new File(rutaCuentas);

        if (!directorioCuentas.exists() || !directorioCuentas.isDirectory()) {
            System.err.println("El directorio de cuentas no existe.");
            return null;
        }

        // Obtener una lista de los subdirectorios (carpetas de usuarios) dentro del directorio de cuentas
        File[] usuarios = directorioCuentas.listFiles(File::isDirectory);
        for (File usuario : usuarios) {
            for (String subcarpeta : new String[]{"Cuenta Ahorro", "Cuenta Corriente"}) {
                for (int i = 1; i <= 4; i++) {
                    File cuenta = new File(usuario, subcarpeta + "\\cuenta" + i + ".txt");
                    if (buscarNumeroCuentaEnArchivo(cuenta, numeroCuenta)) {
                        return cuenta;
                    }
                }
            }
        }

        // Si no se encontró ninguna coincidencia, retornar null
        return null;
    }

   /**
     * Es un metodo que ayuda a la busqueda de cuentas en los archivos txt.
     *
     * @param archivo El archivo o carpeta en la cual se desea buscar el archivo con el numero de cuenta asociado.
     * @param numeroCuenta El numero de cuenta de la cuenta que se desea buscar la informacion y obtener la ruta asociada.
     *@return Devuelve si existe o no el archivo txt con el numero de cuenta asociada.
     * @throws IllegalArgumentException Se ingresa un parametro con distinto tipo de dato.
     */
    private boolean buscarNumeroCuentaEnArchivo(File archivo, String numeroCuenta) {
        if (archivo.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    // Dividir la línea en partes usando ":" como delimitador
                    String[] partes = linea.split(":");
                    if (partes.length >= 3 && partes[2].equals(numeroCuenta)) {
                        return true;
                    }
                }
            } catch (IOException e) {
                System.err.println("Error al leer el archivo: " + e.getMessage());
            }
        }
        return false;
    }
    
    /**
     * Consigue el tipo de moneda de una cuenta y su valor.
     *
     * @param moneda El nombre abreviado del tipo de moneda.
     * @return Retorna el valor de la moneda ingresada estas convertidas en el precio de 1 dolar.
     * @throws IllegalArgumentException Si la moneda ingresada no existe en los casos disponibles.
     */
    private double getTipoMoneda(String moneda) {
        switch (moneda) {
            case "USD":
                return 1.0;   // Dólar estadounidense
            case "EUR":
                return 0.91;  // Euro
            case "BS":
                return 6.96;  // Boliviano
            case "CNY":
                return 6.92;  // Yuan chino
            default:
                throw new IllegalArgumentException("Código de moneda no válido.");
        }
    }

    /**
     * Realiza la conversion del tipo de moneda de un tipo a otro.
     *
     * @param monedaOrigen La moneda de origen de la cuenta que esta logeada.
     * @param monedaDestino La moneda de destino de la cuenta a la cual se hara la transferencia.
     * @param monto El monto el cual sera convertido del tipo de moneda de origen al del destino.
     * @return Retorna el monto convertido al tipo de moneda destino.
     */
    public double convertirMoneda(String monedaOrigen, String monedaDestino, double monto) {
        // Obtener el tipo de cambio para la moneda de origen
        double tasaOrigen = getTipoMoneda(monedaOrigen);

        // Obtener el tipo de cambio para la moneda de destino
        double tasaDestino = getTipoMoneda(monedaDestino);

        // Convertir el monto a dólares (USD)
        double montoEnUsd = monto / tasaOrigen;

        // Convertir de dólares (USD) a la moneda de destino
        double montoConvertido = montoEnUsd * tasaDestino;

        return montoConvertido;
    }
}
