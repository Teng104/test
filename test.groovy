pipeline {
    agent { label "master" }
    stages{
        stage("test") {
            steps {
                echo "Hi, dev"
                echo env.GIT_BRANCH
                echo "Type 1: ${env.GIT_BRANCH##origin/}"
		echo "Type 2: ${env.GIT_BRANCH#*/}"
            }
        }
    }
}
