
// vars/buildMavenApp.groovy

def call(Map config = [:]) {
    // We use a Map (config) so developers can pass custom parameters, 
    // but we can provide defaults if they don't!
    def skipTests = config.get('skipTests', false)
    def mavenGoals = skipTests ? "clean package -DskipTests" : "clean package"

    echo "========================================="
    echo " Starting Maven Build via Shared Library "
    echo "========================================="

    // The actual Jenkins pipeline step
    sh "mvn ${mavenGoals}"
    
    echo "========================================="
    echo " Maven Build Completed Successfully!     "
    echo "========================================="
}

