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
    private ArrayList<Campo> temp = new ArrayList();
    private File archivo = null;

    private Campo camp;

    public Admin_Campos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Campo> getCampos() {
        return campos;
    }

    public void setCampos(ArrayList<Campo> x) {
        this.campos = x;
    }

    public void addCampo(Campo x) {
        this.campos.add(x);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Campo> getTemp() {
        return temp;
    }

    public void setTemp(ArrayList<Campo> temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Write_Campos{" + "campos=" + campos + ", archivo=" + archivo + '}';
    }

    public void Cargar() {
        try {
            Campo temp;
            // if (archivo.exists()) {
            FileInputStream entrada = new FileInputStream("./Creados/" + archivo);
            ObjectInputStream objeto = new ObjectInputStream(entrada);
            try {
                while ((temp = (Campo) objeto.readObject()) != null) {
                    campos.add(temp);
                }
            } catch (Exception e) {
            }
            objeto.close();
            entrada.close();
            //}
        } catch (Exception e) {
        }

//        FileReader fr = null;
//        BufferedReader br = null;
//        try {
//            fr = new FileReader("./Creados/" + archivo);
//            br = new BufferedReader(fr);
//            String linea;
//            while ((linea = br.readLine()) != null) {
//                System.out.println(linea);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (null != fr) {
//                    fr.close();
//                }
//            } catch (Exception e2) {
//                e2.printStackTrace();
//            }
//        }

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

    public void Escribir() {
        try {
            FileOutputStream fileoutput = new FileOutputStream("./Creados/" + archivo);
            ObjectOutputStream file = new ObjectOutputStream(fileoutput);
            for (Campo campo : campos) {
                file.writeObject(campo);
            }
            file.close();
        } catch (Exception e) {
        }
    }

    public boolean existe(Campo x) {
        for (int i = 0; i < campos.size(); i++) {
            if (x.getNombre().equals(campos.get(i).getNombre())) {
                return true;
            }
        }
        return false;
    }

    public void borrar(int x) {
        campos.remove(x);
            archivo.delete();
            Escribir();

    }

    public void modificar(Campo viejo, Campo nuevo) {

    }

//        FileWriter fichero = null;
//        PrintWriter pw = null;
//        try
//        {
//            fichero = new FileWriter(archivo);
//            pw = new PrintWriter(fichero);
//
//            for (int i = 0; i < campos.size(); i++)
//                pw.println(campos.get(i));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//           try {
//           // Nuevamente aprovechamos el finally para 
//           // asegurarnos que se cierra el fichero.
//           if (null != fichero)
//              fichero.close();
//           } catch (Exception e2) {
//              e2.printStackTrace();
//           }
//        }
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
