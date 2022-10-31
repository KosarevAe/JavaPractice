package Day3.ProgSkills;

public class HammingWeight {
    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }

    public static int hammingWeight(int n){
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if(n / 10 == 0){
                i++;
            } else {
                count++;
            }
        }
        return count;
    }
}
