def call(String projects,String ImageTag, String hubUSER){
    sh """
    Docker bulid -t ${hubUSER}/${projects} .
    Docker tag ${hubUSER}/${projects} ${hubUSER}/${projects}:{ImageTag}
    Docker tag ${hubUSER}/${projects} ${hubUSER}/${projects}:latest
    
    """
}