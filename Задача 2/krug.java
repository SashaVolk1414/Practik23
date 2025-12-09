public class krug {
    private double r;
    private double s;
    private double p;
    public krug(double r){
        if(r<0){
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.r=r;
        p=2*3.14*r;
        s=3.14*r*r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if(r<0){
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.r = r;
    }

    public double getS() {
        return s;
    }

    public double getP() {
        return p;
    }
}
