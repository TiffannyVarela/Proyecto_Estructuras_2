import java.util.ArrayList;

public class Archivo {
    ArrayList <Registro> registros = new ArrayList();
    String nombre;
    
    public Archivo() {
    }

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(ArrayList<Registro> registros) {
        this.registros = registros;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Registro getRegistro(int n) {
        return registros.get(n);
    }

    public String getNombre() {
        return nombre;
    }

    public void setRegistros(Registro r) {
        registros.add(r);
    }
}
