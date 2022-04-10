class P2 implements Protocol {
   
    @Override
    public Protocol next(Person person, Test test, int numOfDays) {
        if (numOfDays > 2) {
            if (test.isPositive()) {
                if ((numOfDays > 6 && person.isVaccinated()) || numOfDays > 13) {
                    return new Discharged("complete");
                }
                return this;
            } else {
                return new Discharged("complete");
            }
        } else {
            return this;
        }
    }

    @Override
    public String toString() {
        return "P2";
    }
}
