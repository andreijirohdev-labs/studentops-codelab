package dev.andreijiroh.studentops.projects;

/**
 * Computer Programming 1 - 03 Laboratory Exercise 1
 * @author Andrei Jiroh Eugenio Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class javaOperatorsLab {
    public static void main(String[] args) {
        /**
         * For this codelab, we'll be doing BMI math here
         */
        int kgs = 71;
        int centimeters = 170;
        float metersMath = centimeters / 100f;
        float bmi = kgs / (metersMath * metersMath);
        float bmiRounded = Math.round(bmi * 100f) / 100f; // Rounded to 2 decimal places (with assistance from GitHub Copilot)

        System.out.println("Height: "+ centimeters+" cm");
        System.out.println("Weight: "+kgs+ " kg");
        System.out.println("BMI: "+bmiRounded);

        boolean underweight = (bmiRounded < 18.5);
        boolean healthyRange = (bmiRounded >= 18.5) && (bmiRounded <= 25);
        boolean overweight = (bmiRounded >= 25) && (bmiRounded <= 30);
        boolean obese = (bmiRounded > 30);

        /** Gen AI disclosure: Autocompleted by GitHub Copilot */
        if (bmiRounded < 0) {
            System.out.println("BMI Category: N/A (invalid BMI)");
        } else if (underweight) {
            System.out.println("BMI Category: Underweight");
        } else if (healthyRange) {
            System.out.println("BMI Category: Healthy Range");
        } else if (overweight) {
            System.out.println("BMI Category: Overweight");
        } else if (obese) {
            System.out.println("BMI Category: Obese");
        }
    }
}