#!/usr/bin/env groovy

def call() {
    pipeline {
        agent any

        stages {
            stage("Build") {
                steps {
                    script {
                        echo "Hello Build"
                    }
                }
                
            }

            stage("Deploy") {
                steps {
                    script {
                        echo "Hello Deploy"
                    }
                }
                
            }
        }

        post {
            success {
                echo "Success"
            }

            failure {
                echo "Failure"
            }
        }
    }
}