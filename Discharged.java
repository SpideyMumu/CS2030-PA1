class Discharged implements Protocol {
    private final String result;
    private static final String DEFAULT_RESULT = "-";

    Discharged() {
        this.result = DEFAULT_RESULT;
    }

    Discharged(String result) {
        this.result = result;
    }

    @Override
    public Protocol next(Person person, Test test, int numOfDays) {
        if (test.isPositive()) {
            return new Discharged("+");
        }
        return this;
    }

    @Override
    public String toString() {
        if (this.result.equals("-")) {
            return "Discharged: follow up with doctor";
        } else if (this.result.equals("complete")) {
            return "Discharged: complete";
        } else {
            return "Discharged: seek medical attention";
        }
    }
}

    
