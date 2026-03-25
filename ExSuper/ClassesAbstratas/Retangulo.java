package ClassesAbstratas;

abstract class FiguraGeometrica {
    void calcularArea(){
    };

    void calcularPerimetro(){
    }
}

class Retangulo extends FiguraGeometrica{
    int base;
    int altura;

    Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    void calcularArea(){
        System.out.println("A area desse retangulo e: " + base*altura);
    }
    @Override
    void calcularPerimetro(){
        System.out.println("O perimetro desse retangulo e: " + ((base*2) + (altura*2)));
    }
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(2,10);
        r1.calcularArea();
        r1.calcularPerimetro();
    }

}
