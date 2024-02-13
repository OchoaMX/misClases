/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

/**
 *
 * @author _Windows_
 */
public class Terreno {
    private float ancho;
    private float largo;
    
    //Metodos
    //Metodos COnstructor
    public Terreno(){ //COnstructor por omision
        this.ancho=0;
        this.largo=0.0f;
    }
    public Terreno(float ancho, float largo){ //Onstructor por asignacion
        this.ancho = ancho;
        this.largo = largo;
    }
    public Terreno(Terreno otro){ //Constructor por copia
        this.ancho = otro.ancho;
        this.largo = otro.largo;
    }

    //Metodos set y get
    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }
    
    //Metodos de comportamiento
    public float calcularPerimetro(){
        float perimetro = 0.0f;
        perimetro = this.ancho * 2 + this.largo*2;
        return perimetro;
    }
    
    public float calcularArea(){
        float area=0.0f;
        area = this.ancho * this.largo;
        return area;
    }
    public void imprimirTerreno(){
        System.out.println("Ancho = " + this.ancho);
        System.out.println("Largo = "+ this.largo);
        System.out.println("Perimetro = "+ this.calcularPerimetro());
        System.out.println("Area = "+ this.calcularArea());
        
    }
    
}
