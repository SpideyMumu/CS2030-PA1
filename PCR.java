class PCR extends Test {
    private final String outcome;

    PCR(String outcome) {
        this.outcome = outcome;
    }

    boolean isPositive() {
        return this.outcome.equals("alpha") ||
            this.outcome.equals("beta") ||
            this.outcome.equals("delta") ||
            this.outcome.equals("omicron");
    }

    boolean isValid() {
        return true;
    }

    String printedResult() {
        if (this.isPositive()) {
            return "+";
        } 
        return "-";
    }
    
    @Override
    public String toString() {
        return String.format("P%s", this.printedResult());
    }


}
