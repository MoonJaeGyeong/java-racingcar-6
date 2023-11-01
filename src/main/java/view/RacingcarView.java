package view;

import static view.Constant.*;

import java.util.List;


public class RacingcarView {
    public static void requestCarNamesMessage(){
        System.out.println(START_GAME);
    }
    public static void requestInputNumberOfRepeatMessage(){
        System.out.println(INPUT_NUMBER);
    }

    public static void printResultHead(){
        System.out.println();
        System.out.println(EXECUTION_RESULT);
    }

    public void showForwardResult(List<String> car_forward, int[] car_forward_count){
        for(int i=0; i<car_forward.size(); i++){
            System.out.print(car_forward.get(i) + " : ");
            for(int j=0; j<car_forward_count[i]; j++){
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void showWinner(String winner){
        System.out.println(FINAL_WINNER + winner);
    }

}
