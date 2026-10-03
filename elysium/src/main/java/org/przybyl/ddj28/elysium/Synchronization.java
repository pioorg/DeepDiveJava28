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

import java.time.LocalDate;
import java.util.Objects;

public class Synchronization {

    static void main() {

        var localToday = LocalDate.now();

        if (Objects.hasIdentity(localToday)) {
            throw new IllegalStateException("This demo works only if you --enable-preview.");
        }

//        synchronized (localToday) {
//            IO.println("Issues warnings since 16");
//        }

    }
}
