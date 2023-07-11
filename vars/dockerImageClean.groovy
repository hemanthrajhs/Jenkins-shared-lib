def call(String projects, String ImageTag, String hubUSER) {
    sh """
    
    docker rmi  ${hubUSER}/${projects}:${ImageTag}
    docker rmi  ${hubUSER}/${projects}:latest
    """
}