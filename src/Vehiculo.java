
/*Clase principal, de donde se iniciará la herencia  (superclase)*/

public class Vehiculo { //Clase de abstraccion donde representamos las caracteristicas de un vehiculo
    protected String marca;  //Caracteristica del vehiculo
    protected String modelo; //Uso de protected, ya que este puede usarse en otras clases

    //uso de un constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    //uso de una funcion para mostrar la información de la clase
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }}
