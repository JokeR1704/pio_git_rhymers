package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

//Źle sformatowane były wiersze 5, 12, 14, 15.
//Alt + strzałka w prawo lub w lewo przełącza między otwartymi plikami w programie.