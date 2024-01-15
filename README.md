# Faisal ATM - Java Console Application

## Description
Faisal ATM is a straightforward Java console application that emulates basic Automated Teller Machine (ATM) functionalities. Users can perform various actions, including withdrawing money, depositing funds, transferring money to another account, checking their balance, and exiting the program.

## Features
- Utilizes the `Scanner` class to accept user input from the console.
- Presents a user-friendly interface with a menu displaying available options.
- Implements a continuous loop (`while (true)`) to ensure the program runs until the user chooses to exit.
- Provides feedback messages for different scenarios, such as invalid inputs, exceeding withdrawal limits, and insufficient balance.

## Menu Options
1. **Withdraw:**
   - Enter 'w' or 'W' to withdraw money (up to $5,000).
   - Checks for withdrawal limits and insufficient balance.

2. **Deposit:**
   - Enter 'd' or 'D' to deposit money (up to $10,000).
   - Validates the deposit amount against the maximum allowed.

3. **Transfer:**
   - Enter 't' or 'T' to transfer money to another account.
   - User inputs recipient's name, account number, and transfer amount.
   - Validates the account number.

4. **Print Info:**
   - Enter 'p' or 'P' to display the account holder's name and current balance.

5. **Exit:**
   - Enter 'e' or 'E' to exit the program.

## Usage
1. Compile and run the program in a Java environment.
   ```bash
   javac Main.java
   java Main
