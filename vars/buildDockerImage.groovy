// vars/buildDockerImage.groovy

def call(String imageName, String imageTag = "latest") {
    echo "========================================="
    echo " Building Docker Image: ${imageName}:${imageTag} "
    echo "========================================="

    // Using the Jenkins sh step to run Docker
    sh "docker build -t ${imageName}:${imageTag} ."
    
    echo "========================================="
    echo " Docker Build Completed Successfully!    "
    echo "========================================="
}
