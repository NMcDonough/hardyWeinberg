
package com.nrkey.hardyweinberg.equations;

/**
 *
 * @author mcnoa
 */
public class Equation {
    private final String template;
    private final String[] parsed;
    
    public Equation() {
        this.template = "a ² + b ² = c ²";
        this.parsed = this.template.split(" ");
    }
    
    public Equation(String eq) {
        this.template = eq;
        this.parsed = this.template.split(" ");
    }
}
