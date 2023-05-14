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
    
    public static final String cadenasProxy[] = {   
      "Acquire::http::proxy", "Acquire::https::proxy", "Acquire::ftp::proxy", "Acquire::http::proxy::no-proxy", 
      "export http_proxy=", "export https_proxy=", "export ftp_proxy=", "export no_proxy=",
      "http_proxy=", "https_proxy=", "ftp_proxy=", "no_proxy=",
   
    };
    
    
    public static final String datosArchivoProxy = "datosConfiguracionProxy.txt";
    public static final String environment  = "/etc/environment";
    public static final String aptConf  = "/etc/apt/apt.conf";
    public static final String bashBashrc  = "/etc/bash.bashrc";
    public static final String wgetrc  = "/etc/wgetrc";
    
    public static String http = "http://miProxy.com:8080/";
    public static String https = "http://miProxy.com:8080/";
    public static String ftp = "http://miProxy.com:8080/";
    public static String httpUsuarioClave = "http://usuario:clave@miProxy.com:8080/";
    public static String httpsUsuarioClave = "http://usuario:clave@miProxy.com:8080/";
    public static String ftpUsuarioClave = "http://usuario:clave@miProxy.com:8080/";
    public static String no_proxy = "localhost, 127.0.0.1, localaddress, .localdomain.com, 127.0.0.0/8, ::1";
   // public static String usuario = "";
   // public static String clave = "";
    
}
