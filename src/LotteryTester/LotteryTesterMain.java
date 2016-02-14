/**
 *
 * @author vinnyfiore
 */

package LotteryTester;

import java.util.ArrayList;
import java.util.Random;

public class LotteryTesterMain {


    public static void main(String[] args) {
        Random ran = new Random();
        int powerball = 12;
        int num1 = 30;
        int num2 = 19;
        int num3 = 33;
        int num4 = 36;
        int num5 = 10;

                
        for(int i=0; i<1000000000; i++){
            
            ArrayList<Integer> testerRedball = new ArrayList();
            ArrayList<Integer> testerList = new ArrayList();
            
            testerRedball.add(ran.nextInt(27));
            testerList.add(ran.nextInt(70));
            testerList.add(ran.nextInt(70));
            testerList.add(ran.nextInt(70));
            testerList.add(ran.nextInt(70));
            testerList.add(ran.nextInt(70));
                        
            if (testerRedball.contains(powerball)){
                if(testerList.contains(num1)){
                   if(testerList.contains(num2)){
                    if(testerList.contains(num3)){
                        if(testerList.contains(num4)){
                            if(testerList.contains(num5)){
                                    System.out.println("You won the lottery! Sort of!");
                                    System.out.println("And it only took " + i+1 + " tries!");
                                    System.exit(0);
                                  }
                            }
                        }
                    } 
                }
            }
            else if (i%10000000==0){
                System.out.println(i + " runs");
            }
            
        }
        
    }
    
}
