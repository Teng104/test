pipeline {
    agent { label "master" }
    stages{
        stage("test") {
            steps {
                echo "Hi"
                echo "GIT_BRANCH: ${env.GIT_BRANCH}"
                echo env.GIT_LOCAL_BRANCH 
            }
        }
    }
}
