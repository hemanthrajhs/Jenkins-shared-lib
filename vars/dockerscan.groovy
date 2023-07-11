def call(String projects, String ImageTag, String hubUSER) {
    sh """

    trivy image ${hubUSER}/${projects} ${hubUSER}/${projects}:latest > scan.txt
    cat scan.txt
    """
}
