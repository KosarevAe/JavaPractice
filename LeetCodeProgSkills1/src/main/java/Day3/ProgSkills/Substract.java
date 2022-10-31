package Day3.ProgSkills;

public class Substract {
    public static void main(String[] args) {
        System.out.println(substractProductAndSum(4421));
    }

    public static int substractProductAndSum(int n){
        int result = 0;
        result = countProd(n) - countSum(n);
        return result;
    }

    public static int countSum(int n){
        int sum = 0;
        while(n != 0){
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static int countProd(int n){
        int prod = 1;
        while(n != 0){
            prod *= (n % 10);
            n /= 10;
        }
        return prod;
    }
}
