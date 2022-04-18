#!/usr/bin/env groovy

pipeline {
    agent any 
    tools {
      yq  'yq 4.24.5'
      maven 'Maven 3.3.9' 
    }

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
                sh '''#!/bin/bash
                       export MAVEN_HOME=/opt/homebrew/Cellar/maven/3.8.5/libexec
                       export PATH=$PATH:$MAVEN_HOME/bin
                       for files in ${WORKSPACE}/*.yaml; do
                       yq $file
                       mvn
                       done;'''
    }
  }
 }
}
