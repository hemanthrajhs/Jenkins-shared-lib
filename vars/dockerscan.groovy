def call(String projects, String imageTag, String hubUser) {
    sh """
    trivy image ${hubUser}/${projects}:${imageTag} > scan.txt
    cat scan.txt
    """
}
