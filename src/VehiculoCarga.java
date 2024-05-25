public class VehiculoCarga extends Vehiculo {
    
    private int capacidadcarga;
    
    //constructor
    public VehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadcarga) {
        super(marca, modelo, año, kilometraje);
        this.capacidadcarga = capacidadcarga;
    }
    //Getter y Setter para capacidad de carga
    public int getCapacidadcarga() {
        return capacidadcarga;
    }
    
    public void setCapacidadCarga(int capacidadcarga) {
        this.capacidadcarga = capacidadcarga;
    }
    
    //sobreescribir el metodo MostrarInfo
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("capacidad de carga:" +capacidadcarga + " kg" );
    }
    
    }