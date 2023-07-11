// def call(String projects, String imageTag, String hubUser) {
//     sh """
//     trivy image ${hubUser}/${projects}:${imageTag} > scan.txt
//     cat scan.txt
//     """
// }
def call(String appname, String region, String aws_account_id) {
     sh """
     trivy image ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${appname}:latest > scan.txt
     cat scan.txt
     """
}
