public class Marks {
    private int Maths;
    private int Phy;
    private int Che;
    public Marks(){
        Maths=0;
        Che=0;
        Phy=0;
    }
    public Marks(int M,int P,int C){
        this.Maths=M;
        this.Che=C;
        this.Phy=P;
    }

    public void setMaths(int maths) {
        Maths = maths;
    }

    public int getMaths() {
        return Maths;
    }

    public void setPhy(int phy) {
        Phy = phy;
    }

    public int getPhy() {
        return Phy;
    }

    public void setChe(int che) {
        Che = che;
    }

    public int getChe() {
        return Che;
    }
    public void Display(){
        System.out.println(" *Marks in Maths are "+Maths);
        System.out.println(" *Marks in Physics are "+Phy);
        System.out.println(" *Marks in Chemistry are "+Che);
    }
}
