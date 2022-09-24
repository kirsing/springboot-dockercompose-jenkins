pipeline {
    agent {
            docker { image 'node:16.13.1-alpine' }
        }
    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                sh './gradlew assemble'
            }
        }
        stage('Run Docker Images') {
            steps {
                sh 'docker compose up'
            }
        }
    }
}
