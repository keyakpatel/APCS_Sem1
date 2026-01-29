public class StepTracker {
    int steps;
    boolean active;
    int day;
    
    public StepTracker(int steps){
        this.steps = steps;
        day = 1;
        if (steps >= 10000){
            active = true;
        }
        else {
            active = false;
        }
    }
     public void addDailySteps (int s){
         steps = steps + s;
     }
     
     public int activeDays(){
        if (steps >= 10000){
            return 1 + day;
            
        }
        else {
            return 0;
        }
        
     }
     
     public double averageSteps(){
         return steps/day;
     }
}