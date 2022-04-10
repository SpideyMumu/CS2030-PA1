class P3 implements Protocol {
    
    @Override
    public Protocol next(Person person, Test test, int numOfDays) {
        if (test.isPositive()) {
            if (person.isHighRisk()) { 
                return new P1();
            } else {
                return new P2();
            }
        } else if (numOfDays > 4) {
            return new Discharged("complete");
        } else {
            return this;
        }
    } 

    @Override
    public String toString() {
        return "P3";
    }   
}
