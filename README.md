# GeoVision 
GeoVision is a Spring Boot application focused on providing map location functionalities. While the specific features are not explicitly detailed in the provided repository, the project structure suggests a typical web application with distinct layers for configuration, controllers, data transfer objects (DTOs), models, repositories, and services. It appears to be a foundational project for learning Spring Boot, as indicated by the original README: "These are all the projects i made during my leaning phase of Spring Boot".

## Project Structure
The project follows a standard Maven-based Spring Boot application structure:
```
GeoVision/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/com/myapp/p_23_maplocator/
│   │   │   ├── Config/             # Configuration classes
│   │   │   ├── Controller/         # REST controllers for handling web requests
│   │   │   ├── DTO/                # Data Transfer Objects
│   │   │   ├── Model/              # Data models/entities
│   │   │   ├── Repository/         # Data access layer (e.g., Spring Data JPA repositories)
│   │   │   ├── Service/            # Business logic layer
│   │   │   └── P23MaplocatorApplication.java # Main Spring Boot application class
│   │   └── resources/
│   │       ├── static/css/         # Static CSS files
│   │       ├── templates/          # HTML templates (e.g., Thymeleaf, FreeMarker)
│   │       └── application.properties # Application configuration properties
│   └── test/
├── .gitattributes
├── .gitignore
├── LICENSE
├── README.md
├── mnw
├── mnw.cmd
└── pom.xml                     # Maven Project Object Model
```

- **`src/main/java/com/myapp/p_23_maplocator/`**: Contains the core Java source code, organized into packages representing different layers of the application.
- **`src/main/resources/`**: Holds static assets (CSS), templates, and application configuration.
- **`pom.xml`**: The Maven build configuration file, listing project dependencies and build plugins.

## Technologies Used
The project is built using the following key technologies:
- **Java**: The primary programming language.
- **Spring Boot**: Framework for building stand-alone, production-grade Spring-based applications.
- **Maven**: Build automation tool for Java projects.

Based on the `pom.xml` file, the project includes the `spring-boot-starter-parent` and `spring-boot-starter-web` dependencies, indicating a web application. Further dependencies would be listed in the `pom.xml` for more specific functionalities (e.g., database connectivity, security, templating engines).

## Setup and Usage
To set up and run this project locally, follow these steps:

### Prerequisites
- **Java Development Kit (JDK) 17 or higher**: Ensure JDK is installed and configured on your system.
- **Maven**: Maven is typically bundled with Spring Boot projects, but ensure it's available in your PATH if you plan to use `mvn` commands directly.

### Getting Started
1.  **Clone the repository:**
    ```bash
    git clone https://github.com/Navneetg2003/GeoVision.git
    cd GeoVision
    ```

2.  **Build the project:**
    Use Maven to build the project. This will download all necessary dependencies and compile the source code.
    ```bash
    ./mvnw clean install
    ```
    *Note: `./mvnw` is the Maven Wrapper script, which ensures you use the correct Maven version for the project.*

3.  **Run the application:**
    After a successful build, you can run the Spring Boot application.
    ```bash
    ./mvnw spring-boot:run
    ```

    The application should start on its default port (usually 8080). You can access it in your web browser at `http://localhost:8080`.

### Further Development

- **IDE Import**: You can import this Maven project into your favorite IDE (e.g., IntelliJ IDEA, Eclipse, VS Code) as an existing Maven project.
- **Database Configuration**: If the application requires a database, you will need to configure the `src/main/resources/application.properties` file with your database credentials and connection details.
- **API Endpoints**: Explore the `Controller` package to identify the available API endpoints and their functionalities.

