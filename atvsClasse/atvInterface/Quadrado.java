package atvsClasse.atvInterface;

class Quadrado implements FormaGeometrica{
    private double lado;

    public Quadrado(double lado){
        setLado(lado);
    }

    public void setLado(double lado){
        this.lado = lado;
    }
    public double getLado(){
        return this.lado;
    }

    @Override
    public double area(){
        return lado * lado;
    }
    @Override
    public double comprimento(){
        return lado * 4;
    }
}
