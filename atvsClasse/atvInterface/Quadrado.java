package atvsClasse.atvInterface;

class Quadrado implements FormaGeometrica{
    private double raio;
    private static final double pi = 3.14;

    @Override
    public double area(){
        return pi * (raio * raio);
    }
    @Override
    public double comprimento(){
        return 2 * pi * raio;
    }
}
