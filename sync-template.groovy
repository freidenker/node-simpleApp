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
                    aws_account_id="Saw"
                    sh "echo saw account $aws_account_id"
                }else if(params.awsAccount=='sigma'){
                    aws_account_id="Sigma"
                    sh "echo sigma account $aws_account_id "
                }
              }
            }
        }

    }
}
