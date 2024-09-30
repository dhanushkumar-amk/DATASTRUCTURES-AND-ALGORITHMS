package ARRAYS;

import java.util.HashSet;
import java.util.Set;

public class WalkingRobotStimulation {
    public static void main(String[] args) {

    }

    public static int robotSim(int[] commands, int[][] obstacles) {

        int XDirection = 0;
        int YDirection = 1;
        int CurrentX = 0;
        int CurrentY = 0;

        Set<String> set = new HashSet<>();
        int max = 0;
        for(int[] obs : obstacles)
            set.add(obs[0] + ":" + obs[1]);

        for (int command : commands){
            if (command == -1){
                if (XDirection == 0 && YDirection == 1){
                    XDirection = 1;
                    YDirection =0;
                } else if (XDirection == 0 && YDirection == -1) {
                    XDirection = -1;
                    YDirection = 0;
                } else if (YDirection == 0 && XDirection == 1) {
                    XDirection = 0;
                    YDirection = -1;
                } else if (YDirection == 0 && XDirection == -1) {
                    XDirection = 0;
                    YDirection = 1;
                }
            } else if (command == -2) {
                if (XDirection == 0 && YDirection == 1){
                    XDirection = -1;
                    YDirection =0;
                } else if (XDirection == 0 && YDirection == -1) {
                    XDirection = 1;
                    YDirection = 0;
                } else if (YDirection == 0 && XDirection == 1) {
                    XDirection = 0;
                    YDirection = 1;
                } else if (YDirection == 0 && XDirection == -1) {
                    XDirection = 0;
                    YDirection = -1;
                }
            }
            else {
                for (int i = 1; i <= command ; i++) {
                    if (!set.contains((CurrentX + XDirection) + ":" + (CurrentY + YDirection))){
                        CurrentX += XDirection;
                        CurrentY += YDirection;
                    }
                    else break;
                }

                max = Math.max(max, CurrentX * CurrentX + CurrentY * CurrentY);
            }
        }
        return max;

    }
}
