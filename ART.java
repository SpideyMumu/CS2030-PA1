class ART extends Test {
    private final String outcome;

    ART(String outcome) {
        this.outcome = outcome;
    }

    boolean isPositive() {
        return this.outcome.equals("CT");
    }

    boolean isValid() {
        return !(this.outcome.equals("T"));
    }

    String printedResult() {
        if (this.isPositive()) {
            return "+";
        } 

        if (this.isValid()) {
            return "-";
        }
        return "X";
    }

    @Override
    public String toString() {
        return String.format("A%s", this.printedResult());
    }
}
