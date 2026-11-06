# assignment4-api-highland

## Description

This project is a web application for managing iconic science-fiction characters. Originally developed as a REST API, the application was expanded to include a Spring Boot MVC website using FreeMarker templates.

The application allows users to browse a character gallery, search and filter characters, view detailed character information, and create, update, and delete character records.

The application was built using Spring Boot, Spring MVC, FreeMarker, Spring Data JPA, PostgreSQL, Bootstrap, and Docker. It is deployed on Render.

## Entity

The `SciFiCharacter` entity represents a science-fiction character.

| Attribute | Type | Rules |
|---|---|---|
| `characterId` | `long` | Primary key; automatically generated |
| `name` | `String` | Required; cannot be blank |
| `description` | `String` | Character backstory and description |
| `franchise` | `String` | Character's franchise or universe |
| `species` | `String` | Character's species |
| `abilities` | `String` | Character's abilities |
| `firstAppearance` | `String` | Character's first appearance |
| `personalityTraits` | `String` | Character's personality traits |
| `imageUrl` | `String` | URL for the character's image |

## MVC Website

The website provides the following functionality:

- Browse all science-fiction characters stored in the database.
- Search characters by name and franchise.
- View detailed character information.
- Add new characters.
- Edit existing characters.
- Delete characters with a confirmation page.
- Display a custom error page when a character cannot be found.
- Use a shared navigation layout across website pages.
- Display placeholder images when character image URLs are unavailable.

## MVC Routes


The following routes are used to navigate and interact with the character gallery website.

| Method | Path | Description |
|---|---|---|
| GET | `/` | Display the character gallery |
| GET | `/?name={name}` | Search characters by name |
| GET | `/?franchise={franchise}` | Filter characters by franchise |
| GET | `/?name={name}&franchise={franchise}` | Search by name and filter by franchise |
| GET | `/characters/{id}` | Display character details |
| GET | `/about` | Display the About page |
| GET | `/characters/new` | Display the add-character form |
| POST | `/characters` | Create a new character |
| GET | `/characters/{id}/edit` | Display the edit-character form |
| POST | `/characters/{id}` | Update an existing character |
| GET | `/characters/{id}/delete` | Display the delete confirmation page |
| POST | `/characters/{id}/delete` | Delete a character |

## Live Application

https://assignment3-api-highland.onrender.com

## REST API Endpoints

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
  "description": "A powerful Sith Lord.",
  "franchise": "Star Wars",
  "species": "Cyborg",
  "abilities": "Force abilities and lightsaber combat",
  "firstAppearance": "Star Wars: Episode IV - A New Hope (1977)",
  "personalityTraits": "Ruthless, intimidating, and determined",
  "imageUrl": ""
}


### PUT Example

**PUT** `/api/characters/1`

{
  "name": "Darth Vader",
  "description": "A powerful Sith Lord and former Jedi Knight.",
  "franchise": "Star Wars",
  "species": "Human/Cyborg",
  "abilities": "Force abilities and lightsaber combat",
  "firstAppearance": "Star Wars: Episode IV - A New Hope (1977)",
  "personalityTraits": "Ruthless, intimidating, and determined",
  "imageUrl": ""
}

## Deployment Notes
The Render free service may sleep when idle. The first request after a period of inactivity may take up to a minute while the service starts back up.
