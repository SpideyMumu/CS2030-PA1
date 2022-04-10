class Case {
    private final Person person;
    private final ImList<Test> tests;
    private final Protocol protocol;
    private final int daysIsolated;
    private final ImList<Case> lineage;
    private static final int START_ISOLATION = 0;
    private static final Protocol DEFAULT_PROTOCOL = new P1();

    Case(Person person, ImList<Test> tests, Protocol p, int numOfDays, ImList<Case> lineage) {
        this.person = person;
        this.tests = tests;
        this.protocol = p;
        this.daysIsolated = numOfDays;
        this.lineage = lineage;
    }
    
    Case(Person person, PCR pcr) {
        this(person, new ImList<Test>().add(pcr), 
                DEFAULT_PROTOCOL.next(person, pcr, START_ISOLATION),
                START_ISOLATION, new ImList<Case>());
    }
    
    Case test(Test testResults) {
        if (testResults.isValid()) {            
            return new Case(this.person, this.tests.add(testResults), 
                        this.protocol.next(this.person, testResults, daysIsolated + 1),
                        daysIsolated + 1, this.lineage);
        } else {
            return this;
        }
    }

    Protocol getCurrentProtocol() {
        return this.protocol;
    }

    ImList<Test> getTestHistory() {
        return this.tests;
    }

    ImList<Case> getLineage() {
        return this.lineage.add(this);
    }
 

    @Override
    public String toString() {
        return String.format("%s %s %s", person.toString(), tests.toString(), protocol.toString());
    }
}
