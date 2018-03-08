#!groovys

pipeline {

    options {
        timestamps()
        ansiColor('xterm')
    }
    agent { label 'builder05' }
    stages {

        stage('stage #2: get the list'){
            steps {
                    sh "echo hallo"
            }
        }

    }
}
