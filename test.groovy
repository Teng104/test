def isMaster() {
    return (env.GIT_BRANCH != "origin/dev")
}
def jobSuffix = ""
jobsuffix = isMaster() ? "" : "-Dev"
pipeline {
    agent { label "master" }
    stages{
        stage("test") {
            steps {
	        script {
		    echo "${jobSuffix}"
		    build job: "OpenBMC${jobSuffix}/Colin-Branch-Sub-Test${jobSuffix}"
		    str = isMaster() ? "master" : "dev"
                    echo "Hi, ${str}"
                    echo env.GIT_BRANCH
		    git_branch = env.GIT_BRANCH.split("/")[env.GIT_BRANCH.split("/").length - 1]
		    echo git_branch
		}
            }
        }
    }
}
