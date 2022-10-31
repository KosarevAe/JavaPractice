package Day1.ProgSkills;

public class Task2 {
    public static void main(String[] args) {
        int[] salary = {8000,9000,2000,3000,6000,1000};
        System.out.println(average(salary));
    }

    public static double average(int[] salary){
        double salarySum = 0;
        double totalSum = 0;
        for (int i = 0; i < salary.length; i++) {
            salarySum = salary[i]+salarySum;
        }
        totalSum = salarySum - getMax(salary) - getMin(salary);
        return totalSum/(salary.length - 2);
    }

    public static int getMax(int[] salary){
        int max = salary[0];
        for (int i = 0; i < salary.length;i++){
            if(salary[i] > max){
                max = salary[i];
            }
        }
        return max;
    }

    public static int getMin(int[] salary){
        int min = salary[0];
        for (int i = 0; i < salary.length;i++){
            if(salary[i] < min){
                min = salary[i];
            }
        }
        return min;
    }
}
