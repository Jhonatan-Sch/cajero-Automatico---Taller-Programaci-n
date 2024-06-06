/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Logica.Idioma;
import Logica.Registros;
import Logica.Usuarios;
import java.awt.Color;
import java.io.File;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Jhonatan Schneider
 * 
 * Ventana para crear una nueva Cuenta
 */
public class CrearCuentaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    String ruta = "C:\\Archivos gestor\\Cuentas\\";
    Idioma I = new Idioma();
    String direccion = "C:\\Archivos gestor\\Idiomas\\" + I.leerFila(1,"C:\\Archivos gestor\\Idiomas\\Estado.txt");
    public CrearCuentaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null); 
        Aceptar.setText(I.leerFila(10,direccion));
        Salir.setText(I.leerFila(13,direccion));
        Atras.setText(I.leerFila(14,direccion));
        SubTitulo1.setText(I.leerFila(16,direccion));
        Nombre.setText(I.leerFila(17,direccion)+":");
        Apellido.setText(I.leerFila(18,direccion)+":");
        CI.setText(I.leerFila(19,direccion)+":"); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SubTitulo1 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        Aceptar = new javax.swing.JLabel();
        Panel6 = new javax.swing.JPanel();
        Atras = new javax.swing.JLabel();
        Panel04 = new javax.swing.JPanel();
        Salir = new javax.swing.JLabel();
        CI = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        ci = new javax.swing.JTextField();
        Mensaje = new javax.swing.JLabel();
        Mensaje1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 239, 82));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 675));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubTitulo1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        SubTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubTitulo1.setText("LLene los siguientes datos");
        jPanel1.add(SubTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1200, -1));

        Panel2.setBackground(new java.awt.Color(0, 205, 57));

        Aceptar.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Aceptar.setForeground(new java.awt.Color(255, 255, 255));
        Aceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Aceptar.setText("Aceptar");
        Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AceptarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 240, 60));

        Panel6.setBackground(new java.awt.Color(0, 205, 57));

        Atras.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Atras.setForeground(new java.awt.Color(255, 255, 255));
        Atras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Atras.setText("Atras");
        Atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AtrasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel6Layout = new javax.swing.GroupLayout(Panel6);
        Panel6.setLayout(Panel6Layout);
        Panel6Layout.setHorizontalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel6Layout.createSequentialGroup()
                .addComponent(Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        Panel6Layout.setVerticalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Atras, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(Panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 570, 240, 60));

        Panel04.setBackground(new java.awt.Color(115, 115, 115));

        Salir.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salir.setText("Salir");
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel04Layout = new javax.swing.GroupLayout(Panel04);
        Panel04.setLayout(Panel04Layout);
        Panel04Layout.setHorizontalGroup(
            Panel04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel04Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel04Layout.setVerticalGroup(
            Panel04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel04Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel04, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, 240, 60));

        CI.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        CI.setForeground(new java.awt.Color(255, 255, 255));
        CI.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CI.setText("Nro. Carnet:");
        jPanel1.add(CI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 450, 50));

        Nombre.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Nombre.setText("Nombre:");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 450, 50));

        Apellido.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Apellido.setForeground(new java.awt.Color(255, 255, 255));
        Apellido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Apellido.setText("Apellido:");
        jPanel1.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 450, 50));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 153, 0));
        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreMouseClicked(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 350, 50));

        apellido.setBackground(new java.awt.Color(255, 255, 255));
        apellido.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        apellido.setForeground(new java.awt.Color(0, 153, 0));
        apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apellidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                apellidoMouseEntered(evt);
            }
        });
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 350, 50));

        ci.setBackground(new java.awt.Color(255, 255, 255));
        ci.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        ci.setForeground(new java.awt.Color(0, 153, 0));
        ci.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ciMouseClicked(evt);
            }
        });
        jPanel1.add(ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 350, 50));

        Mensaje.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(255, 255, 255));
        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MensajeMouseClicked(evt);
            }
        });
        jPanel1.add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 1200, 80));

        Mensaje1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Mensaje1.setForeground(new java.awt.Color(255, 255, 255));
        Mensaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mensaje1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mensaje1MouseClicked(evt);
            }
        });
        jPanel1.add(Mensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 1200, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseEntered
        Panel2.setBackground(new Color(0,139,43));
    }//GEN-LAST:event_AceptarMouseEntered

    private void AtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseEntered
        Panel6.setBackground(new Color(0,139,43));
    }//GEN-LAST:event_AtrasMouseEntered

    private void AceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseExited
        Panel2.setBackground(new Color(0,205,57));
    }//GEN-LAST:event_AceptarMouseExited

    private void AtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseExited
        Panel6.setBackground(new Color(0,205,57));
    }//GEN-LAST:event_AtrasMouseExited

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        Inicio a = new Inicio();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Panel04.setBackground(new Color(70,70,70));
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Panel04.setBackground(new Color(115,115,115));
    }//GEN-LAST:event_SalirMouseExited

    private void AceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseClicked
        Usuarios a = new Usuarios();
        Mensaje.setText("");
        Mensaje1.setText("");
        String Direccion = "C:\\Archivos gestor\\Cuentas\\" + String.valueOf(a.ObtenerUltimoId()+1);
        if(nombre.getText().isEmpty() || apellido.getText().isEmpty() || ci.getText().isEmpty()){
         Mensaje.setText(I.leerFila(20,direccion));
        }else{
           if(a.Control("C:\\Archivos gestor\\Usuarios\\usuarios.txt",ci.getText(),2)){
             int numeroAleatorio = ThreadLocalRandom.current().nextInt(1000, 10000);
             String contraseña = Integer.toString(numeroAleatorio); 
             a.anadirUsuario(nombre.getText(), apellido.getText(), ci.getText(), contraseña);
             File directorio = new File(direccion);
             directorio.mkdirs();
             Mensaje.setText(I.leerFila(21,direccion));
             Mensaje1.setText(I.leerFila(22,direccion)+": "+ contraseña);
          }else{
             Mensaje.setText(I.leerFila(23,direccion));
           }      
        }   
    }//GEN-LAST:event_AceptarMouseClicked

    private void AtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseClicked
        CrearCuenta a = new CrearCuenta();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_AtrasMouseClicked

    private void MensajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MensajeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MensajeMouseClicked

    private void ciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ciMouseClicked
        Mensaje.setText("");
    }//GEN-LAST:event_ciMouseClicked

    private void apellidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoMouseEntered

    private void apellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoMouseClicked
        Mensaje.setText("");
    }//GEN-LAST:event_apellidoMouseClicked

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseClicked
        Mensaje.setText("");
    }//GEN-LAST:event_nombreMouseClicked

    private void Mensaje1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mensaje1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Mensaje1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearCuentaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCuentaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCuentaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCuentaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCuentaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aceptar;
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel Atras;
    private javax.swing.JLabel CI;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JLabel Mensaje1;
    private javax.swing.JLabel Nombre;
    private javax.swing.JPanel Panel04;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel6;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel SubTitulo1;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField ci;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
