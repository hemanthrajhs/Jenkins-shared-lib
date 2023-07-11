def call(String projects, String imageTag, String hubUser) {
    sh """
    trivy image  ${hubUSER}/${projects}:latest > scan.txt
    cat scan.txt
    """
}
