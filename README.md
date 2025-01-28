This repository demonstrates an uncommon code error in Kotlin related to the `removeIf` function.  The `removeIf` function, when used with mutable collections like `MutableList` and `MutableSet`, exhibits different behavior during iteration if the lambda expression modifies the collection's structure.  This can lead to unexpected results and subtle bugs.

The `bug.kt` file showcases the unexpected behavior. The `bugSolution.kt` file provides a safe alternative for handling such scenarios.