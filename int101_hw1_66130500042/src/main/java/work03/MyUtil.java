package work03;

public class MyUtil {
    public static double calculateBMI(double weight, double height){
    double MBI;
    MBI = weight / (height*height);
    return MBI;
    }
    public static double average(int v1, int v2 , int v3){
    int average;
    average = (v1+v2+v3)/3;
    return average;
    }
}
