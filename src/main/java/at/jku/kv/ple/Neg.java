/*
 * Copyright (c) 2022 Johannes Kepler University Linz
 *
 * Contributors:
 *   Hafiyyan Sayyid Fadhlillah -- initial implementation
 *
 */

package at.jku.kv.ple;

import java.util.Objects;

public class Neg extends Exp {

    private Exp exp;

    public Neg(Exp exp) {
        this.exp = exp;
    }

    public Exp getExp() {
        return exp;
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
