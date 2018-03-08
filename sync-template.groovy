#!groovys

pipeline {

    agent { label 'master' }
    stages {

        stage('stage #2: get the list'){
            steps {
                    sh "echo hallo world sommer zwei drei vier funf"
            }
        }

    }
}
