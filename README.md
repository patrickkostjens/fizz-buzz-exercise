# Fizz Buzz exercise

This repository contains a very basic exercise that can be used for practicing testing and TDD skills using Java.
It is based on the seemingly simple game [Fizz Buzz](https://en.wikipedia.org/wiki/Fizz_buzz).

## Usage
The simplest way to run the tests in this repository is using the provided Gradle.
On Linux/UNIX systems (with Java installed) you can run it as follows:
```bash
./gradlew test
```
On Windows, `gradlew.bat` can be used. In this case, the same arguments can be used.

Aside from the tests, a very basic CLI is also provided so that you can experiment with it yourself.
You first have to build the application using the following command (fox UNIX/Linux; see above):
```bash
./gradlew build
```

You can then run it as follows (assuming Java is on your path):
```bash
java -cp build/libs/fizz-buzz-exercise-0.0.1-SNAPSHOT.jar nl.patrickkostjens.Main
```


## Project structure and intent
This project follows the common structure for Java/Gradle projects.
The source code can be found in `src/main/java`.
In the source code, a `Main` class has already been provided so that you can easily test your implemented Fizz Buzz solution.
Your solution should be implemented in the `FizzBuzz` class in the sources folder.

The tests are provided in the `src/test/java` folder.
The `FizzBuzzTest` class contains the tests, although most of them are commented.
These tests can be executed using the instructions above, or, if you prefer, through your IDE.
You can do the exercise by writing the simplest code that lets the test(s) pass.
When you did that you can uncomment the second test and repeat the above step.
You can keep doing this until all the tests are commented and succeeding.

If you do not understand which tests are failing from the output of your IDE or Gradle, you can open the HTML report of the test run.
You can find this report in the `build/reports/tests/test/index.html` file.
Note that this file only exists once you have run your tests.
You can open the report using your browser.
