# PrimeNumberChecker
# Optimized Prime Number Checker

A lightweight, high-performance Java application that checks whether a given number is prime. This project demonstrates foundational Object-Oriented Programming (OOP) syntax in Java and implements an optimized mathematical approach for primality testing.

## 🚀 Features

* **Optimized Loop Control:** Instead of checking all numbers up to $n-1$, the algorithm stops at $\sqrt{n}$ ($i \times i \le n$), drastically reducing system execution time.
* **Interactive CLI:** Uses the `Scanner` utility to take dynamic user inputs from the console.
* **Edge-Case Handling:** Explicitly accounts for numbers less than or equal to 1, which are mathematically non-prime.

## 🛠️ How It Works (The Math)

The program uses the **Symmetry Property** of factor pairs. For any number $n$, if it has a divisor, at least one factor in the pair must be less than or equal to $\sqrt{n}$. 

* **Traditional Approach:** Time Complexity of $O(n)$
* **This Optimized Approach:** Time Complexity of $O(\sqrt{n})$

For example, to check if `1,000,000,000` is prime, a standard loop runs 1 billion times, whereas this optimized code only runs roughly `31,622` times!
