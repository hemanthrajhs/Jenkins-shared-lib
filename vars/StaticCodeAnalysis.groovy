def call(def something){
    withSonarQubeEnv(credentialsId: something) {
         sh 'mvn clean package sonar:sonar'
    }
}