//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BottleSong{
    public static void main(String[] args){
        int bottleNum = 10;
        String word="bottles";

        while (bottleNum>0) {
            if (bottleNum==1){
                word="bottle";
            }
            System.out.println(bottleNum + " Green " + word + ",hanging on the wall");
            System.out.println(bottleNum + " Green " + word + ",hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall,");
            bottleNum = bottleNum - 1;

            if (bottleNum>0){
                System.out.println("There will be "+ bottleNum + " Green "+ word+", hanging on the wall");
            }
            else {
                System.out.println("There will be no Green Bottles Hanging on the wall");
            }
        }
    }
}