# assignment3-api-highland

## Description

This project is a REST API for managing iconic science-fiction characters. The API was built using Spring Boot, Spring Data JPA, PostgreSQL, and Docker, and is deployed on Render.

The character type used in this API is a science-fiction character. The API supports creating, viewing, updating, deleting, searching, and filtering characters.

## Entity

The `SciFiCharacter` entity represents a science-fiction character.

| Attribute | Type | Rules |
|---|---|---|
| `characterId` | `long` | Primary key; automatically generated |
| `name` | `String` | Required; cannot be blank |
| `description` | `String` | Required; cannot be blank |
| `franchise` | `String` | Required; cannot be blank |
| `species` | `String` | Required; cannot be blank |


## API Endpoints

Base URL:

https://assignment3-api-highland.onrender.com

| Method | Path | Description | Success Status |
|---|---|---|---|
| GET | `/api/characters` | Get all characters | 200 OK |
| GET | `/api/characters/{id}` | Get a character by ID | 200 OK |
| POST | `/api/characters` | Create a new character | 201 Created |
| PUT | `/api/characters/{id}` | Update an existing character | 200 OK |
| DELETE | `/api/characters/{id}` | Delete a character | 204 No Content |
| GET | `/api/characters?franchise={franchise}` | Filter characters by franchise | 200 OK |
| GET | `/api/characters?name={name}` | Search characters by partial name, case-insensitive | 200 OK |
| GET | `/api/characters?name={name}&franchise={franchise}` | Search by name and filter by franchise | 200 OK |

### POST Example

**POST** `/api/characters`

{
  "name": "Darth Vader",
  "description": "A powerful Sith Lord and former Jedi Knight.",
  "franchise": "Star Wars",
  "species": "Human/Cyborg"
} 


### PUT Example

**PUT** `/api/characters/1`

{
  "name": "Darth Vader",
  "description": "A powerful Sith Lord and former Jedi Knight who serves the Galactic Empire.",
  "franchise": "Star Wars",
  "species": "Human/Cyborg"
} 


## Deployed API

The API is deployed on Render:

https://assignment3-api-highland.onrender.com

The Render free service may sleep when idle. The first request after a period of inactivity may take up to a minute while the service starts back up.
