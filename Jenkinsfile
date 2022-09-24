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
         stage('Test') {
            steps {
                sh './gradlew test'
            }
            stage('Clean') {
                        steps {
                            sh './gradlew clean'
                        }
        }
        stage('Build Docker Images') {
            steps {
                sh './gradlew composeBuild'
            }
        }
        stage('Run Docker Images') {
            steps {
                sh './gradlew composeUp'
            }
        }
    }
}