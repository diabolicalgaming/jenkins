def buildApp() {
    // All environmental variables in Jenkinsfile are available in the groovy script
    echo "building version ${params.VERSION}"
}

// important to use 'return this' otherwise you cannot use inside Jenkinsfile
return this