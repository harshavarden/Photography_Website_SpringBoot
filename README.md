# Photography_Website_SpringBoot
The Fully functionally photography website developed using spring boot framework
(***Look as code for detailed view***))
A Photography Website built with Spring Boot, JPA, and Thymeleaf to showcase photographs and manage data related to photographers and their galleries. This project provides a structured implementation of Spring Boot framework with database integration using JPA and Hibernate.

Features
User-friendly interface for showcasing photography galleries.
>Add, update, and delete photographers and their photographs.
>Backend data persistence with JPA and Hibernate.
>RESTful API support for CRUD operations.
>Simple navigation and professional design with Thymeleaf.

Website was intended for a camera studio client, with his customers to be able to send or upload him images to get them edited or to deliver hard copy, and owner of website shoiuld be able to post soem gallery of images in his website So, lets look at the Project Structure :
photography_website/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   └── example/
│   │   │   │       ├── PhotographyWebsiteApplication.java  // Main entry point
│   │   │   │       ├── controller/                         // Controller classes for routing
│   │   │   │       │   └── GalleryController.java          // Gallery and file handling
│   │   │   │       ├── model/                              // JPA entities
│   │   │   │       │   ├── Image.java                      // Image entity
│   │   │   │       ├── repository/                         // JPA repository for data access
│   │   │   │       │   └── ImageRepository.java            // Repository for Image entity
│   │   │   │       ├── service/                            // Service layer
│   │   │   │       │   └── ImageService.java               // Business logic for image handling
│   │   │   │       ├── exception/                          // Custom exceptions
│   │   │   │       │   └── FileUploadException.java        // Exception for upload failures
│   │   │   │       └── config/                             // Configuration files
│   │   │   │           └── WebConfig.java                  // Web configuration (optional)
│   │   ├── resources/
│   │   │   ├── templates/
│   │   │   │   ├── index.html                             // Homepage template
│   │   │   │   ├── gallery.html                           // Gallery page template
│   │   │   │   ├── upload.html                            // File upload page template
│   │   │   │   └── admin.html                             // Admin page for managing images
│   │   │   ├── static/
│   │   │   │   ├── css/
│   │   │   │   │   └── styles.css                         // Custom CSS for styling
│   │   │   │   └── images/
│   │   │   │       └── user_uploads/                      // User-uploaded images
│   │   ├── application.properties                          // Configuration file for Spring Boot
└── pom.xml                                                 // Maven build configuration

Project Architecture
The application follows a layered architecture to promote modularity and ease of maintenance:
1.Controller Layer: Handles HTTP requests and interacts with the Service Layer.
2.Service Layer: Contains business logic and interacts with the Repository Layer.
3.Repository Layer: Directly interacts with the database via JPA.

Tech Stack
>Backend: Java, Spring Boot (Spring Data JPA, Thymeleaf, Spring MVC)
>Frontend: HTML5, CSS3, Bootstrap
>Database: H2 (In-memory database for testing and development)
>Build Tool: Maven (version - 3.4.0)
>Development Environment: IntelliJ IDEA / Eclipse
>Entity Layer: Contains JPA entity classes for defining database schemas.

How to Run the Project : 
1.Clone the repository: git clone <repository-url>
2.Navigate to the project directory: cd Photography_Website
3.Run the application using Maven: mvn spring-boot:run
4.mvn spring-boot:run: http://localhost:8080


Harsha
