<#macro page title>

<!DOCTYPE html>

<html lang="en"> <head> <meta charset="UTF-8"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
<title>${title}</title>

<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
    rel="stylesheet">

<link rel="stylesheet" href="/Visual.css">

</head> <body>

<nav class="navbar navbar-dark bg-dark">
    <div class="container-fluid">

        <div class="navbar-nav d-flex flex-row gap-5">
            <a class="nav-link text-white" href="/">Home</a>
            <a class="nav-link text-white" href="/about">About</a>
            <a class="nav-link text-white" href="/characters/new">Add a Character</a>
        </div>

    </div>
</nav>

<div class="container mt-4">

    <#if successMessage??>
        <div class="alert alert-success alert-dismissible fade show" role="alert">
            ${successMessage}
            <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
        </div>
    </#if>

    <#nested>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body> </html> </#macro>