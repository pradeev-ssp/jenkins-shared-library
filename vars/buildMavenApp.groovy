
// vars/buildMavenApp.groovy

def call(Map config = [:]) {
    // We use a Map (config) so developers can pass custom parameters, 
    // but we can provide defaults if they don't!
    def skipTests = config.get('skipTests', false)
    def mavenGoals = skipTests ? "clean package -DskipTests" : "clean package"

    echo "========================================="
    echo " Starting Maven Build via Shared Library "
    echo "========================================="
// The DevOps Fix: Ask Jenkins to provide the Maven installation path
    def mvnHome = tool 'M3'

    // Use that exact path to run the command
    bat "${mvnHome}\\bin\\mvn ${mavenGoals}"
    
    echo "========================================="
    echo " Maven Build Completed Successfully!     "
    echo "========================================="
}

