#!groovys
def aws_account_id

pipeline {

    agent { label 'master' }
    parameters {
      choice(choices: 'sigma\nsaw', description: 'aws account', name: 'awsAccount')
    }
    stages {

        stage('tell the account of aws'){
            steps {
              script{
                if(params.awsAccount=='saw'){
                    aws_account_id="saw"
                    sh "echo saw account"
                }else if(params.awsAccount=='sigma'){
                    aws_account_id="sigma"
                    sh "echo sigma account"
                }
              }
            }
        }

    }
}
