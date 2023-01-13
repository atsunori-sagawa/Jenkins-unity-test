pipeline {
    agent {
        // 指定したNodeでジョブ実行
        label "slave3"
    }

    stages {
        stage('Hello') {
            steps {
                sh 'echo "$WORKSPACE"'
            }
        }
    }
}
