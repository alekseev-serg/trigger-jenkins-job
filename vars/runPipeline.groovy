def call (){
    echo "Hello World"

    node() {
        def webhookpayload = readJSON text: env.JSON_PAYLOAD;
        echo "JSON: ${webhookpayload}"
    }
}