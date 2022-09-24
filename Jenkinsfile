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
         stage('Test') {
            steps {
                sh 'gradle test'
            }
        }
        stage('Build Docker Images') {
            steps {
                sh 'gradle composeBuild'
            }
        }
        stage('Run Docker Images') {
            steps {
                sh 'gradle composeUp'
            }
        }
    }
}