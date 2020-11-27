
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {
    private ArrayList <Campo> listaCampo = new ArrayList();
    private File archivo = null;
    
    public Archivo(){
    }
    
    public Archivo(String path) throws IOException {
        archivo = new File(path);
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo,false);//Remplazar todo
            bw = new BufferedWriter(fw);
            bw.write("");
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public Archivo(File file) {
        archivo = file;
    }
    

    public ArrayList<Campo> getListaCampo() {
        return listaCampo;
    }

    public void setlistaCampo(ArrayList<Campo> listaCampo) {
        this.listaCampo = listaCampo;
    }
    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }    
    
    public void setCampo(Campo p)
    {
       this.listaCampo.add(p);
    }

    @Override
    public String toString() {
        return "AdminCampo{" + "listaCampo=" + listaCampo + ", archivo=" + archivo + '}';
    }
    public void cargarArchivo() throws IOException
    {
       try {            
            listaCampo= new ArrayList();
            Campo temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Campo) objeto.readObject()) != null) {
                        listaCampo.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void escribirArchivo()
    {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Campo t : listaCampo) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}

