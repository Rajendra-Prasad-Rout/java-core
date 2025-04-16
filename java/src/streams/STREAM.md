# 🌊 Java Streams API Guide

## Overview

Java **Streams** are a powerful abstraction for processing sequences of elements. Introduced in Java 8, they bring functional programming capabilities to Java, enabling concise, declarative, and efficient data manipulation.

Streams allow:
- Declarative programming (describe *what*, not *how*)
- Lazy evaluation for performance
- Easy parallelization
- Method chaining for clean, readable code

> ⚠️ Note: Streams do **not** store elements. They operate on a source (like a collection or array) and produce a result through a pipeline of operations.

---

## Core Concepts

| Concept                  | Description |
|--------------------------|-------------|
| **Source**               | The origin of stream elements (e.g., `List`, `Set`, `array`) |
| **Intermediate Ops**     | Transformations (e.g., `filter`, `map`) that return a stream |
| **Terminal Ops**         | Operations that produce a result or side effect (e.g., `collect`, `forEach`) |
| **Laziness**             | Operations are only executed when a terminal operation is invoked |

---

## Stream Method Reference

### ✅ Matching & Finding

| Method | Description |
|--------|-------------|
| `allMatch(Predicate)` | Returns `true` if all elements match the predicate |
| `anyMatch(Predicate)` | Returns `true` if any element matches the predicate |
| `noneMatch(Predicate)` | Returns `true` if no elements match the predicate |
| `findFirst()` | Returns an `Optional` describing the first element (if any) |
| `findAny()` | Returns an `Optional` describing some element (useful in parallel streams) |

---

### 🔄 Creating Streams

| Method | Description |
|--------|-------------|
| `Stream.of(T...)` | Creates a stream from specified values |
| `Stream.of(T t)` | Creates a single-element stream |
| `Stream.empty()` | Returns an empty stream |
| `Stream.generate(Supplier)` | Creates an infinite stream using a supplier |
| `Stream.iterate(seed, UnaryOperator)` | Creates an infinite stream by applying a function |
| `Stream.builder()` | Returns a mutable stream builder |
| `Stream.concat(a, b)` | Concatenates two streams lazily |

---

### 🧹 Filtering & Transforming

| Method | Description |
|--------|-------------|
| `filter(Predicate)` | Filters elements that match the predicate |
| `map(Function)` | Transforms each element using a function |
| `flatMap(Function)` | Maps each element to a stream and flattens the result |
| `mapToInt`, `mapToLong`, `mapToDouble` | Maps to primitive streams |
| `flatMapToInt`, `flatMapToLong`, `flatMapToDouble` | Flattens and maps to primitive streams |
| `distinct()` | Removes duplicate elements |
| `sorted()` | Sorts elements using natural order |
| `sorted(Comparator)` | Sorts using a custom comparator |
| `peek(Consumer)` | Performs an action for debugging without modifying the stream |
| `limit(n)` | Truncates the stream to a maximum of `n` elements |
| `skip(n)` | Skips the first `n` elements |

---

### 📦 Collecting & Reducing

| Method | Description |
|--------|-------------|
| `collect(Collector)` | Performs a mutable reduction (e.g., `toList()`, `toSet()`) |
| `collect(Supplier, Accumulator, Combiner)` | Custom collection with control over behavior |
| `reduce(BinaryOperator)` | Reduces using an associative function |
| `reduce(identity, BinaryOperator)` | Reduces with an identity value |
| `reduce(identity, accumulator, combiner)` | Full control over reducing behavior |

---

### 🔁 Terminal Operations

| Method | Description |
|--------|-------------|
| `forEach(Consumer)` | Applies an action to each element |
| `forEachOrdered(Consumer)` | Applies an action preserving the order |
| `count()` | Returns the number of elements |
| `toArray()` | Converts stream to array |
| `toArray(generator)` | Uses a generator to create an array |
| `min(Comparator)` | Finds the minimum element |
| `max(Comparator)` | Finds the maximum element |

---

## 🧠 Notes

- A **stream can only be used once**. Reusing it throws an `IllegalStateException`.
- Use `.parallelStream()` or `.parallel()` for parallel processing.
- Prefer **stateless** operations in parallel streams for safety.
- Avoid side effects inside `map`, `filter`, etc. Use `peek()` or `forEach()` instead when necessary.

---

## 🧪 Example

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

List<String> result = names.stream()
    .filter(name -> name.startsWith("A"))
    .map(String::toUpperCase)
    .collect(Collectors.toList());

// Output: [ALICE]
