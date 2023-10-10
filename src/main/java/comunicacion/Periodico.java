package comunicacion;

public class Periodico extends Escrito{

    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
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

    @Override
    public int palabrasTotales(int e){
        return e * this.getPaginas() * 10;
    }

    @Override
    public String toString(){
        return (this.getOrigen() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + getFecha() + "\n" +
                getPrimicia());
    }
}

