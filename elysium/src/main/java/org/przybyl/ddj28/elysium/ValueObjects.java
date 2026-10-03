/*
 *  Copyright (C) 2026 Piotr Przybył
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <https://www.gnu.org/licenses/>.
 */
package org.przybyl.ddj28.elysium;

import module java.base;


public class ValueObjects {
    void main() {
        value class AValueClass {}

        var valueObject1 = new AValueClass();
        var valueObject2 = new AValueClass();

        if (valueObject1 == valueObject2) {
            IO.println("Value objects are equal");
        } else {
            IO.println("Value objects are not equal");
        }

        value record JustAValueRecord(int x, Integer y) {}

        var valueRecord1 = new JustAValueRecord(1, 2);
        var valueRecord2 = new JustAValueRecord(1, 2);

        var set = new HashSet<JustAValueRecord>(List.of(valueRecord1, valueRecord2, new JustAValueRecord(1, 2)));
        IO.println("We just have: "+ set.size() + " records.");
    }
}
