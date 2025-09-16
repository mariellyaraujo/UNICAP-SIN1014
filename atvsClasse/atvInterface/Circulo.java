package atvsClasse.atvInterface;

class Circulo implements FormaGeometrica{
    private double raio;
    private static final double pi = 3.14;

    public Circulo(double raio){
        setRaio(raio);
    }
    public void setRaio(double raio){
        this.raio = raio;
    }
    public double getRaio(){
        return this.raio;
    }

    @Override
    public double area(){
        return pi * (raio * raio);
    }
    @Override
    public double comprimento(){
        return 2 * pi * raio;
    }
}
