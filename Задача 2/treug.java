public class treug {
    private double a;
    private double s;
    private double p;
    public treug(double a){
        if(a<0){
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.a=a;
        p=3*a;
        s=(Math.pow(3,0.5)*a*a)/2;
    }

    public void setA(double a) {
        if(a<0){
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double getS() {
        return s;
    }

    public double getP() {
        return p;
    }
}
