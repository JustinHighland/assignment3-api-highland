<#import "layout.ftlh" as layout>

<@layout.page title="Add a Character">


<div class="container mt-4">

    <div class="page-header">
        <h1>Add a Character</h1>
    </div>


    <div class="form-subtitle">
        <p>Fill out the fields below to add your favorite sci-fi character!</p>
    </div>

      <form action="/characters" method="post">

    <div class="mb-3">
    <label for="characterName" class="form-label">Character Name</label>
    <input type="text" class="form-control" id="characterName" name="name" required>
</div>

<div class="mb-3">
    <label for="franchise" class="form-label">Franchise</label>
    <input type="text" class="form-control" id="franchise" name="franchise" required>
</div>

<div class="mb-3">
    <label for="species" class="form-label">Species</label>
    <input type="text" class="form-control" id="species" name="species" required>
</div>

<div class="mb-3">
    <label for="imageUrl" class="form-label">Image URL</label>
    <input type="url" class="form-control" id="imageUrl" name="imageUrl">
</div>

<div class="mb-3">
    <label for="description" class="form-label">Description</label>
    <textarea class="form-control" id="description" name="description" rows="4" required></textarea>
</div>

<div class="mb-3">
    <label for="abilities" class="form-label">Abilities</label>
    <textarea class="form-control" id="abilities" name="abilities" rows="4" required></textarea>
</div>

<div class="mb-3">
    <label for="firstAppearance" class="form-label">First Appearance</label>
    <textarea class="form-control" id="firstAppearance" name="firstAppearance" rows="4" required></textarea>
</div>

<div class="mb-3">
    <label for="personalityTraits" class="form-label">Personality Traits</label>
    <textarea class="form-control" id="personalityTraits" name="personalityTraits" rows="4" required></textarea>
</div>

<button type="submit" class="btn btn-primary">Add Character</button>

</form>

</div>


</@layout.page>