pipeline {
    agent { label "master" }
    stages{
        stage("test") {
            steps {
<<<<<<< HEAD
                echo "Hi"
                echo "GIT_BRANCH: ${env.GIT_BRANCH}"
                echo env.GIT_LOCAL_BRANCH 
=======
	        script {
                    echo "Hi, dev"
                    echo env.GIT_BRANCH
		    git_branch = env.GIT_BRANCH.split("/")[env.GIT_BRANCH.split("/").length - 1]
		    echo git_branch
		}
>>>>>>> 82c90e7... Branch variable test - add script
            }
        }
    }
}
