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
            steps {
                sh 'pwd'
                sh 'ansible-playbook -i hosts deploy-jenkins.yaml --private-key ../../Downloads/ansible-ec2-instance.pem'

    }
  }
 }
}
