def call (){
    echo "Hello World"

    node() {
        def webhookpayload = readJSON text: env.JSON_PAYLOAD;
        echo "JSON: ${webhookpayload}"

        currentBuild.displayName =  '#' + env.BUILD_NUMBER;

        stage('Get code'){
            echo "Get SCM"
        }

        stage('Сборка'){
            echo "Build distrib"
        }

        stage('Deploy'){
            echo "Deploy"
        }
    }
}
