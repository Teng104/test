pipeline {
    stages{
        stage("test") {
	    echo "Hi"
	    echo "GIT_BRANCH: $GIT_BRANCH"
	    echo GIT_LOCAL_BRANCH
	}
}
