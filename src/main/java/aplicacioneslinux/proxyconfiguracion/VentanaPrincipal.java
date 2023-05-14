/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplicacioneslinux.proxyconfiguracion;

import java.awt.Color;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class VentanaPrincipal extends javax.swing.JFrame {
     private String jarFileName = "";
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        //this.setLocationRelativeTo(null);
        initComponents();
        s = new Servicios(this.jTextArea1);
        vpp = new VentanaPedirProxy(this, true);
        this.jLabel1.setText("");
        this.jLabel2.setText("Ayuda");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configurar Proxy:");
        setSize(new java.awt.Dimension(400, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButton1.setText("Leer");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setText("Guardar");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jSeparator3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSeparator3.setMaximumSize(new java.awt.Dimension(20, 32767));
        jSeparator3.setMinimumSize(new java.awt.Dimension(20, 0));
        jSeparator3.setPreferredSize(new java.awt.Dimension(20, 0));
        jToolBar1.add(jSeparator3);

        jButton4.setText("Configurar Proxy");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton5.setText("Comentar Si/No");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton3.setText("Agregar Proxy a  ==>");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator2);

        jLabel1.setText("jLabel1");
        jToolBar1.add(jLabel1);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.NORTH);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Liberation Mono", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel2.setText("Ayuda");
        getContentPane().add(jLabel2, java.awt.BorderLayout.PAGE_END);

        jMenu1.setText("Archivos");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Leer");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Guardar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acción");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("Configurar proxy ...");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setText("Comentar Si/No");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Agregar proxy");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(621, 492));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private VentanaUsuario vu = new VentanaUsuario(this, true);
    private Servicios s = null;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        leerArchivo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void leerArchivo() {
        vu.setLocationRelativeTo(this);
        vu.setDefaultCloseOperation(VentanaUsuario.HIDE_ON_CLOSE);
        vu.setVisible(true);
        String seleccion = vu.getSeleccion();
        if(!seleccion.equals("")) {
          String error = s.mostrarContenidoArchivo(seleccion);
          if(error.equals("")) {
            this.jLabel1.setText(seleccion);
            this.jLabel2.setText("Archivo cargado correctamente.");
            this.jTextArea1.setEditable(true);
            this.jButton2.setForeground(null);
          }else{
            this.jLabel1.setText("");
            this.jLabel2.setText(error);
            JOptionPane.showMessageDialog(this, error, "Error de archivo.", JOptionPane.ERROR_MESSAGE);
          }            
        }    
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        agregarProxy(evt);
    }//GEN-LAST:event_jButton3ActionPerformed
    private void agregarProxy(java.awt.event.ActionEvent evt) {
        if(this.jLabel1.getText().equals("")) {
          jButton1ActionPerformed(evt);    
        }
        if(!jLabel1.getText().equals("")) {
          int a=0;  
          if(this.jLabel1.getText().equals(Configurar.aptConf)){
               // s.agregarComentario("\n##Creado por Configurar Proxy. Comentar estas líneas cuando no se usen.");
            a=a+s.agregarProxy("Acquire::http::proxy ", "\"" + Configurar.http + "\"", "\n", "\n");
            a=a+s.agregarProxy("Acquire::https::proxy ", "\"" + Configurar.https + "\"", "", "\n");
            a=a+s.agregarProxy("Acquire::ftp::proxy ", "\"" + Configurar.ftp + "\"", "", "\n");
            a=a+s.agregarProxy("Acquire::http::proxy::no-proxy ", "\"" + Configurar.no_proxy + "\"", "\n", "\n\n");
               // s.agregarComentario("\n## Fin configurar proxy /////////////////// \n");
          }
          if(this.jLabel1.getText().equals(Configurar.bashBashrc)){
               // s.agregarComentario("\n##Creado por Configurar Proxy. Comentar estas líneas cuando no se usen.");
            a=a+s.agregarProxy("export http_proxy=", Configurar.http, "\n", "\n");
            a=a+s.agregarProxy("export https_proxy=", Configurar.https, "", "\n");
            a=a+s.agregarProxy("export ftp_proxy=", Configurar.ftp, "", "\n");
            a=a+s.agregarProxy("export no_proxy=", "\"" + Configurar.no_proxy + "\"", "\n", "\n\n");
               // s.agregarComentario("\n## Fin configurar proxy /////////////////// \n");
          }
          if(this.jLabel1.getText().equals(Configurar.environment)){
               // s.agregarComentario("\n##Creado por Configurar Proxy. Comentar estas líneas cuando no se usen.");
            a=a+s.agregarProxy("http_proxy=", "\"" + Configurar.http + "\"", "\n", "\n");
            a=a+s.agregarProxy("https_proxy=", "\"" + Configurar.https + "\"", "", "\n");
            a=a+s.agregarProxy("ftp_proxy=", "\"" + Configurar.ftp + "\"", "", "\n");
            a=a+s.agregarProxy("no_proxy=", "\"" + Configurar.no_proxy + "\"", "\n", "\n\n");
               // s.agregarComentario("\n## Fin configurar proxy /////////////////// \n");
          }
          if(this.jLabel1.getText().equals(Configurar.wgetrc)){
              //  s.agregarComentario("\n##Creado por Configurar Proxy. Comentar estas líneas cuando no se usen.");
            a=a+s.agregarProxy("http_proxy=", Configurar.http, "\n", "\n");
            a=a+s.agregarProxy("https_proxy=", Configurar.https, "", "\n");
            a=a+s.agregarProxy("ftp_proxy=", Configurar.ftp, "", "\n");
            a=a+s.agregarProxy("no_proxy=", Configurar.no_proxy, "\n", "\n\n");
                //s.agregarComentario("\n## Fin configurar proxy /////////////////// \n");
          }
          if(a>0) {
              this.jLabel2.setText("Se agregaron," + a + ", modificaciones al archivo. Debe guardar el archivo.");
              this.jButton2.setForeground(Color.red);
          }else {
              this.jLabel2.setText("No hubieron cambios en el archivo, no se agregó ninguna configuración proxy.");
          }    
        }  
    }
    private VentanaPedirProxy vpp = null; //new VentanaPedirProxy(this, true)
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        vpp.setDefaultCloseOperation(HIDE_ON_CLOSE);
        vpp.setLocationRelativeTo(null);
        vpp.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        agregarProxy(evt);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        llamarConfigurarProxy();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void llamarConfigurarProxy() {
        vpp.setDefaultCloseOperation(HIDE_ON_CLOSE);
        vpp.setLocationRelativeTo(this);
        vpp.setVisible(true);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       guardarArchivo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void guardarArchivo() {
        if(!jLabel1.getText().equals("")) {
          String error = s.saveTextAreaToFile(jTextArea1, jLabel1.getText());
          if(error.equals("")) {
            this.jLabel2.setText("Archivo guardado y copia de seguridad realizada.");
            this.jButton2.setForeground(null);
          }else{
            JOptionPane.showMessageDialog(this, error, "Error al guardar", JOptionPane.ERROR_MESSAGE);
            this.jLabel2.setText("Archivo no guardado.");
          }
        }else {
            this.jLabel2.setText("No ha abierto ningún archivo, primero debe leer un archivo.");
        }  
    }
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        leerArchivo();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        guardarArchivo();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        llamarConfigurarProxy();
        try {
          //jarFileName = new File(getClass().getProtectionDomain().getCodeSource().getLocation().getPath()).getName();
          jarFileName = new File(System.getProperty("java.class.path")).getPath();
          this.setTitle(this.getTitle() + " " + jarFileName);
        }catch(NullPointerException er) {
            jarFileName = "";
        }catch(Exception er) {
            jarFileName = "";
        }
    }//GEN-LAST:event_formWindowOpened

    private void jTextArea1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyTyped
        // TODO add your handling code here:
        if(this.jTextArea1.isEditable()==true) {
          this.jButton2.setForeground(Color.red);
          this.jLabel2.setText("Archivo modificado, debe guardar el archivo.");
        }  
    }//GEN-LAST:event_jTextArea1KeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        comentarSiNo();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        comentarSiNo();
    }//GEN-LAST:event_jMenuItem6ActionPerformed
   
    private void comentarSiNo() {
        int a = 0;
        a=s.buscarComentarSiNoConfiguracionProxy(Configurar.cadenasProxy);
        if(a>0) {
          this.jLabel2.setText("Se agregaron y/o se quitaron," + a + " #, comentario al archivo. Debe guardar el archivo.");
          this.jButton2.setForeground(Color.red);
        }else {
          this.jLabel2.setText("No se agregaron ni quitaron comentarios, #, al archivo.");  
        }
    }
    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
