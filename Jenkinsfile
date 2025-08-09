pipeline {
    agent {label 'docker'}
    stages {
        stage('Docker build image') {
            steps {
                script {
                    sh 'docker build -t uadb:v1 .'
                }
            }
        }
    }
}