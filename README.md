🛒 Selenium Java E-commerce Automation
📖 Overview
This project is an automated testing framework for an e-commerce application built using:

Java as the programming language

Selenium WebDriver for browser automation

JUnit 5 as the test runner and framework

Extent Reports for rich HTML reporting

Maven as the build and dependency management tool

The framework is designed to validate core e-commerce functionalities such as product search, cart management, checkout, and user authentication.

⚙️ Tech Stack
Component	Purpose
Java	Core programming language
Selenium WebDriver	Browser automation
JUnit 5	Test framework and runner
Extent Reports	Interactive test reporting
Maven	Build tool and dependency management


📂 Project Structure
Code
selenium-ecommerce/
│── src/
│   ├── main/java/        # Application code (if any utilities/helpers)
│   └── test/java/        # Test classes
│── pom.xml               # Maven configuration
│── README.md             # Project documentation
│── reports/              # Extent Reports output
🚀 Getting Started
1. Clone the Repository
bash
git clone https://github.com/mevikash13195/EcommerceApp.git
cd selenium-ecommerce
2. Install Dependencies
Maven will automatically download required dependencies:

bash
mvn clean install
3. Run Tests
Execute tests using JUnit 5 runner:

bash
mvn test
4. View Reports
After execution, open the generated Extent Report:

Code
reports/extent-report.html
🧪 Sample Test Flow
Launch browser

Navigate to e-commerce site

Search for a product

Add product to cart

Proceed to checkout

Validate order confirmation

📊 Reporting
Extent Reports provides detailed insights:

Test execution status (Pass/Fail/Skip)

Screenshots on failure

Logs and system info

🔧 Configuration
Browser setup can be controlled via config.properties

Test data can be managed in external files (CSV/Excel/JSON)

Parallel execution supported via JUnit 5

✅ Best Practices
Keep tests independent and atomic

Use Page Object Model (POM) for maintainability

Integrate with CI/CD pipelines for continuous testing

👨‍💻 Author
Name: Vikash Kumar

Email: vikashchauhan13195@gmail.com

GitHub: https://github.com//mevikash13195

LinkedIn: www.linkedin.com/in/mevikash13
