package org.przybyl.ddj28.elysium;

import java.time.LocalDate;
import java.util.Objects;

public class JDKClasses {

    static void main() {
        // A LocalDate referring to the same date
        LocalDate date1 = LocalDate.of(2026, 10, 6);
        LocalDate date2 = LocalDate.of(2026, 10, 6);

        IO.println("Date 1: " + date1);
        IO.println("Date 2: " + date2);
        IO.println("Comparing dates using equals() results in " + date1.equals(date2));

        // Test whether two value objects are statewise-equivalent: instances of the same class with the same field values.
        IO.println("Comparing dates using == results in " + (date1 == date2));

        IO.println("Date 1 has identity is " + Objects.hasIdentity(date1));
        IO.println("String has identity is " + Objects.hasIdentity(date1.toString()));
    }
}
