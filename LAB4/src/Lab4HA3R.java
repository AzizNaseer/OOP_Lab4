public class Lab4HA3R {
    public static void main(String[] args) {
        Student S1= new Student("Aziz",new int[]{45,74,88,34,89});
        Student S2= new Student("Ali",new int[]{50,74,78,92,79});
        Student S3= new Student(S1.getName(),S2.getResult_Array());
        S1.Average();
        S2.Average();
        System.out.println("The average of Student 3 is "+S3.Average());
        if(S1.Average()>S2.Average()){
            System.out.println("Student 1 has higher average of "+S1.Average());
        }
        else {
            System.out.println("Student 2 has higher average of "+S2.Average());
        }


    }


}
