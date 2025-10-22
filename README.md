# 🧪 DemoQA – JUnit + Selenium Automation Suite

This repository hosts an educational web automation suite built to demonstrate core web testing concepts using **Selenium WebDriver** and the **JUnit** framework. It is structured as a foundation for individuals learning test automation with the Java ecosystem.

---

## 🎯 Overview

The project provides a hands-on implementation of essential web automation techniques by targeting various functionalities on the DemoQA website. The test cases showcase solutions for common challenges encountered in UI automation, ensuring the code is both functional and educational.

## 🚀 Key Features

* **Automated Test Scripts:** Contains test scripts for a wide range of web interactions (e.g., forms, alerts, window handling).
* **Core Selenium Techniques:** Demonstrates mouse actions (double-click, hover), handling dropdown selections, and managing multiple browser windows/tabs.
* **Structured Design:** Test files are logically structured to follow modular best practices.
* **Educational Use Case:** Designed specifically for beginners and aspiring SDETs to learn robust Java-Selenium automation.

---

## 🧰 Tech Stack

| Component | Technology | Version |
| :--- | :--- | :--- |
| **Language** | Java | (Specify your Java version, e.g., 17) |
| **Test Framework**| JUnit | Latest |
| **Automation Tool**| Selenium WebDriver | Latest |
| **Build Tool** | Gradle | Latest |

---

## ⚙️ Setup and Execution

### Prerequisites

* Java Development Kit (JDK) installed.
* Gradle installed or integrated via your IDE (IntelliJ IDEA/Eclipse).

### Running Tests

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/rubaiatferdous15/Automation-using-Junit-Selenium.git](https://github.com/rubaiatferdous15/Automation-using-Junit-Selenium.git)
    cd Automation-using-Junit-Selenium
    ```
2.  **Execute the tests** using the Gradle wrapper (ensures correct version usage):
    ```bash
    # On Windows
    ./gradlew test
    
    # On Linux/macOS
    ./gradlew test
    ```
3.  **View Reports:** Detailed test reports will be generated in the `build/reports/tests/test/index.html` directory.

---

## 📝 Test Coverage Examples

The suite includes tests demonstrating:

* **Form Submissions:** User creation and data verification.
* **Dynamic Elements:** Double-click and right-click actions.
* **Browser Interactions:** Handling alerts and date pickers.
* **Window Management:** Switching between new tabs and windows (`handleNewTab`, `handleMultipleWindow`).
* **Data Scraping:** Extracting information from web tables (`scrapTableData`).

## Report

<img width="1869" height="872" alt="image" src="https://github.com/user-attachments/assets/267cd0d7-4a9f-43cc-ae7d-1274b07c85b0" />
