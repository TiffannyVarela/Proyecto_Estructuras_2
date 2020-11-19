/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author tiffa
 */
public class Admin_Campos {
    private ArrayList<Campo> campos = new ArrayList();
    private File archivo = null;
    
    private Campo camp;


    public Admin_Campos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Campo> getCampos() {
        return campos;
    }

    public void setCampos(ArrayList<Campo> campos) {
        this.campos = campos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Write_Campos{" + "campos=" + campos + ", archivo=" + archivo + '}';
    }
    
    public void Cargar(){
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea=br.readLine())!=null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
        e.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
        }
//        try {
//            campos = new ArrayList();
//            Campo temp;
//                FileInputStream entrada = new FileInputStream(archivo);
//                ObjectInputStream objeto = new ObjectInputStream(entrada);
//                try {
//                    while ((temp = (Campo) objeto.readObject()) != null){
//                        campos.add(temp);
//                        
//                    }
//                } catch (Exception e) {
//                }
//                objeto.close();
//                entrada.close();
//        } catch (Exception e) {
//        }
    }
    
    public void Escribir(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(archivo);
            pw = new PrintWriter(fichero);

            for (int i = 0; i < campos.size(); i++)
                pw.println(campos.get(i));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
//        FileOutputStream fw = null;
//        ObjectOutputStream bw = null;
//        try {
//            fw = new FileOutputStream(archivo);
//            bw = new ObjectOutputStream(fw);
//            for (Campo campo : campos) {
//                bw.writeObject(campo);
//            }
//            bw.flush();
//        } catch (Exception e) {
//        } finally {
//            try {
//                bw.close();
//                fw.close();
//            } catch (Exception e) {
//            }
//        }
    }
    
    
}
