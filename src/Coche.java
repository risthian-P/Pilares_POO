class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public void mostrarInfoCoche() {
        mostrarInfo();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}