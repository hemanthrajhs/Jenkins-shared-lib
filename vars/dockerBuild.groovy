def call(String projects, String ImageTag, String hubUSER) {
    sh """
    docker build -t ${hubUSER}/${projects} .
    docker tag ${hubUSER}/${projects} ${hubUSER}/${projects}:${ImageTag}
    docker tag ${hubUSER}/${projects} ${hubUSER}/${projects}:latest
    """
}
