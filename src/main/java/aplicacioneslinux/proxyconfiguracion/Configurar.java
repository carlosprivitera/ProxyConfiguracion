/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacioneslinux.proxyconfiguracion;

/**
 *
 * @author carlos
 */
public class Configurar {
    public static final String datosArchivoProxy = "datosConfiguracionProxy.txt";
    public static final String environment  = "/etc/environmentzz";
    public static final String aptConf  = "/etc/apt/apt.confzz";
    public static final String bashBashrc  = "/etc/bash.bashrczz";
    public static final String wgetrc  = "/etc/wgetrczz";
    
    public static String http = "http://miproxy.com:8080";
    public static String https = "http://miproxy.com:8080";
    public static String ftp = "http://miproxy.com:8080";
    public static String no_proxy = "localhost, 127.0.0.1, localaddress, .localdomain.com, 127.0.0.0/8, ::1";
    public static String usuario = "";
    public static String clave = "";
    
}
