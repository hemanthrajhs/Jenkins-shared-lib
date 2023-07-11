// def call(String projects, String imageTag, String hubUser) {
//     withCredentials([usernamePassword(credentialsId: 'dockerimage', passwordVariable: 'pass', usernameVariable: 'user')]) {
//          sh "docker login -u '$USER' -p '$PASS'"
//     }
    
//     sh "docker image push ${hubUser}/${projects}:${imageTag}"
//     sh "docker image push ${hubUser}/${projects}:latest"
// }
def call(String appname, String region, String aws-account-id){

    sh"""
    aws ecr get-login-password --region {$region} | docker login --username AWS --password-stdin ${aws-account-id}.dkr.ecr.${region}.amazonaws.com
    docker push ${aws-account-id}.dkr.ecr.${region}.amazonaws.com/${appname}:latest
    """
}