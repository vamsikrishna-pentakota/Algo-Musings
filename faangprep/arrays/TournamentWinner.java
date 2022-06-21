package faangprep.arrays;

import java.util.HashMap;

public class TournamentWinner{
    // tournamentList = [[H,A],[H,A],[H,A]]
    //                  [[HTML,C#],[Python,HTML],[Python,HTML]] = [1 , 0, 0]

    public static String decideWinner(String[][] tournamentList , int[] matchResults){
        HashMap<String, Integer> scoreboard = new HashMap<>();
        String bestTeam = "";
        for(int i=0; i<tournamentList.length; i++){
            String winningTeam = (matchResults[i] == 0) ? tournamentList[i][1] : tournamentList[i][0];
            if("".equals(bestTeam)) bestTeam = winningTeam;
            scoreboard.put(winningTeam, scoreboard.getOrDefault(winningTeam, 0) + 3);
            if(scoreboard.get(winningTeam) > scoreboard.get(bestTeam)) bestTeam = winningTeam;
        }        
        return bestTeam;  
    }
    public static void main(String[] args) {
        String [][] competitions = {{"HTML","C#"},{"Python","HTML"},{"Python","HTML"}};
        int [] results = {1,1,0}; 
        System.out.println(decideWinner(competitions, results)); 
    }
}