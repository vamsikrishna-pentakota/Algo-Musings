package javarefresher.enums;

public enum Severity {
    AURA(1, "Likely to get a migraine in the upcoming hours"),
    LOW(2, "Mild migraine. Probably has the chance to increase"),
    MODERATE(3, "Headache is on one side or central part of head, might need medication if not reduced in the next couple of hours"),
    HIGH(4, "Throbbing pain, need medication and rest immediately"),
    EXTREME(5, "Need to visit a doctor immediately");

    final int severityScale;
    final String descriptionOfSeverity;
    Severity(int severityScale, String descriptionOfSeverity){
        this.severityScale = severityScale;
        this.descriptionOfSeverity = descriptionOfSeverity;
    }
}
