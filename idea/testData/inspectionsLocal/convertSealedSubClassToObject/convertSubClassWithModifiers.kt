// FIX: Convert Sealed Sub-class to Object
// PROBLEM: Sealed Sub-class can be changed To Object
sealed class Sealed

private <caret>class SubSealed : Sealed()