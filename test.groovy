pipeline {
    agent { label "master" }
    stages{
        stage("test") {
            steps {
                echo "Hi, dev"
                echo env.GIT_BRANCH
                echo "GIT_LOCAL_BRANCH: ${env.GIT_LOCAL_BRANCH}"
		echo "GIT_BRANCH_LOCAL: ${env.GIT_BRANCH_LOCAL}"
            }
        }
    }
}
