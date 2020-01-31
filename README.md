# CoffeeMaker

An example application for use in software testing exercises. It models a coffee making machine.

You can find the specification for this CoffeeMaker here: http://www.comscigate.com/uml/ncsu/CoffeeMaker_User_Stories.htm

Based on the CoffeeMaker example from NCSU. Thanks NCSU :)

The `build.xml` file contains a number of ant targets to run various testing
tools:
* `ant test` runs the manually-written test suite.
* `ant coverage` determines the coverage of the manually-written tests
using Cobertura.
* `ant randoop` generates test cases for the `Inventory` class using Randoop.
* `ant test.randoop` runs the Randoop-generated test cases.
* `ant coverage.randoop` uses Cobertura to collect coverage information
for the Randoop-generated test cases.
* `ant evosuite` generates tests for the `Inventory` class using EvoSuite.
* `ant test.evosuite` runs the EvoSuite-generated tests.
* `ant coverage.evosuite` generates a Cobertura report for the EvoSuite tests.