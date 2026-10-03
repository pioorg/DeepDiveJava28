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

abstract value class BaseValue
//            extends Object
//            extends Number
//            extends java.util.AbstractCollection<Object>
{
    int integer;
    String string;

    public BaseValue(int integer, String string) {
        this.integer = integer;
        this.string = string;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BaseValue baseValue = (BaseValue) o;
        return integer == baseValue.integer && Objects.equals(string, baseValue.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integer, string);
    }
}

final class IdentityClass extends BaseValue {
    public IdentityClass(int integer, String string) {
        super(integer, string);
    }
}

value class Value extends BaseValue {
    public Value(int integer, String string) {
        super(integer, string);
    }
}

public class InheritanceAndStuff {

    static void main() {

        var ic1 = new IdentityClass(12, "12");
        var ic2 = new IdentityClass(12, "1234567".substring(0, 2));

        IO.readln();

        if (ic1.equals(ic2)) {
            IO.println("ic1 equals ic2");
        } else {
            IO.println("ic1 !equals ic2");
        }

        var val1 = new Value(12, "12");
        var val2 = new Value(12, "1234567".substring(0, 2));

        IO.readln();

        if (val1 == val2) {
            IO.println("val1 == val2");
        } else {
            IO.println("val1 != val2");
        }

        IO.readln();

        if (val1.equals(val2)) {
            IO.println("val1 equals val2");
        } else {
            IO.println("val1 !equals val2");
        }

    }
}
