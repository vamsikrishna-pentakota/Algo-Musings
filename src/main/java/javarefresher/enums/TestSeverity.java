package javarefresher.enums;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestSeverity {


    public static void main(String[] args) {
        int myMigraineSeverityNow = new Random().nextInt(5);

        Severity myMigraineSeverityNowFromUser = Severity.values()[myMigraineSeverityNow];


        // Fetch & print the details of my Enum based on Severity
        System.out.println(" Here is my migraine detail : "
                        + myMigraineSeverityNowFromUser
                        + " :: "
                        + myMigraineSeverityNowFromUser.severityScale
                        + " :: "
                        + myMigraineSeverityNowFromUser.descriptionOfSeverity
                        + " :: "
                );

        // EnumSet comes out of the box
        EnumSet<Severity> enumSet = EnumSet.allOf(Severity.class);
        System.out.println(enumSet);

        //EnumMap comes out of the box
        EnumMap<Severity, Supplier<String>> enumMap = new EnumMap<>(Severity.class);
        enumMap.put(Severity.AURA, Severity.AURA.descriptionOfSeverity::toUpperCase);
        enumMap.put(Severity.LOW, Severity.AURA.descriptionOfSeverity::toLowerCase);
        System.out.println(enumMap.get(Severity.AURA).get());


    }

}
