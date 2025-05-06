# Serverless Java App with AWS Lambda and S3

This project demonstrates a simple **serverless application** built using **Java 17** and deployed on **AWS Lambda**. The Lambda function accepts JSON input and stores the data into an **Amazon S3 bucket**, making it ideal for lightweight APIs, file ingestion pipelines, or microservices.

> ✅ Suitable for learning serverless Java + AWS  
> ✅ Designed to be deployed with Maven and AWS Console or SAM  
> ✅ EB-1A portfolio ready for GitHub evidence

---

## 📌 Use Case

- Accepts POSTed data (via API Gateway or direct event)
- Writes the content to S3 with a unique file key
- Responds with the generated S3 key

---

## 🛠 Technologies Used

- Java 17  
- AWS Lambda  
- Amazon S3  
- AWS SDK v2  
- Maven  
- Maven Shade Plugin

---

## 📁 Project Structure
serverless-java-s3/
├── pom.xml
└── src/
└── main/
├── java/
│ └── com/
│ └── example/
│ └── lambda/
│ └── FileUploadHandler.java
└── resources/
Deploy to AWS Lambda
Runtime: Java 17
Handler:
com.example.lambda.FileUploadHandler
Author:Avinash Chirumamilla
Senior Full Stack Developer | Java | AWS | Spring Boot | Angular

MIT License — Feel free to use and modify.
