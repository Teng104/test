pipeline {
    environment {
        is_master = (env.GIT_BRANCH != "origin/dev") ? "true" : "false"
    }
    agent { label "master" }
    stages{
        stage("test") {
            steps {
	        script {
		    str = (is_master.toBoolean()) ? "master" : "dev"
                    echo "Hi, ${str}"
                    echo env.GIT_BRANCH
		    git_branch = env.GIT_BRANCH.split("/")[env.GIT_BRANCH.split("/").length - 1]
		    echo git_branch
		}
            }
        }
    }
}
