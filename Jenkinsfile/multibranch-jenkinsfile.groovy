pipeline {
  agent any

  tools {
      maven 'Maven 3.1.8'
  } 
  
  options {

    buildDiscarder logRotator(artifactDaysToKeepStr: '', 
  artifactNumToKeepStr: '5', daysToKeepStr: '', numToKeepStr: '5')

}

 stages {

   stage('Hello') {

    steps {

      sh ''' 

       java -version
       mvn -version
       ansible -version

       '''

    }

   }

  }
}
