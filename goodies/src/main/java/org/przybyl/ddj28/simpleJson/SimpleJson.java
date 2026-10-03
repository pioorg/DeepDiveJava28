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

package org.przybyl.ddj28.simpleJson;

import jdk.incubator.json.JsonString;

/// Please remember to run with a VM option
/// `--add-modules jdk.incubator.json`
///
/// For more details, please see [JEP-540](https://openjdk.org/jeps/540).
public class SimpleJson {
    static void main() {
        var payload = """
            {
              "question": "Is JSON the best data exchange format?",
              "answer":   "It depends"
            }""";

        var parsed = jdk.incubator.json.Json.parse(payload);
        IO.println(parsed.get("question"));
        IO.println(parsed.get("answer"));
        IO.println(parsed.tryGet("ultimate_answer").orElse(JsonString.of("there is no ultimate answer")));

        var countout = jdk.incubator.json.Json.parse("""
[
"Ene", "due", "rike", "fake",
"Torba", "borba", 8, "ósme smake",
"Eus", "deus", "kosmateus",
"I morele", "baks"
]
            """);
        var totalCharacters = countout.asList().stream().mapToInt(

//            jv ->jv.asString().length()

            jv -> {
                if (jv instanceof JsonString js)
                    return js.asString().length();
                return 0;
            }
            ).sum();

        IO.println(totalCharacters);
    }
}
