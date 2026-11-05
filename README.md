# 📚 Spring Data JPA - Cero a Experto

## 🎯 Descripción del Proyecto

Este es un proyecto educativo diseñado para aprender Spring Data JPA desde los conceptos básicos hasta un nivel
avanzado. El proyecto implementa una aplicación web usando Spring Boot con una arquitectura bien estructurada y
tecnologías modernas.

## 🛠️ Tecnologías Utilizadas

- **Java 21** - Lenguaje de programación principal
- **Spring Boot** - Framework principal
- **Spring Data JPA** - Para manejo de persistencia de datos
- **Spring MVC** - Para la capa web
- **Jakarta EE** - APIs empresariales
- **Lombok** - Para reducir código repetitivo
- **Maven** - Gestión de dependencias y construcción
- **Docker** - Containerización
- **Postman** - Documentación de APIs

## 📁 Estructura del Proyecto

``` 
spring-data-jpa-cero-a-experto/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── spring_boot_web_jpa/
│   │   │       ├── category/          # Módulo de categorías
│   │   │       ├── common/            # Clases comunes
│   │   │       ├── product/           # Módulo de productos
│   │   │       ├── productDetail/     # Detalles de productos
│   │   │       ├── review/            # Módulo de reseñas
│   │   │       └── SpringBootWebJpaApplication.java
│   │   └── resources/
│   └── test/
├── docker-config/                     # Configuración Docker
├── uploads/                          # Directorio de archivos subidos
├── .dockerignore
├── Dockerfile                        # Configuración del contenedor
├── compose.yml                       # Docker Compose
├── pom.xml                          # Configuración Maven
├── postman_collection.json         # Colección de Postman
└── README.md
```

## 🏗️ Arquitectura del Proyecto

El proyecto sigue una arquitectura modular organizada por dominios:

- **Category**: Gestión de categorías de productos
- **Product**: Gestión de productos
- **ProductDetail**: Detalles específicos de productos
- **Review**: Sistema de reseñas y comentarios
- **Common**: Componentes compartidos entre módulos

## 🚀 Cómo Ejecutar el Proyecto

### Prerrequisitos

- Java 21+
- Maven 3.8+
- Docker (opcional)

### Ejecución Local

``` bash
# Clonar el repositorio
git clone <repository-url>

# Navegar al directorio del proyecto
cd spring-boot-web-jpa

# Ejecutar con Maven
./mvnw spring-boot:run
```

### Ejecución con Docker

``` bash
# Construir y ejecutar con Docker Compose
docker-compose up --build
```

## 📋 Funcionalidades Principales

1. **Gestión de Categorías**
    - CRUD completo de categorías
    - Relaciones entre categorías y productos

2. **Gestión de Productos**
    - Administración de productos
    - Detalles específicos de productos
    - Relaciones con categorías

3. **Sistema de Reseñas**
    - Comentarios y calificaciones
    - Relaciones con productos

4. **Características Técnicas**
    - Persistencia con JPA
    - APIs REST
    - Validaciones
    - Manejo de archivos (uploads)

## 🧪 Testing

El proyecto incluye una colección de Postman () con todos los endpoints disponibles para facilitar las pruebas.
`postman_collection.json`

## 🐳 Docker

El proyecto está completamente dockerizado:

- **Dockerfile**: Configuración para construir la imagen de la aplicación
- Orquestación de servicios **compose.yml**
- Configuraciones adicionales de Docker **docker-config/**

## 📚 Aprendizaje Progresivo

Este proyecto está diseñado para aprender:

1. **Básico**: Configuración inicial de Spring Data JPA
2. **Intermedio**: Relaciones entre entidades, consultas personalizadas
3. **Avanzado**: Optimizaciones, transacciones, proyecciones
