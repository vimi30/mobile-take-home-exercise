## RPN Calculator

A modern Android calculator app implementing the Reverse Polish Notation (RPN) calculation method, built with Jetpack Compose and Material Design 3.

## Overview

RPN Calculator offers a sleek, user-friendly interface for performing calculations using Reverse Polish Notation. Unlike traditional calculators, RPN eliminates the need for parentheses by using postfix notation, where operators follow their operands, enabling efficient and intuitive calculations.

## Features
- **Real-time calculations** as you type.
- **Space-separated input** for numbers and operators.
- **Error feedback** for invalid inputs.
- Support for basic arithmetic operations: `+`, `-`, `*`, `/`.
- **Material Design 3** with dynamic theming.
- **Dark/Light theme** support.

## Technical Architecture

### Technology Stack
- Kotlin
- Jetpack Compose
- Material Design 3
- Android Architecture Components (ViewModel)
- Kotlin Flows for state management

### Architecture Overview

The app follows a simplified MVVM (Model-View-ViewModel) architecture:
- Model: Represents the app’s core data and business logic.
- ViewModel: Manages UI-related data and survives configuration changes.
- View: The composable UI layer powered by Jetpack Compose.

### Technical Decisions

- Jetpack Compose: For modern, declarative UI development and better maintainability.
- ViewModel: For efficient state management and configuration change handling.
- Kotlin Flow: Ensures reactive state updates with lifecycle integration.
- Single-Activity Architecture: Simplifies navigation for the app’s scope.

## Trade-offs and Future Improvements

### Current Trade-offs
- Limited to basic arithmetic operations.
- No calculation history.
- No state persistence.

### Potential Improvements
- Add advanced mathematical operations.
- Implement calculation history.
- Introduce state persistence.
- Support for multiple calculation modes.
- Increase unit testing coverage.
- Add UI testing using the Compose testing framework.

## Setup and Installation

### Prerequisites
- Android Studio Hedgehog | 2023.1.1 or newer.
- JDK 17.
- Android SDK with minimum API level 26 (Android 8.0).

### Building the Project
1. Clone the repository:

        git clone https://github.com/vimi30/rpn-calculator.git

2. Open in Android Studio:
- Open Android Studio
- Select "Open an existing project"
- Navigate to the cloned repository
- Click "Open"
- Build the project:
- Wait for Gradle sync to complete
- Select Build > Make Project

## Running the App

### Using Android Emulator
- Open AVD Manager in Android Studio.
- Create a new virtual device if none exists.
- Select a device definition (e.g., Pixel 6).
- Choose a system image (API 26 or higher).
- Click Run (▶️) or press Shift+F10.

### Using Physical Device
- Enable Developer Options on your device.
- Enable USB Debugging.
- Connect your device via USB.
- Select your device from the target device dropdown.
- Click Run (▶️).

## Using the Calculator

### Basic Operation
- Enter numbers and operators separated by spaces.
- Example: 2 3 + 4 * equals (2 + 3) * 4 = 20.

### Example Calculations
| **Input**       | **Result** |
|------------------|------------|
| `5 2 +`         | `7`        |
| `10 4 - 3 *`    | `18`       |
| `2 3 + 4 *`     | `20`       |
| `15 7 1 1 + - /`| `5`        |



### Input Format
- Numbers: Any valid decimal number.
- Operators: +, -, *, /.
- Separate all entries with spaces.

### Error Handling
- Division by zero.
- Invalid number format.
- Insufficient operands for the operation.

## Demo
https://github.com/user-attachments/assets/dbe42917-3bee-4de8-8f77-48fb80a8be9a
