pipeline {
    agent { label "master" }
    stages{
        stage("test") {
            steps {
                echo "Hi, dev"
                echo env.GIT_BRANCH
		git_branch = env.GIT_BRANCH.split("/")[env.GIT_BRANCH.split("/").length - 1]
		echo git_branch
            }
        }
    }
}
