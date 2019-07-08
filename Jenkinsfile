def username= 'jwen'

pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        bat 'mvn --version'
      }
    }
    stage('test'){
      steps{
        bat 'echo "test pass"'
      }
    }
    stage('after test'){
      steps{
        bat 'echo "after 1"'
        bat 'echo "after 2"'
      }
    }
    stage('deploy test env'){
      steps{
        bat 'echo "deploy test env"'
      }
    }
    stage('Sanity check') {
            steps {
                input "Does the test environment look ok?"
            }
      }
    stage('Deploy - Production') {
            steps {
                bat 'echo "deploy Production env"'
            }
      }
  }
}
