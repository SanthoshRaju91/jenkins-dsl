#!/usr/bin/env groovy

def call() {
    pipeline {
        agent any

        stages {
            stage("Build") {
                script {
                    echo "Hello Build"
                }
            }

            stage("Deploy") {
                script {
                    echo "Hello Deploy"
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