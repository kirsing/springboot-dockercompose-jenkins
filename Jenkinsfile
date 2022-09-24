pipeline {
    agent any
    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }
        stage('Run Docker Images') {
            steps {
                sh './gradlew composeUp'
            }
        }
    }
}
