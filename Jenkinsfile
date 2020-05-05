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
                 sh 'mvn clean compile'
               }
       }
       stage('Test'){
         steps{

          sh 'mvn test'
         // junit '**/build/test-reports/*.xml'

          }
       }

       stage('Package'){

        steps{
           sh 'mvn package'
        }

        }
   }
}
