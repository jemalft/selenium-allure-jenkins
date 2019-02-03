pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh '-Dmaven.test.failure.ignore=true clean verify'
            }
        }
    }
        stage('reports') {
            steps {
            script {
                   allure([
                    includeProperties: false,
                    jdk: '',
                    properties: [],
                    reportBuildPolicy: 'ALWAYS',
                    results: [[path: 'target/allure-results']]
                   ])
            }
        }
    }
}
