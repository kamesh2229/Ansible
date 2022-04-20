pipeline {
  agent  { 

      docker { image 'node:16.13.1-alpine' }
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
