def call(String projects, String imageTag, String hubUser) {
    withCredentials([usernamePassword(credentialsId: 'dockerimage', passwordVariable: 'pass', usernameVariable: 'user')]) {
        sh 'docker login -u $user -p $pass'
    }
    
    sh "docker image push ${hubUser}/${projects}:${imageTag}"
    sh "docker image push ${hubUser}/${projects}:latest"
}
