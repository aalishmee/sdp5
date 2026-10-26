# Strategy Pattern — Calculator
- **Name:** Medina Alish  
- **Group:** SE-2538  

A beginner-friendly Java implementation of the **Strategy design pattern**
using a simple calculator domain (add, subtract, multiply, divide).

## How it works
- `Strategy` — common interface for all arithmetic operations.
- `AddStrategy`, `SubtractStrategy`, `MultiplyStrategy`, `DivideStrategy` —
  concrete algorithms, each in its own class.
- `Calculator` — the Context. Holds a `Strategy` and delegates execution
  to it. Contains **no** `if` / `switch` on strategy type.
- `Main` — the Client. Selects and configures the strategy at runtime.

## Build & Run
```bash
javac -d out src/calculator/*.java
java -cp out calculator.Main
```

## Commands
| Command | Operation |
|---------|-----------|
| `add`   | a + b     |
| `sub`   | a − b     |
| `mul`   | a × b     |
| `div`   | a ÷ b     |
| `exit`  | quit      |

## Example session
```
=== Simple Strategy Calculator ===
Commands: add, sub, mul, div, exit

Enter command: add
Enter first number:  2
Enter second number: 3
Addition result: 5.00

Enter command: mul
Enter first number:  2
Enter second number: 3
Multiplication result: 6.00

Enter command: exit
Goodbye!
```

## How to add a new strategy
Adding a new operation takes **two steps** and **never touches existing classes**.

1. Create a new class that implements `Strategy`:
<img width="502" height="372" alt="image" src="https://github.com/user-attachments/assets/b8bb314f-2086-4a42-ba29-b4df94af6ca5" />

2. Add one line in `Main.java`:
<img width="546" height="55" alt="image" src="https://github.com/user-attachments/assets/b1e640fe-4ba3-480c-925a-0142bcdbdbf0" />

That's it. `Calculator`, `Strategy`, and all other strategies stay unchanged —
the design is **open for extension, closed for modification**.

## Project structure
```
strategy-calculator/
├── README.md
└── src/
    └── calculator/
        ├── Strategy.java
        ├── AddStrategy.java
        ├── SubtractStrategy.java
        ├── MultiplyStrategy.java
        ├── DivideStrategy.java
        ├── Calculator.java
        └── Main.java
```
