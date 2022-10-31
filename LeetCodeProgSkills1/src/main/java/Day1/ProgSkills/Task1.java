package Day1.ProgSkills;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(countOdds(
                407656828,722359384));
    }

    public static int countOdds(int low, int high){
        Integer count = 0;
        for (int i = low; i <= high; i++) {
            if(i % 2==1){
                count++;
            }
        }
        return count;
    }
}
