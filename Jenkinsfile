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
        stage('Run Docker Images') {
            steps {
                sh './gradlew composeUp'
            }
        }
        stage('Down containers') {
            steps {
                sh './gradlew composeDown'
            }
        }
    }
}
