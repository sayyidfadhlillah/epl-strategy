/*
 * Copyright (c) 2022 Johannes Kepler University Linz
 *
 * Contributors:
 *   Hafiyyan Sayyid Fadhlillah -- initial implementation
 *
 */

package at.jku.kv.ple;

import java.util.Objects;

public class Add extends Exp{

    private Exp left;
    private Exp right;

    public Add(Exp left, Exp right) {
        this.left = left;
        this.right = right;
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

    public Exp getLeft() {
        return left;
    }

    public Exp getRight() {
        return right;
    }
}
