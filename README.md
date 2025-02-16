# Movie Review System

## Overview
This project is a **Movie Review System** built using **Spring Boot** and **MySQL**. It allows users to add movies, post reviews, and update reviews.

## Technologies Used
- **Spring Boot** (Backend API)
- **Spring Data JPA** (Database interaction)
- **MySQL** (Database)
- **Swagger UI** (API documentation and testing)
- **Postman** (API testing tool)
- **GitHub** (Version control)

## Features
- **Add Movies**
- **Fetch Movies with Reviews**
- **Add Reviews to Movies**
- **Update Reviews**

## API Endpoints
### 1. Get All Movies with Reviews
**Endpoint:** `GET /movies`

**Response:**
```json
[
    {
        "id": 1,
        "title": "Inception",
        "genre": "Sci-Fi",
        "releaseYear": 2010,
        "reviews": []
    }
]
```

### 2. Add a Movie
**Endpoint:** `POST /movies`

**Request Body:**
```json
{
    "title": "Inception",
    "genre": "Sci-Fi",
    "releaseYear": 2010
}
```

**Response:**
```json
{
    "id": 1,
    "title": "Inception",
    "genre": "Sci-Fi",
    "releaseYear": 2010,
    "reviews": []
}
```

### 3. Add a Review for a Movie
**Endpoint:** `POST /reviews/{movieId}`

**Request Body:**
```json
{
    "reviewerName": "John Doe",
    "comment": "Amazing movie!",
    "rating": 5
}
```

**Response:**
```json
{
    "id": 1,
    "reviewerName": "John Doe",
    "comment": "Amazing movie!",
    "rating": 5,
    "movieId": 1
}
```

### 4. Update a Review
**Endpoint:** `PUT /reviews/{reviewId}`

**Request Body:**
```json
{
    "comment": "Mind-blowing movie!",
    "rating": 5
}
```

**Response:**
```json
{
    "id": 1,
    "reviewerName": "John Doe",
    "comment": "Mind-blowing movie!",
    "rating": 5,
    "movieId": 1
}
```

## Running the Project
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/movie-review-system.git
   ```
2. Navigate to the project directory:
   ```sh
   cd movie-review-system
   ```
3. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```
4. Access the API documentation at:
   ```
   http://localhost:8080/swagger-ui.html
   ```

## Contributing
Feel free to fork the repository, create a new branch, and submit a pull request with your improvements!

## License
This project is licensed under the MIT License.

