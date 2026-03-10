// vars/buildDockerImage.groovy

def call(String imageName, String imageTag = "latest") {
    echo "========================================="
    echo " Building Docker Image: ${imageName}:${imageTag} "
    echo "========================================="
    tool mvnHome=tool 'M3'

    // Using the Jenkins sh step to run Docker
    bat "docker build -t ${imageName}:${imageTag} ."
    
    echo "========================================="
    echo " Docker Build Completed Successfully!    "
    echo "========================================="
}
