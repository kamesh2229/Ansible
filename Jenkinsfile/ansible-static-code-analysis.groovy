#!/usr/bin/env groovy

pipeline {
    agent any 

    stages {
        stage('Static Analysis') {
            steps {
                sh 'pwd'
                sh '/Users/eprkame/ansible/Ansible/ansible-static-code-analysis.sh'
    }
  }
 }
}
