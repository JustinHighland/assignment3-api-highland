<#import "layout.ftlh" as layout>


<@layout.page title="Iconic Sci-Fi Characters">

<div class="page-header">
    <h1>Iconic Sci-Fi Characters</h1>
    <p>Explore legendary characters from iconic science-fiction universes.</p>
</div>

<div class ="container-fluid">
    <div class="row g-4 justify-content-center">
      <#list characters as character>

                <div class="col-md-4">
                    <div class="card h-100">

                        <#if character.imageUrl?? && character.imageUrl?has_content>
                            <img src="${character.imageUrl}" class="card-img-top"
                                 style="height: 240px; object-fit: cover;">
                        <#else>
                            <img src="/images/placeholder.png" class="card-img-top"
                                 style="height: 240px; object-fit: cover;">
                        </#if>
</div>
</div>

   <div class="card-body">
                            <p class="card-text">
                                <strong>Name:</strong> ${character.name}<br>
                                <strong>Universe:</strong> ${character.franchise}<br>
                                <strong>Species:</strong> ${character.species}<br>
                                <strong>Abilities:</strong> ${character.abilities}
                            </p>

                            <a href="/characters/${character.characterId}"
                               class="btn btn-primary">
                                View Details
                            </a>
                        </div>

                    </div>
                </div>

            <#else>
                <p>No characters found.</p>
            </#list>

        </div>
    </div>

</@layout.page>
