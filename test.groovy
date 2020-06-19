def isMaster() {
    return (env.GIT_BRANCH != "origin/dev")
}
pipeline {
    agent { label "master" }
    stages{
        stage("test") {
            steps {
                script {
                    job_suffix = isMaster() ? "" : "-Dev"
                    echo "OpenBMC${job_suffix}/Colin-Branch-Sub-Test${job_suffix}"
                    str = isMaster() ? "master" : "dev"
                    echo "Hi, ${str}"
                    echo env.GIT_BRANCH
                    git_branch = env.GIT_BRANCH.split("/")[env.GIT_BRANCH.split("/").length - 1]
                    echo git_branch
                    echo "Bye"
                }
            }
        }
    }
}
