import java.util.*;
public class BMI {
    double heightInM;
    double weightInkg;

    public BMI(double height, double weight){
        this.heightInM = height;
        this.weightInkg = weight;
    }
    public static double calculate(double height, double weight){
        double bmiTal = Math.round(weight/(height * height));
        return bmiTal;
    }

    public static boolean isUnderWeight(double bmiTal){
        if (bmiTal < 18.5) {
            return true;
        }
        return false;
    }
    public static boolean isNormalWeight(double bmital){
        if (bmital >= 18.5 && bmital <= 25){
            return true;
        }
        return false;
    }
    public static boolean isOverWeight(double bmiTal){
        if (bmiTal > 25){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "BMI: " + calculate(heightInM, weightInkg);
    }
}
/*
    BMI bmi = new BMI(1.70, 60);

        System.out.println(BMI.calculate(bmi));

                if (BMI.isUnderWeight(BMI.calculate(bmi)) == true){
                System.out.println("Undervægtig");
                }

                if (BMI.isNormalWeight(BMI.calculate(bmi)) == true){
                System.out.println("Normalvægtig");
                }
                if (BMI.isOverWeight(BMI.calculate(bmi)) == true){
                System.out.println("Overvægtig!");
                }
                */