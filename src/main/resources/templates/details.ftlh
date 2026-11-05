<#import "layout.ftlh" as layout>

<@layout.page title="${myChar.name} - Character Details">

    <div class="container">

    <div class="page-header">
    <h1>${myChar.name}</h1>
    <p>${myChar.franchise}</p>
    </div> 

    <div class="row">
        
    <div class="col-md-6 character-info">
      <#if myChar.imageUrl?? && myChar.imageUrl?has_content>
                <img src="${myChar.imageUrl}"
                     class="img-fluid rounded character-image"
                     style="width: 100%; height: 600px; object-fit: cover;">
            <#else>
                <img src="/images/placeholder.svg"
                     class="img-fluid rounded character-image"
                     style="width: 100%; height: 600px; object-fit: cover;">
            </#if>
            </div>


        <div class="col-md-6 character-info">
            <h2>Backstory</h2>
            <p>${myChar.description}
            </p>

            <h2>Franchise</h2>
            <p>${myChar.franchise}
            </p>

            <h2>Species</h2>
            <p>${myChar.species}
            </p>

            <h2>Abilities</h2>
            <p>${myChar.abilities}
            </p>

            <h2>First Appearance</h2>
            <p>${myChar.firstAppearance}</p>

            <h2>Personality Traits</h2>
            <p>${myChar.personalityTraits}
             </div>

    </div>

    <div class="mt-4 mb-4 d-flex gap-2">

        <a href="/" class="btn btn-dark">Back to Gallery</a>

        <a href="/characters/${myChar.characterId}/edit"
           class="btn btn-primary">Edit Character</a>

       <a href="/characters/${myChar.characterId}/delete"
            class="btn btn-danger">Delete Character</a>
        </form>

    </div>

</div>

</@layout.page>