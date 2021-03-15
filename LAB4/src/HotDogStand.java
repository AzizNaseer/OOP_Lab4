public class HotDogStand {
    private int HDS_ID;
    private int No_of_HDS;
    private int HDS_Sold;
    public HotDogStand(int Id,int N){
        this.HDS_ID=Id;
        this.No_of_HDS=N;
        this.HDS_Sold=0;

    }
    public void JustSold(){
        HDS_Sold++;
    }

    public void setHDS_ID(int HDS_ID) {
        this.HDS_ID = HDS_ID;
    }

    public int getHDS_ID() {
        return HDS_ID;
    }

    public void setNo_of_HDS(int no_of_HDS) {
        No_of_HDS = no_of_HDS;
    }

    public int getNo_of_HDS() {
        return No_of_HDS;
    }

    public void setHDS_Sold(int HDS_Sold) {
        this.HDS_Sold = HDS_Sold;
    }

    public int getHDS_Sold() {
        return HDS_Sold;
    }

}
