Code Sample
===================

We would like to get to know your coding style and see what you would consider your best work.
In subsequent interviews, we'll talk through your code and make some changes.

Mobile RPN Calculator
=====================

Implement a reverse polish notation (RPN) calculator as a native Android or iOS app. You can use any language and framework that you know well, as long as it's a native implementation (e.g. we don't want React Native or Flutter apps).

Imaginary Context
-----------------

We're building this mobile calculator for people who are comfortable with RPN calculations on their smartphones. We are starting with the basic 4 operators now but will want to eventually implement other operators and potentially on other devices. There's no need to implement these, but design with these future changes in mind.

Specifications
--------------

1. The calculator should have a user-friendly mobile interface
2. It should implement the four standard arithmetic operators
3. The calculator should handle errors and provide clear feedback to the user
4. The app should have a clear way to reset the calculation or start a new one

You may take creative liberty with the UI design and anything else; have fun with it!


Example Input/Output
--------------------

Use your best judgment as far as the format is concerned, as long as it makes sense to the end user. Your calculator should at the minimum handle the following examples.

    > 5 // Lines starting with > are user inputs
    5 // Lines without > are outputs displayed on the screen
    > 8
    8
    > +
    13

---

    > 5 5 5 8 + + -
    -13.0
    > 13 +
    0.0

---

    > -3
    -3.0
    > -2
    -2.0
    > *
    6.0
    > 5
    5.0
    > +
    11.0

---

    > 5
    5
    > 9
    9
    > 1
    1
    > -
    8
    > /
    0.625



Guidelines
==========

Things We Care About
--------------------

These hold true both for this submission and for your work here in general. We expect that:

- It works right
- The code is well-abstracted and uses good names
- It provides for a good user experience (end-user and programmer)
- The code adheres to style and practices accepted by the community
- Tests demonstrate intended use, help prevent regression, and can withstand change
- You write intention-revealing commit messages

There are a range of expectations from various companies in their interviewing code exercises, from minimal code to get the job done and prove you can program, to expecting exemplary code that demonstrates how well you can design things when the occasion requires it. We tend to judge toward the latter end of the spectrum, assuming that anyone who can write well-crafted code can also scale down quality to do things quickly, but not necessarily the other way around.

Readme
------

Write your README as if it was for a production service. Include the following items:

* A high-level description of your solution
* Reasoning behind your technical choices, including architectural
* Trade-offs you might have made, anything you left out, or what you might do differently if you were to spend additional time on the project
* How to run your code, including any necessary setup for the mobile development environment
* Instructions on how to use the simulator or emulator to test the app
* Link to the hosted application, if applicable

Submitting
----------

Submit your code as a **separate** git repository, preferably on GitHub
