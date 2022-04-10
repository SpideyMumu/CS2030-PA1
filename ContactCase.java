class ContactCase extends Case {
    private static final int START_MONITOR = 0;
    private static final Protocol DEFAULT_PROTOCOL = new P3();

    ContactCase(Person person, Test test, Case contact) {
      super(person, new ImList<Test>().add(test),
              DEFAULT_PROTOCOL.next(person, test, START_MONITOR),
              START_MONITOR, contact.getLineage());
    }

    /*@Override
    ImList<Case> getLineage() {
        return this.lineage.add(this);
    }*/
    
    @Override
    public String toString() {
        return super.toString();
    }
}
