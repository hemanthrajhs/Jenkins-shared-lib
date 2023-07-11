// def call(String projects, String imageTag, String hubUser) {
//     sh """
//     trivy image ${hubUser}/${projects}:${imageTag} > scan.txt
//     cat scan.txt
//     """
// }
def call(String appname, String region, String aws-account-id) {
     sh """
     trivy image ${aws-account-id}.dkr.ecr.${region}.amazonaws.com/${appname}:latest
     cat scan.txt
     """
}