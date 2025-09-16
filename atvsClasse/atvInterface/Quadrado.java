package atvsClasse.atvInterface;

class Quadrado implements FormaGeometrica{
    private double lado;

    @Override
    public double area(){
        return lado * lado;
    }
    @Override
    public double comprimento(){
        return lado * 4;
    }
}
