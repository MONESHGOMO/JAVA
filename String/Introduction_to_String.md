# Java String Class

## Overview
- An object that represents a sequence of `char` values.
- Example: The string "AGNI" consists of four characters.

## Key Features
- **Immutability**: 
  - Strings in Java are immutable, meaning once a `String` object is created, it cannot be changed. They are constant.

## Class Information
- **Package**: `java.lang.String`
- **Implements**:
  - **Serializable**: Allows the object to be converted into a byte stream.
  - **Comparable**: Provides a method for comparing `String` objects.
  - **CharSequence**: A main parent interface that represents a readable sequence of `char` values.

## CharSequence Implementations
- The `CharSequence` interface is implemented by the following classes:
  - **String**: Immutable sequence of characters.
  - **StringBuffer**: Mutable sequence of characters, synchronized for thread safety.
  - **StringBuilder**: Mutable sequence of characters, not synchronized, but faster than `StringBuffer`.

## Summary
The `String` class is a fundamental part of Java programming, providing a robust way to handle and manipulate sequences of characters while ensuring data integrity through its immutable nature.
