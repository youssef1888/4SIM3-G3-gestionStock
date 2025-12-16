pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Récupération du code depuis GitHub'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Compilation du projet avec Maven'
                sh 'mvn clean compile'
            }
        }

        stage('Tests') {
            steps {
                echo 'Exécution des tests'
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo 'Pipeline terminé avec SUCCÈS'
        }
        failure {
            echo 'Pipeline en ÉCHEC'
        }
    }
}
