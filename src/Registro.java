import java.util.ArrayList;

public class Registro {
    ArrayList <Campo> campos = new ArrayList();
    String nombre;
    int indice;

    public Registro() {
        
    }

    public Registro(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Campo> getCampos() {
        return campos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCampos(ArrayList<Campo> campos) {
        this.campos = campos;
    }
    
    public Campo getCampo(int n) {
        return campos.get(n);
    }

    public void setCampo(Campo c) {
        campos.add(c);
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    @Override
    public String toString() {
        return campos.get(0).getContenido();
    }
    
    public int getTamano() {
        return campos.size() * 2;
    }
}
