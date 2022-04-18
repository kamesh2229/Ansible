#!/usr/bin/env groovy

pipeline {
    agent any 

    stages {
        stage('Checkout') {
         steps {
           script {
               git branch: 'main', url: 'https://github.com/kamesh2229/Ansible.git'
               sh "ls -lrt"
               sh "git branch -a"
             }
          }
        }
        stage('Static Analysis') {
            environment {
               CURR_DIR = sh 'pwd'
            }
            steps {
                sh 'pwd'
                sh "${CURR_DIR}/'Jenkinsfile/ansible-static-code-analysis.sh'"
    }
  }
 }
}
