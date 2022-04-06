package at.jku.kv.ple.strategy;

import at.jku.kv.ple.Exp;

public class NoEvalOperation implements EPLEvalOperation{

    @Override
    public int eval(Exp exp) {
        return Integer.MIN_VALUE;
    }
}
