#!/usr/bin/env groovy

def call() {
    pipeline {
        agent any

        stages {
            stage("Build") {
                agent {
                    docker {
                        image: "python:3.9.12"
                        reuseNode true
                    }
                }
                steps {
                    script {
                        echo "Hello Build"
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