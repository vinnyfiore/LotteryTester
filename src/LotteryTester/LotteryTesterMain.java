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
        
        String testAgainst = "11 22 33 44 55 66";
        
        for(int i=0; i<1000000000; i++){
            
            ArrayList<Integer> testerRedball = new ArrayList();
            ArrayList<Integer> testerList = new ArrayList();
            
            testerRedball.add(ran.nextInt(27));
            testerList.add(ran.nextInt(70));
            testerList.add(ran.nextInt(70));
            testerList.add(ran.nextInt(70));
            testerList.add(ran.nextInt(70));
            testerList.add(ran.nextInt(70));
                        
            if (testerRedball.contains(11)){
                if(testerList.contains(22)){
                   if(testerList.contains(33)){
                    if(testerList.contains(44)){
                        if(testerList.contains(55)){
                            if(testerList.contains(66)){
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
