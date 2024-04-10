# Spring Boot Basics

This repository contains a collection of Spring Boot examples focusing on various annotations and features commonly used in Spring Boot applications. These examples are designed to help reinforce your understanding of Spring Boot concepts and improve your familiarity with commonly used annotations.

## Getting Started

To run these examples locally, follow these steps:

1. Clone this repository to your local machine using Git:

   ```bash
   git clone https://github.com/aytekinkaplan/new_spring_boot_revisit_works.git

 Examples
1. Path Variable Example
This example demonstrates the usage of @PathVariable annotation in Spring Boot. It includes a REST controller (SB004_PathVariable) with a GET endpoint that accepts a message as a path variable and returns it in the response.

To run this example, navigate to the SB004_PathVariable class and execute it as a Java application. Then, you can access the endpoint at http://localhost:8080/api/v1/message/{message}.

2. Matrix Variable Example
This example illustrates how to handle matrix variables in a Spring Boot application using the @MatrixVariable annotation. It includes a REST controller (MatrixVariableController) with a GET endpoint that accepts color and brand matrix variables.

To run this example, navigate to the MatrixVariableController class and execute it as a Java application. Then, you can access the endpoint at http://localhost:8080/api/v1/cars;color={color};brand={brand}.

Contributions to this repository are welcome! If you have any improvements or additional examples to suggest, feel free to submit a pull request.



Feel free to customize this example README file according to your project's needs.

