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
        def dockerHome = tool 'myDocker'
        stage('Initialize'){
        env.PATH = "${dockerHome}/bin:${env.PATH}"
        }
        stage('Run Docker Images') {
            steps {
                sh 'docker-compose up'
            }
        }
    }
}
