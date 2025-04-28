# 🚀 Java Lambdas

Welcome to the world of **Lambdas** in Java!  
Introduced in Java 8, Lambdas make Java code concise, readable, and expressive.

---

## ✨ What is a Lambda Expression?

A **Lambda Expression** is a short block of code which takes in parameters and returns a value.  
Lambda expressions are similar to methods, but they do not need a name and can be implemented right in the body of a method.

📜 **Syntax:**

```java
(parameters) -> { expression/body }
```

Example:

```java
(a, b) -> a + b
```

---

## 🔥 Why use Lambdas?

- Reduce boilerplate code 🧹
- Enable functional programming style in Java 🌟
- Work seamlessly with Java Streams 🚰
- Pass behavior as a method argument 🏃

---

## 🛠 Common Use Cases

| Use Case | Example |
|:--------:|:-------:|
| Iterating Collections | `list.forEach(item -> System.out.println(item));` |
| Functional Interfaces | `Comparator<String> comp = (s1, s2) -> s1.compareTo(s2);` |

---

## ⚡ Functional Interfaces

A **functional interface** is an interface that contains exactly one abstract method.

Example:

```java
@FunctionalInterface
interface Sum {
    int add(int a, int b);
}
```

---

## 🎯 Quick Examples

### Printing a List
```java
List<String> names = Arrays.asList("Raj", "Simran", "Aman");
names.forEach(name -> System.out.println(name));
```

### Greeting with Consumer
```java
Consumer<String> greet = message -> System.out.println("Hello, " + message);
greet.accept("World");
```

### Adding Two Numbers
```java
Sum addition = (a, b) -> a + b;
System.out.println(addition.add(10, 20));
```

---

> 🚀 "Lambdas are the gateway to writing elegant, powerful, and functional Java code!"

---