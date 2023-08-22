class Coche extends Vehiculo { //Subclase heredada de la clase Vehiculo
    private int numeroPuertas; //uso de private para encapsular los atributos propios de la clase

    //uso de un constructor
    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }
    //uso de una funcion
    public void mostrarInfoCoche() {
        mostrarInfo();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}