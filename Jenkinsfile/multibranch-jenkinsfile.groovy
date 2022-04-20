pipeline {
  agent { image 'node:16.13.1-alpine' }
}

  
  options {

    buildDiscarder logRotator(artifactDaysToKeepStr: '', 
  artifactNumToKeepStr: '5', daysToKeepStr: '', numToKeepStr: '5')

}

 stages {

   stage('Hello') {

    steps {

      sh ''' 
       node --version
       java -version

       '''

    }

   }

  }
