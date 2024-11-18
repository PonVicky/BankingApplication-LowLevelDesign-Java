# Banking Application - Low-Level Design (Java)

This repository contains a **Banking Application** implemented in Java. The project demonstrates **low-level design (LLD)** principles to create a secure and interactive banking system with robust user authentication and multiple account management features.

---

## 📖 Features

1. **Create Account**:
   - Users can create an account by providing:
     - **Name**
     - **Account Type**: Savings or Current
     - **Initial Deposit Amount**
     - **4-Digit PIN**: Ensures security by prompting users to re-enter and validate their PIN.
   - A unique **account number** is generated for each user after successful account creation.

2. **Display All Account Details**:
   - Displays a list of all accounts with:
     - **Name**
     - **Account Type**
     - **Account Number**  
   - Balances and PINs remain hidden to maintain privacy.

3. **Transfer Amount**:
   - Transfer money to another account using their **account number**.
   - If the receiver's account number is unknown, users can view the account list (via **Display All Account Details**) to find the required information.
   - Transfers are authenticated with the sender’s **account number** and **PIN**.

4. **Search by Account Number**:
   - Users can search for an account using their **account number** to view their current balance.
   - Authentication ensures only valid account holders can access the information.

5. **Deposit Amount**:
   - Deposit money into an account by entering:
     - **Account Number**
     - **PIN**
   - Authentication is required to ensure security.

6. **Withdraw Amount**:
   - Withdraw money from an account by entering:
     - **Account Number**
     - **PIN**
   - Prompts for valid credentials and checks if the account has sufficient balance.

7. **Exit**:
   - Safely exits the application.

---

## 🛠️ Tech Stack

- **Language**: Java  
- **Design Principles**:
  - Low Level System Design (LLD) 
  - Object-Oriented Programming (OOP)
  - Single Responsibility Principle (SRP)
  - Separation of Concerns

---

### ⚙️ Key Components
1. **Main**: Handles the user interface and manages menu-driven interactions.
2. **Account**: Represents account details such as account number, account type, balance, and PIN.
3. **Authentication**: Ensures secure access to accounts through account number and PIN validation.
4. **BankOperations**: Implements banking functions including account creation, transfers, deposits, and withdrawals.

---

🖥️**HOW IT WORKS**

**Application Flow**
1.Create Account:
  - Input your name, account type, initial deposit, and a 4-digit PIN.
  - Re-enter the PIN for validation
  - Upon successful creatio, you'll receive a unique account number.

2.Authenticate Operations: 
  - For account-related operations(search, deposit, withdraw), you'll be prompted to:
      - Enter your account number.
      - Authenticate with your PIN.
  - Invalid credentials will prompt retries until valid details are provided.

3. Deposit and Withdraw:
  - Deposit moey into or withdraw money from your account after authentication.
  - Withdrawals check for sufficient balance before proceeding.

4. Search and View Details:
  - Search your account by entering your account number.
  - After authentication. view your current balance.

5. Transfer Money:
  - Transfer funds to another account by providing:
      - Receiver's account number
      - Amount to transfer
      - Your account number and PIN for authentication.
  - If the receiver's account number is unknown, view the Display all Account details option to find their account information.

6. Exit:
   -Exit the application safely.








