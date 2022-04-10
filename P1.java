class P1 implements Protocol {
    
    @Override
    public Protocol next(Person person, Test test, int numOfDays) {
        if (person.isHighRisk()) {
            if (test.isPositive()) {
                return new P1();
            } else {
                return new Discharged();
            }
        } else {
            if (test.isPositive()) {
                return new P2();
            } else {
                return new Discharged();
            }
        }
    }

    @Override
    public String toString() {
        return "P1";
    }
}
