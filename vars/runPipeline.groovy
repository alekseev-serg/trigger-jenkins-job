def call (){
    properties([
        parameters{
            string(name: 'JSON_PAYLOAD', description: 'Generic body state'),
        }
    ]), 
}