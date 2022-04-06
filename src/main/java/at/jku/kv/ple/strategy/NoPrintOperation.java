/*
 * Copyright (c) 2022 Johannes Kepler University Linz
 *
 * Contributors:
 *   Hafiyyan Sayyid Fadhlillah -- initial implementation
 *
 */

package at.jku.kv.ple.strategy;

import at.jku.kv.ple.Exp;

public class NoPrintOperation implements EPLPrintOperation{

    @Override
    public void print(Exp valueToPrint) {
        System.out.println("---DO NOTHING---");
    }
}
