pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'sh "gcc jenkins.c -o jenkins"'
      }
    }
    stage('Run') {
      steps {
        sh 'sh "./jenkins"'
      }
    }
  }
}