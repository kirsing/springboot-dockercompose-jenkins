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
         stage('Push Docker image') {
                    steps {
                        sh 'docker login --username=kirsing98 --password=219528Kirs'
                        sh 'docker compose push kirsing98/my-jenkins:$BUILD_NUMBER'
                    }
                }
    }
}
