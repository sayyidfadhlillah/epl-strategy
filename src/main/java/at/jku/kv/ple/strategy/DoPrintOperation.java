package at.jku.kv.ple.strategy;

import at.jku.kv.ple.Add;
import at.jku.kv.ple.Neg;
import at.jku.kv.ple.Lit;
import at.jku.kv.ple.Exp;

public class DoPrintOperation implements EPLPrintOperation{

    @Override
    public void print(Exp valueToPrint) {

        if(valueToPrint instanceof Add){
            Add anAdd = (Add) valueToPrint;
            anAdd.getLeft().print();
            System.out.print(" + ");
            anAdd.getRight().print();
        } else if(valueToPrint instanceof Neg){
            Neg aNeg = (Neg) valueToPrint;
            System.out.print("-(");
            aNeg.getExp().print();
            System.out.print(")");
        } else if(valueToPrint instanceof Lit){
            Lit aLit = (Lit) valueToPrint;
            System.out.print(aLit.getValue());
        } else {
            System.out.println("Cannot print this");
        }
    }
}
