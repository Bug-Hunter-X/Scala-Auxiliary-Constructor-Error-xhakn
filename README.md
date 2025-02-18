# Scala Auxiliary Constructor Bug

This repository demonstrates a common error in Scala related to auxiliary constructors.  Auxiliary constructors must explicitly call another constructor within the class, often using `this()` to invoke the primary constructor.  Failure to do so results in a compilation error.

The `bug.scala` file contains the erroneous code.  The correct solution is provided in `bugSolution.scala`.

## How to reproduce the bug

1.  Clone this repository.
2.  Compile and run `bug.scala`. You should get a compilation error.
3.  Compare the code with `bugSolution.scala` to observe the fix.

## Lesson Learned

Always ensure that auxiliary constructors in Scala explicitly call another constructor using the `this()` keyword to avoid such issues. This is crucial for correctly initializing the class's member variables.