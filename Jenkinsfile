pipeline {
    agent any
    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                sh './gradlew assemble'
            }
        }
        stage('Run containers') {
            steps {
                sh 'docker compose up --build'
            }
        }
    }
}
