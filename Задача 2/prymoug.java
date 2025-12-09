public class prymoug {
    private double a;
    private double b;
    private double s;
    private double p;
    public prymoug(double a,double b){
        if(a<0){
            throw new RuntimeException("There is no figure with such parameters.");
        }
        if(b<0){
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.a=a;
        this.b=b;
        p=(a+b)*2;
        s=a*b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if(a<0){
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if(b<0){
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.b = b;
    }

    public double getS() {
        return s;
    }

    public double getP() {
        return p;
    }
}
