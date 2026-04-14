pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/ArunprasathGit/JenkinDemoProject.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install -DskipTests'
            }
        }
    }
}