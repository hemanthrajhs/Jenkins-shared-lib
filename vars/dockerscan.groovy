def call(String projects, String imageTag, String hubUser) {
    sh """
    trivy image ${hubUser}/${projects}:$latest > scan.txt
    cat scan.txt
    """
}
