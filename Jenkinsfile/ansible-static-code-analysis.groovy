#!/usr/bin/env groovy

pipeline {
    agent any 

    stages {
        stage('Static Analysis') {
            steps {
                sh 'pwd'
                sh  'cd /Users/eprkame/ansible/Ansible' 
                sh '/Users/eprkame/ansible/Ansible/ansible-static-code-analysis.sh'
    }
  }
 }
}
