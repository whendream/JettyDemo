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
  }
}
