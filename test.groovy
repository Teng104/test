pipeline {
    agent { label "master" }
    stages{
        stage("test") {
            steps {
                echo "Hi, dev"
                echo env.GIT_BRANCH
                echo "Type 1: ${GIT_BRANCH##origin/}"
		echo "Type 2: ${GIT_BRANCH#*/}"
            }
        }
    }
}
