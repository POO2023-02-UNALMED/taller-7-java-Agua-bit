package comunicacion;

import java.util.List;
import java.util.Arrays;

public class Alfabeto extends Pictograma{

    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String interpretacion(){
        return interpretacion;
    }

    public String toString(){
        String alfabeto = "";
        for(i=0, i<this.letras.size() ,i++){
            alfabeto += letras[i] +", ";
        }
        return alfabeto;
    }
}
