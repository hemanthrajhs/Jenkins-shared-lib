// def call(String projects, String ImageTag, String hubUSER) {
//     sh """
//     docker build -t ${hubUSER}/${projects} .
//     docker tag ${hubUSER}/${projects} ${hubUSER}/${projects}:${ImageTag}
//     docker tag ${hubUSER}/${projects} ${hubUSER}/${projects}:latest
//     """
// }
def call(String appname, String region, String aws_account_id) {

    sh """
    
    docker build -t ${appname} .
    docker tag ${appname}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${appname}:latest
    
    """
}

