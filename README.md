# DeepDiveJava28

This is a demo project to show some new features of Java™ 28. (For the previous version go to [DeepDiveJava27](https://github.com/pioorg/DeepDiveJava26).)

It uses `--enable-preview` and Maven, but you don't need to have Maven installed.

To run this project, you need to have Java™ 28 installed. You can use https://sdkman.io/ and/or https://openjdk.java.net/, https://adoptium.net/, or download it directly in IntelliJ IDEA.

If you'd like to run the example app, one of the options is this:

    $ MAVEN_OPTS="--enable-preview" ./mvnw exec:java -pl goodies

(If it doesn't work, you might have Java 28 not installed.)
