package at.jku.kv.ple;

import at.jku.kv.ple.strategy.EPLEvalOperation;
import at.jku.kv.ple.strategy.EPLPrintOperation;

public abstract class Exp {

    private EPLPrintOperation printOp;
    private EPLEvalOperation evalOp;

    public void setPrintOp(EPLPrintOperation printOp) {
        this.printOp = printOp;
    }

    public void setEvalOp(EPLEvalOperation evalOp) {
        this.evalOp = evalOp;
    }

    public EPLPrintOperation getPrintOp() {
        return printOp;
    }

    public EPLEvalOperation getEvalOp() {
        return evalOp;
    }

    public abstract void print();
    public abstract int eval();

}
