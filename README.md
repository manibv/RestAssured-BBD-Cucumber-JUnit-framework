\# 🚀 API Automation Framework – RestAssured + Cucumber + JUnit5



\## 📌 Overview



This project is a \*\*BDD-based API Automation Framework\*\* built using industry-standard tools:



\* \*\*Rest Assured\*\* – API testing

\* \*\*Cucumber\*\* – Behavior Driven Development (BDD)

\* \*\*JUnit 5\*\* – Test execution

\* \*\*Maven\*\* – Build \& dependency management

\* \*\*Extent Reports\*\* – Rich HTML reporting



The framework validates REST APIs using \*\*Gherkin feature files\*\* and generates \*\*detailed execution reports with history tracking\*\*.



\---



\## 🏗️ Project Architecture



```

src

├── main/java

│    └── pojo                # Request/Response models

│

├── test/java

│    ├── cucumber.Options    # Test Runner (JUnit5)

│    ├── stepDefinations     # Step Definitions

│    └── resources           # Utilities, API resources, test data

│

├── test/resources

│    ├── features            # Gherkin feature files

│    ├── extent.properties   # Extent report config

│    └── global.properties   # Environment config

```



\---



\## ▶️ How to Run



\### 🔹 Run using Maven



```bash

mvn clean test

```



\### 🔹 Run using Batch File (Recommended)



```bash

run-tests.bat

```



\---



## 📊 Test Reports

The framework generates multiple reports for better visibility and debugging.
All reports are organized under the `target/` directory.

### 📁 Report Structure

```
target/
├── cucumber-html/
│     └── cucumber-report.html        # Human-readable execution report
│
├── cucumber-json/
│     └── cucumber-report.json        # Machine-readable report (CI/CD integration)
│
├── junit-report/
│     └── cucumber-report.xml         # JUnit-style report for pipelines
│
└── ExtentReports/
      ├── archive/                   # Historical reports (timestamped)
      └── latest/
           └── ExtentReport.html     # Latest execution report
```

---

### 📌 Report Types

* **Cucumber HTML Report**

  * Easy-to-read execution summary
  * Shows scenarios, steps, and results

* **Cucumber JSON Report**

  * Used for integrations (CI/CD, dashboards, reporting tools)

* **JUnit XML Report**

  * Compatible with Jenkins, Azure DevOps, GitHub Actions

* **Extent Report**

  * Rich UI report with logs and detailed insights
  * Maintains:

    * 📁 **Archive reports** (history of executions)
    * 📄 **Latest report** (quick access)

---

### ▶️ How to View Reports

After execution:

```bash
mvn clean test
```

Open reports from:

* Latest Extent Report:

  ```
  target/ExtentReports/latest/ExtentReport.html
  ```

* Cucumber HTML Report:

  ```
  target/cucumber-html/cucumber-report.html
  ```

---

### 💡 Notes

* Reports are generated automatically on every run
* No manual folder creation required
* Eclipse may require **Refresh (F5)** to display new reports



\## ✨ Features



\* ✔ BDD approach using Gherkin syntax

\* ✔ Data-driven testing using Scenario Outline

\* ✔ Reusable request \& response specifications

\* ✔ Centralized API resource management

\* ✔ Request \& response logging

\* ✔ Extent reporting with archive + latest view

\* ✔ Maven-based execution



\---



\## 🛠️ Tech Stack



\* Java

\* Maven

\* Rest Assured

\* Cucumber (BDD)

\* JUnit 5

\* Extent Reports



\---



\## 📌 Sample Scenario



```gherkin

Feature: Validating Place API's



Scenario Outline: Verify if Place is being Successfully added

&#x20; Given Add Place Payload with "<name>" "<language>" "<address>"

&#x20; When user calls "AddPlaceAPI" with "POST" http request

&#x20; Then the API call got success with status code 200

```



\---



\## 👨‍💻 Author



\*\*Mani Bethina\*\*

🔗 GitHub: https://github.com/manibv



\---



\## ⭐ Future Enhancements



\* CI/CD integration (GitHub Actions / Jenkins)

\* Allure Reporting Dashboard

\* Parallel test execution

\* Environment-based execution (DEV/QA/PROD)



\---



\## 📣 Contribute



Feel free to fork and enhance this framework 🚀



