<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add a Character</title>

     <link 
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
    rel="stylesheet">

    <link rel="stylesheet" href="Visual.css">

</head>


<body>
    
<nav class="navbar navbar-dark bg-dark">
    <div class="container-fluid">

        <div class="navbar-nav d-flex flex-row gap-5">
            <a class="nav-link text-white" href="index.html">Home</a>
            <a class="nav-link text-white" href="details.html">Details</a>
            <a class="nav-link text-white" href="about.html">About</a>
            <a class="nav-link text-white" href="new-character-form.html">Add a Character</a>
        </div>

        <form class="d-flex ms-auto">
            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-light" type="submit">Search</button>
        </form>

    </div>
</nav>

<div class="page-header">
<h1>Add a Character</h1>
</div>

<div class="container mt-4">

    <div class="form-subtitle">
        <p>Fill out the fields below to add your favorite sci-fi character!</p>
    </div>

    <div class="mb-3">
    <label for="characterName" class="form-label">Character Name</label>
    <input type="text" class="form-control" id="characterName">
</div>

<div class="mb-3">
    <label for="universe" class="form-label">Universe</label>
    <input type="text" class="form-control" id="universe">
</div>

<div class="mb-3">
    <label for="role" class="form-label">Role</label>
    <input type="text" class="form-control" id="role">
</div>

<div class="mb-3">
    <label for="imageUrl" class="form-label">Image URL</label>
    <input type="url" class="form-control" id="imageUrl">
</div>

<div class="mb-3">
    <label for="description" class="form-label">Short Description</label>
    <textarea class="form-control" id="description" rows="4"></textarea>
</div>

<button type="submit" class="btn btn-primary">Add Character</button>

</div>

</body>
</html>