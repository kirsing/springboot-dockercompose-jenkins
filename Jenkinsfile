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
         stage('Initialize'){
         steps {
                env.PATH = "myDocker/bin:${env.PATH}"
            }
            }
        stage('Run Docker Images') {
            steps {
                sh 'docker compose up'
            }
        }
    }
}
