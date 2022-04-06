/*
 * Copyright (c) 2022 Johannes Kepler University Linz
 *
 * Contributors:
 *   Hafiyyan Sayyid Fadhlillah -- initial implementation
 *
 */

package at.jku.kv.ple;

import at.jku.kv.ple.strategy.*;

public class ProductConfiguration {
    public static void main(String[] args){

        Lit firstLit = new Lit(12);
        Lit secondLit = new Lit(8);

        Add firstAdd = new Add(firstLit,secondLit);
        Neg firstNeg = new Neg(firstAdd);

        EPLPrintOperation doPrintOperation = new DoPrintOperation();
        EPLEvalOperation doEval = new DoEval();

        EPLPrintOperation noPrintOperation = new NoPrintOperation();
        EPLEvalOperation noEvalOperation = new NoEvalOperation();

        firstAdd.setPrintOp(doPrintOperation);
        firstAdd.setEvalOp(doEval);
        firstLit.setPrintOp(doPrintOperation);
        firstLit.setEvalOp(doEval);
        secondLit.setPrintOp(doPrintOperation);
        secondLit.setEvalOp(doEval);
        firstNeg.setEvalOp(doEval);
        firstNeg.setPrintOp(doPrintOperation);

        firstAdd.print();
        System.out.print(" = ");
        System.out.println(firstAdd.eval());
        System.out.println();
        System.out.println("----SEPARATOR----");
        System.out.println();
        firstNeg.print();
        System.out.print(" = ");
        System.out.println(firstNeg.eval());

    }
}
