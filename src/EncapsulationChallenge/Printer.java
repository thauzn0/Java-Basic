package EncapsulationChallenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    public Printer(int tonerLevel, boolean duplex){
        if (tonerLevel >= 0 && tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel  = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if ((tonerAmount > 0) && (tonerAmount <= 100)){
            if ((tonerAmount + tonerLevel) > 100){
                return -1;
            }
            else {
                tonerLevel += tonerAmount;
                return tonerLevel;
            }
        }
        return -1;
    }

    public int printPages(int pages){
        if (duplex){
            this.pagesPrinted = pages;
            return pagesPrinted;
        }
        return pagesPrinted;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
