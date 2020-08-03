
public class getScore {
    public int getScoreOfBowing(int score[][]){
        int everyScore[] = {0,0,0,0,0,0,0,0,0,0};
        int addScore;
        int result = 0;
        if(score.length < 10)
        { System.out.println("input is error");
          return 0;
        }
        for(int i = 0; i < score.length-1; i++){
            addScore = 0;
              if (score[i][0] == 10){
                  everyScore[i] += score[i][0] + score[i+1][0];
                  if(score[i + 1][0] == 10){
                      everyScore[i] += score[i+2][0];
                  }
                  else
                      everyScore[i] += score[i+1][1];
                  continue;
              }
             addScore = score[i][0]+score[i][1];
              if(addScore == 10){
                  everyScore[i] = addScore + score[i][2];
              }
              else
                  everyScore[i] = addScore;
        }
        addScore = 0;
         if(score[9][0] == 10){
             everyScore[9] = score[9][0] + score[9][1] +score[9][2];
         }
         else
         {
             addScore = score[9][0] + score[9][1];
             if(addScore == 10)
                 everyScore[9] = addScore + score[9][2];
             else
                 everyScore[9] = addScore;
         }
     for(int j = 0; j < 10; j++){
         result += everyScore[j];
     }
     return result;
    }
}
