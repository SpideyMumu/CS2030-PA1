class Person {
    private final String identification;
    private final String vaccination;
    private final int healthRiskScore;

    Person(String identification, String vaccination, int healthRiskScore) {
        this.identification = identification;
        this.vaccination = vaccination;
        this.healthRiskScore = healthRiskScore;
    }

    boolean isHighRisk() {
        return this.healthRiskScore > 7;
    }

    boolean isVaccinated() {
        return this.vaccination.length() > 1;
    }

    @Override
    public String toString() {
        String printRisk = "";

        if (this.isHighRisk()) {
            printRisk = "^";
        } else {
            printRisk = "v";
        }
            
        return String.format("%s/%s/%s", this.identification, 
                this.vaccination, printRisk);
    }
}



