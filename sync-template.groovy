#!groovys

pipeline {

    options {
        timestamps()
        ansiColor('xterm')
    }
    agent { label 'master' }
    stages {

        stage('stage #2: get the list'){
            steps {
                    sh "echo hallo world"
            }
        }

    }
}
