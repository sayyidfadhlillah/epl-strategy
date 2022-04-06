/*
 * Copyright (c) 2022 Johannes Kepler University Linz
 *
 * Contributors:
 *   Hafiyyan Sayyid Fadhlillah -- initial implementation
 *
 */

package at.jku.kv.ple.strategy;

import at.jku.kv.ple.Exp;

public interface EPLPrintOperation {
    public void print(Exp valueToPrint);
}
