<#import "layout.ftlh" as layout>

<@layout.page title="Confirm Delete">

<div class="container mt-4">

    <div class="page-header">
        <h1>Delete Character?</h1>
    </div>

    <div class="about-body p-4 text-center">

        <h3>Are you sure you want to delete ${myChar.name}?</h3>

        <p>This action cannot be undone.</p>

        <div class="d-flex justify-content-center gap-3 mt-4">

            <form action="/characters/${myChar.characterId}/delete" method="post">
                <button type="submit" class="btn btn-danger">
                    Confirm Delete
                </button>
            </form>

            <a href="/characters/${myChar.characterId}" class="btn btn-dark">
                Cancel
            </a>

        </div>

    </div>

</div>

</@layout.page>