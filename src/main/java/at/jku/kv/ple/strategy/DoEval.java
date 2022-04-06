/*
 * Copyright (c) 2022 Johannes Kepler University Linz
 *
 * Contributors:
 *   Hafiyyan Sayyid Fadhlillah -- initial implementation
 *
 */

package at.jku.kv.ple.strategy;

import at.jku.kv.ple.Add;
import at.jku.kv.ple.Exp;
import at.jku.kv.ple.Lit;
import at.jku.kv.ple.Neg;

public class DoEval implements EPLEvalOperation{

    @Override
    public int eval(Exp valueToPrint) {

        int result = 0;

        if(valueToPrint instanceof Add){
            Add anAdd = (Add) valueToPrint;
            result = anAdd.getLeft().eval() + anAdd.getRight().eval();
        } else if(valueToPrint instanceof Neg){
            Neg aNeg = (Neg) valueToPrint;
            result = -(aNeg.getExp().eval());
        } else if(valueToPrint instanceof Lit){
            Lit aLit = (Lit) valueToPrint;
            result = aLit.getValue();
        } else {
            System.out.println("Cannot eval this");
        }

        return result;
    }

}
