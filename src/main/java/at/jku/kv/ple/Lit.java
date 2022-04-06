package at.jku.kv.ple;

import java.util.Objects;

public class Lit extends Exp {

    private int value;

    public Lit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void print(){
        if(!Objects.isNull(this.getPrintOp())){
            this.getPrintOp().print(this);
        }
    }

    @Override
    public int eval() {

        if(!Objects.isNull(this.getEvalOp())){
            return this.getEvalOp().eval(this);
        }

        return 0;
    }


}
