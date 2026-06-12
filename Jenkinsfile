pipeline {
    agent any

    stages {

        stage('FlightBooking') {
            steps {
                dir('FlightBookingFramework_Capstone') {
                    bat 'mvn clean test'
                }
            }
        }

        stage('GUIElementsAutomation') {
            steps {
                dir('GUIElementsAutomation') {
                    bat 'mvn clean test'
                }
            }
        }

        stage('ParaBank') {
            steps {
                dir('ParaBankCapstone') {
                    bat 'mvn clean test'
                }
            }
        }
    }
}