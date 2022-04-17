#!/usr/bin/env groovy

pipeline {
    agent any 

    stages {
        stage('Static Analysis') {
            steps { 
                sh 'ansible-static-code-analysis.sh'
    }
  }
 }
}
