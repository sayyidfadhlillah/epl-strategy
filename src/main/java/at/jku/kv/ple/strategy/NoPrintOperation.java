package at.jku.kv.ple.strategy;

import at.jku.kv.ple.Exp;

public class NoPrintOperation implements EPLPrintOperation{

    @Override
    public void print(Exp valueToPrint) {
        System.out.println("---DO NOTHING---");
    }
}
