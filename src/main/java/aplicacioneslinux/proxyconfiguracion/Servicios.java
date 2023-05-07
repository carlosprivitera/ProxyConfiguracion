/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacioneslinux.proxyconfiguracion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author carlos
 */
public class Servicios {

    private JTextArea textArea;
    private String error = "";
    
    public Servicios(JTextArea textArea) {
        this.textArea = textArea;
    }
    
    public String mostrarContenidoArchivo(String rutaArchivo) {
        error="";
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            textArea.setText("");
            while ((linea = br.readLine()) != null) {
                textArea.append(linea + "\n");
            }
        } catch (IOException e) {
            error = e.getMessage(); //e.printStackTrace();
        } catch (Exception e) {
            error = e.getMessage();
        }
        return error;
    }
    
    public void agregarProxy(String textToFind, String textToAppend) {
      if (textArea.getText().contains(textToFind)) {
        // If text to find is already present in the text area, do nothing
        return;
      } else {
        // If text to find is not present in the text area, append the text to append to the end
        textArea.append(textToAppend + "\n");
      }
    }


  public void saveTextAreaToFile(JTextArea textArea, String filePath) {
    try {
        File file = new File(filePath);
        if (file.exists()) {
            //// Si el archivo ya existe, hacer una copia con la fecha y hora actual en el nombre de archivo
            String currentDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss"));
            String backupPath = filePath + ".copia-" + currentDate;
            File backupFile = new File(backupPath);
            if (!file.renameTo(backupFile)) {
                System.err.println("No se pudo realizar la copia de seguridad del archivo: " + filePath + ". Ejecutar este programa como # administrador o con $ sudo.");
                return;
            }
        }
        try {
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write(textArea.getText());
        } catch (IOException e) {     
          String error = "Error: 04 " + e.getMessage() + ". Ejecutar este programa como # administrador o con $ sudo.";
          JOptionPane.showMessageDialog(null, error);
        } catch(Exception e) {
          JOptionPane.showMessageDialog(null, "Error: 03 " + e.getMessage());    
        }
    } catch (SecurityException e) {
        String error = "Error: 02 " + e.getMessage() + ". No tienen los permisos necesarios para escribir en el archivo. Ejecutar este programa como # administrador o con $ sudo.";
        JOptionPane.showMessageDialog(null, error);
    } catch(Exception e) {
        JOptionPane.showMessageDialog(null, "Error: 01 " + e.getMessage());
    }
  }
    
}
