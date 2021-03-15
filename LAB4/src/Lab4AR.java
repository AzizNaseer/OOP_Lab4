public class Lab4AR {
    public static void main(String[] args) {
        HotDogStand HDS1= new HotDogStand(231,54);
        HotDogStand HDS2= new HotDogStand(322,74);
        HotDogStand HDS3= new HotDogStand(783,27);
        HDS1.JustSold();
        HDS1.JustSold();
        HDS3.JustSold();
        HDS2.JustSold();
        HDS3.JustSold();
        HDS3.JustSold();
        HDS2.JustSold();
        System.out.println("Stand 1 sale "+ HDS1.getHDS_Sold()+" hot dogs");
        System.out.println("Stand 2 sale "+ HDS2.getHDS_Sold()+" hot dogs");
        System.out.println("Stand 3 sale "+ HDS3.getHDS_Sold()+" hot dogs");


    }
}
