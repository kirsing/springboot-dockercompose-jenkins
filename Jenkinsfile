pipeline {
    agent any
    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                sh 'gradle assemble'
            }
        }
        stage('Run Docker Images') {
            steps {
                sh 'docker-compose up'
            }
        }
    }
}
