# Lab 03: Black Box Testing Techniques

## Software Quality Engineering

This repository contains the implementation and documentation for Lab 03, focused on applying **Equivalence Partitioning (EP)** and **Boundary Value Analysis (BVA)** to a Marks Entry Checker program.

## Objective

The objective of this lab is to understand and apply black box testing techniques to verify whether a marks entry system accepts valid marks and rejects invalid marks.

The system must accept marks between **0 and 100 inclusive**.

## Testing Techniques

### 1. Equivalence Partitioning (EP)

The input domain is divided into three equivalence partitions.

| Partition | Input Range | Representative Value | Expected Result |
|---|---|---:|---|
| P1 | Below 0 | -5 | Invalid |
| P2 | 0 to 100 | 50 | Valid |
| P3 | Above 100 | 105 | Invalid |

### 2. Boundary Value Analysis (BVA)

Boundary Value Analysis tests values around the minimum and maximum allowed marks.

| Test Case | Input | Expected Result |
|---|---:|---|
| TC-04 | -1 | Invalid |
| TC-05 | 0 | Valid |
| TC-06 | 1 | Valid |
| TC-07 | 99 | Valid |
| TC-08 | 100 | Valid |
| TC-09 | 101 | Invalid |

## Project Structure

```text
lab03-blackbox/
│
├── MarksEntryChecker.java
├── lab03-task-marks.xlsx
├── Marks_Entry_Checker_SRS_Report.docx
└── README.md
```

## Technologies and Tools

* Java
* JDK 17
* Visual Studio Code
* Microsoft Excel
* Git
* GitHub

## How to Run

### Step 1: Clone the Repository

```bash
git clone YOUR_REPOSITORY_URL
```

### Step 2: Navigate to the Project Directory

```bash
cd lab03-blackbox
```

### Step 3: Compile the Java Program

```bash
javac MarksEntryChecker.java
```

### Step 4: Run the Program

```bash
java MarksEntryChecker
```

### Step 5: Execute Test Cases

Run the program with the test inputs listed in the Excel workbook and compare the actual results with the expected results.

## Test Documentation

The Excel workbook contains:

* Equivalence Partitioning test cases
* Boundary Value Analysis test cases
* Input partitions and boundary values
* Expected results
* Actual results and test status columns

The test results should be updated after executing each test case.

## Software Requirements Specification

The `Marks_Entry_Checker_SRS_Report.docx` file contains the Software Requirements Specification, including the system purpose, scope, functional requirements, non functional requirements, operating environment, and constraints.

## Conclusion

This lab demonstrates how Equivalence Partitioning and Boundary Value Analysis can be used to design effective test cases. These techniques help identify invalid inputs, verify valid input ranges, and detect defects at the boundaries of a system.
