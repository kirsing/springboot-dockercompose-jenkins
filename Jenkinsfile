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
        stage('Build images') {
            steps {
                sh 'docker compose build'
            }
        }
        stage('Run containers') {
            steps {
                sh 'docker compose up'
            }
        }
    }
}
