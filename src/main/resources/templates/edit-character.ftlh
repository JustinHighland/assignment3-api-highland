<#import "layout.ftlh" as layout>
<@layout.page title="Edit Character">


<div class="container mt-4">

    <div class="page-header">
        <h1>Edit Character</h1>
    </div>

    <form action="/characters/${myChar.characterId}" method="post">

         <div class="mb-3">
        <label for="characterName" class="form-label">Character Name</label>
        <input type="text" class="form-control" 
        id="characterName" name="name" 
        value="${myChar.name!''}" required>
        </div>

        <div class="mb-3">
        <label for="franchise" class="form-label">Franchise</label>
        <input type="text" class="form-control"
               id="franchise" name="franchise"
               value="${myChar.franchise!''}" required>
        </div>

        <div class="mb-3">
    <label for="species" class="form-label">Species</label>
    <input type="text" class="form-control"
           id="species" name="species"
           value="${myChar.species!''}" required>
    </div>

    <div class="mb-3">
    <label for="imageUrl" class="form-label">Image URL</label>
    <input type="url" class="form-control"
           id="imageUrl" name="imageUrl"
           value="${myChar.imageUrl!''}">
    </div>

    <div class="mb-3">
    <label for="abilities" class="form-label">Abilities</label>
    <textarea class="form-control" id="abilities"
              name="abilities" rows="4" required>${myChar.abilities!''}</textarea>
    </div>

    <div class="mb-3">
    <label for="firstAppearance" class="form-label">First Appearance</label>
    <textarea class="form-control" id="firstAppearance"
              name="firstAppearance" rows="4" required>${myChar.firstAppearance!''}</textarea>
    </div>

    <div class="mb-3">
    <label for="personalityTraits" class="form-label">Personality Traits</label>
    <textarea class="form-control" id="personalityTraits"
              name="personalityTraits" rows="4" required>${myChar.personalityTraits!''}</textarea>
    </div>

    <button type="submit" class="btn btn-primary">Save Changes</button>



    </form>

</@layout.page>