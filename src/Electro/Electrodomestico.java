package Electro;

public class Electrodomestico {
    //Atributos
    private String nombre;
    private double precioBase;
    private String color;
    private int consumoEnergia;
    private double peso;

    //Constructores
    public Electrodomestico(){
        this.nombre=nombre;
        this.precioBase=100.0;
        this.color="gris plata";
        this.consumoEnergia=10;
        this.peso=2.0;
    }
    public Electrodomestico(String nombreNuevo){
        this.nombre=nombreNuevo;
    }
    public Electrodomestico(double precioBase){
        this.precioBase=precioBase;
    }
    public Electrodomestico(String nombreNuevo, int consumoEnergiaNuevo){
        this.nombre=nombreNuevo;
        this.consumoEnergia=consumoEnergiaNuevo;
    }
    public Electrodomestico(String nombreNuevo, int precioBaseNuevo, String colorNuevo, int consumoEnergiaNuevo, double pesoNuevo){
        this.nombre=nombreNuevo;
        this.precioBase=precioBaseNuevo;
        this.color=colorNuevo;
        this.consumoEnergia=consumoEnergiaNuevo;
        this.peso=pesoNuevo;
    }

    //Metodos
    //Get
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecioBase(){
        return this.precioBase;
    }
    public String getColor(){
        return this.color;
    }
    public int getConsumoEnergia(){
        return this.consumoEnergia;
    }
    public double getPeso(){
        return this.peso;
    }

    //Set
    public void settNombre(String nombreNuevo){
        this.nombre=nombreNuevo;
    }
    public void setPrecioBase(int precioBaseNuevo){
        this.precioBase=precioBaseNuevo;
    }
    public void setcolor(String colorNuevo){
        this.color=colorNuevo;
    }
    public void setConsumoEnergia(int consumoEnergiaNuevo){
        this.consumoEnergia=consumoEnergiaNuevo;
    }
    public void setPrecioBase(double pesoNuevo){
        this.peso=pesoNuevo;
    }

    //Metodos
    //Bajo Consumo
    public boolean verificarBajoConsumo(){
        boolean bajoConsumo=false;
        if(this.consumoEnergia<45){
            return bajoConsumo=true;
        }
        else{
            return bajoConsumo;
        }
    }
    public double getBalance(){
        return this.precioBase/this.peso;
    }

    public boolean verificarAltaGama(){
        boolean altaGama=false;
        if(getBalance()>3){
            return altaGama=true;
        }
        else{
            return altaGama;
        }
    }

}
