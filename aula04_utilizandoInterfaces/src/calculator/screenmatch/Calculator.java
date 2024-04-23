package calculator.screenmatch;
import types.screenmatch.Title;

public class Calculator {
    //variável
    private int totaltime;
    //método getter
    public int getTotaltime() {
        return totaltime;
    }

    public void totalTime (Title title) {
        this.totaltime += title.getTimeInMinutes();
    }
}
