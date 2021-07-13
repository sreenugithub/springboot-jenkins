pipeline {
    agent any
    stages {
        stage('git repo & clean') {
            steps {
               bat "rmdir  /s /q springboot-jenkins"
                bat "git clone https://github.com/sreenugithub/springboot-jenkins.git"
                bat "mvn clean -f springboot-jenkins"
            }
        }
        stage('install') {
            steps {
                bat "mvn install -f springboot-jenkins"
            }
        }
        stage('test') {
            steps {
                bat "mvn test -f springboot-jenkins"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f springboot-jenkins"
            }
        }
    }
}
