pipeline {
agent any

```
stages {

    stage('Checkout') {
        steps {
            git branch: 'main',
            url: 'https://github.com/sumank97/Wipro_SDET_Capstone_Projects.git'
        }
    }

    stage('Execute Tests') {
        steps {
            dir('GUIElement_Capstone') {
                bat 'mvn clean test'
            }
        }
    }

    stage('Archive Report') {
        steps {
            archiveArtifacts artifacts: 'GUIElement_Capstone/reports/**/*', fingerprint: true
        }
    }
}

post {
    always {
        junit 'GUIElement_Capstone/test-output/junitreports/*.xml'
    }

    success {
        echo 'GUI Automation Framework Executed Successfully'
    }

    failure {
        echo 'Build Failed'
    }
}
```

}
