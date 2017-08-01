pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        sh '''git 'https://github.com/wangzy23/jenkins-pipeline.git'
'''
      }
    }
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