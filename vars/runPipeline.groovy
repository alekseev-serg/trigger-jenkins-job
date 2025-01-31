def call (){
    echo "Hello World"

    node() {
        sh "env"
        def webhookpayload = readJSON text: env.JSON_PAYLOAD;
        echo "JSON: ${webhookpayload}"
    }
}
