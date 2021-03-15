public class Student {
    private String Name;
    private int[] Result_Array = new int[5];

    public Student(String N, int[] R) {
        this.Name = N;
        for (int i = 0; i < 5; i++) {
            this.Result_Array[i] = R[i];
        }
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setResult_Array(int[] result_Array) {
        Result_Array = result_Array;
    }

    public int[] getResult_Array() {
        int[] Result_ArrayCopy = new int[5];
        for (int i = 0; i < 5; i++) {
            Result_ArrayCopy[i] = Result_Array[i];

        }
        return Result_ArrayCopy;
    }


    public float Average(){
        float Avg;
        float sum=0;
        for (int i=0;i<5;i++){
            sum=sum+Result_Array[i];
        }
        Avg=sum/5;
        return Avg;

    }
}
