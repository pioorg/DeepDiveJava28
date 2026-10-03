/*
 *  Copyright (C) 2023 Piotr Przybył
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
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.przybyl.ddj28.primitivesInPatterns;


import java.util.stream.Stream;

// IT IS NEVER!!!!!11jeden
public class Pierogis {

    static void main() {
        Stream.of(1, 2, 3, 4, 5, 11, 13, 21, 24, 25, 32, 111, 222)
            .map(n -> n + " " + describePierogi(n))
            .forEach(IO::println);
    }

    static String describePierogi(int howMany) {
        return switch (howMany) {
            case 1 -> "pieróg";
            case int n when n % 100 >= 11 && n % 100 <= 14 -> "pierogów";
            case int pierogi when pierogi % 10 >= 2 && pierogi % 10 <= 4 -> "pierogi";
            case int heaven when heaven == Integer.MAX_VALUE -> "pierogi";
            default -> "pierogów";
        };
    }
}
