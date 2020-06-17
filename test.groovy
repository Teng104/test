pipeline {
    stages{
        stage("test") {
	    echo "Hi"
	    echo "Hello"
	}
    post {
        always {
	    emailext attachLog: false,
	    to: '$DEVOPS_TEAM_MAIL_LIST'
        }
    }
}
