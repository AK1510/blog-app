pipeline {
   agent { label 'linux'}
tools{
    maven 'M3'
  }
   stages {
      stage('Checkout') {
         steps {
            git 'https://github.com/AK1510/blog-app.git'
         }
      }
       stage('Build') {
               steps {
                 sh 'mvn --version'
               }
            }

   }
}
