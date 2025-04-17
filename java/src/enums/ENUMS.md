# Understanding Enums in Java

## 📌 What is an Enum?

In Java, **enum** (short for *enumeration*) is a special Java type used to define a set of named constants. Enums help make your code more **readable**, **organized**, and **type-safe**, instead of using primitive constants like `int` or `String`.

---

## ✅ Why Use Enums?

- Ensures **type safety** — only valid constant values can be used.
- Makes the code **more readable and meaningful**.
- Can include **fields, constructors, and methods**.
- Ideal for `switch` statements and fixed sets like **days, colors, directions**, etc.

---

## 🧱 Basic Syntax

```java
public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
```

Usage:

```java
Day today = Day.MONDAY;
System.out.println("Today is " + today);
```

---

## 🧪 Using Enum in Switch Statement

```java
public class EnumSwitchExample {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the week!");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Just another day.");
        }
    }
}
```

---

## ⚙️ Enum with Fields, Constructor, and Methods

```java
public enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6);

    private final double mass;   // in kilograms
    private final double radius; // in meters

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double surfaceGravity() {
        final double G = 6.67430e-11; // universal gravitational constant
        return G * mass / (radius * radius);
    }
}
```

### ✅ Test Class

```java
public class PlanetTest {
    public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            System.out.printf("%s: Mass = %.2e kg, Radius = %.2e m, Gravity = %.2f m/s²%n",
                    p, p.getMass(), p.getRadius(), p.surfaceGravity());
        }
    }
}
```

---

## 🛠️ Enum Methods

Java provides some helpful built-in methods for working with enums:

| Method              | Description                                 |
|---------------------|---------------------------------------------|
| `values()`          | Returns an array of all enum constants.     |
| `valueOf(String)`   | Converts a string to an enum constant.      |
| `ordinal()`         | Returns the index of the constant (0-based).|

### Example:

```java
public class EnumMethods {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }

    public static void main(String[] args) {
        Day d = Day.valueOf("TUESDAY");
        System.out.println("Ordinal of " + d + " is " + d.ordinal()); // Output: 1

        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
```

---

## 🔄 Enum Implementing Interface

Enums can also implement interfaces!

```java
interface Printable {
    void print();
}

enum Color implements Printable {
    RED {
        public void print() {
            System.out.println("This is RED");
        }
    },
    GREEN {
        public void print() {
            System.out.println("This is GREEN");
        }
    },
    BLUE {
        public void print() {
            System.out.println("This is BLUE");
        }
    };
}
```

### ✅ Usage:

```java
public class ColorTest {
    public static void main(String[] args) {
        for (Color color : Color.values()) {
            color.print();
        }
    }
}
```

---

## 🧠 Summary

- Enums define **fixed sets of constants** (like days, colors, etc.).
- Can include **constructors, methods, fields** and **implement interfaces**.
- Are great for use in `switch` statements.
- Are **type-safe** and **easy to maintain** compared to regular constants.

---

## 🎯 Best Practices

- Use enums when values are **fixed and finite**.
- Use `switch` to handle different behaviors per constant.
- Prefer enums over integer or string constants for **clarity and safety**.
