<#import "layout.ftlh" as layout>

<@layout.page title="About">

    <div class="page-header">
        <h1>About</h1>
        </div>

    <div class="about-body">
    <p>This website was created as practice for the software project and serves as a character gallery
        for iconic sci-fi characters. It felt easier in my head to pick characters from different 
        universes, especially ones who have a lot of information available about them.
    </p>


    </div>

    <img src="https://images.wallpapersden.com/image/download/space-station-hd-sci-fi-planet-art_bmZubmaUmZqaraWkpJRmbmdlrWZlbWU.jpg" class="img-fluid rounded mt-3" style="width:  100%; height: 400px; object-fit: cover;">

    <div class="about-body mt-4">

    <h2>How This Application Works</h2>

    <p>
        This application uses a layered architecture, with each layer
        responsible for a different part of the website's functionality.
    </p>

    <h4>Presentation Layer</h4>
    <p>
        The presentation layer uses Spring MVC controllers and FreeMarker
        templates to display the website, handle user interactions, and
        present character information.
    </p>

    <h4>Service Layer</h4>
    <p>
        The service layer contains the application's business logic.
        The SciFiCharacterService handles operations such as creating,
        searching, updating, and deleting characters.
    </p>

    <h4>Repository Layer</h4>
    <p>
        The repository layer uses Spring Data JPA to communicate with
        the database and retrieve or modify character records.
    </p>

    <h4>Database Layer</h4>
    <p>
        The database layer uses PostgreSQL to store character information,
        including names, descriptions, franchises, abilities, and images.
    </p>

</div>

</@layout.page>