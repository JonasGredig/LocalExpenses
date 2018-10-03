pipeline {
    agent {
        docker {
            image 'openjdk:8'
            args '-v $HOME/.gradle:/root/.gradle'
        }
    }

    stages {
        stage('Build') {
            steps {
                sh './gradlew clean test'
            }
        }
    }

    post {
        always {
            junit 'build/test-results/**/*.xml'
        }
    }
}