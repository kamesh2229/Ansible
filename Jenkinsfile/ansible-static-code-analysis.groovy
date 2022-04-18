#!/usr/bin/env groovy

pipeline {
    agent any 
    tools {
      yq
      maven 'MAVEN_HOME'
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
                      for files in ${WORKSPACE}/*.yaml; do
                      yq $file
                      mvn
                      done;'''
    }
  }
 }
}
