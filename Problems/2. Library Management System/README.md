### Problem: **Library Management System**

You're tasked with building a simple **Library Management System** that allows users to borrow books. The system needs to track the **status of books** (borrowed or available) and manage **book return**.

Here’s the outline of the requirements:

1. Users should be able to **borrow** and **return** books.
2. Each book has a **title**, **author**, and **status** (whether it is **borrowed** or **available**).
3. We also want to allow the library to manage multiple types of books, such as **printed books** and **eBooks**. Each book type may have specific functionality, for example:
   - **PrintedBooks** may have additional details like **shelf location**.
   - **eBooks** may have additional details like **file size** and **file format**.
4. The system should be **flexible** enough to allow adding new types of books (e.g., **Audiobooks**), without changing the core logic of borrowing and returning books.

---

### What do you need to do?
- Apply the **SOLID principles** to design a **library management system**.
- Implement classes to handle **book management** (borrow and return), **book types** (printed, eBook), and the **status tracking** of books.
